grammar Pmm;	
@header{
    import ast.*;
    import ast.definitions.*;
    import ast.statements.*;
    import ast.expressions.*;
    import ast.types.*;
    import errorhandler.ErrorHandler;
}

program returns[Program ast] locals[List<Definition> definitions=new ArrayList<>()]:
            (d=definition{$definitions.addAll($d.ast);})* main=main_function{$definitions.add($main.ast);} EOF
            {$ast=new Program($definitions);}
;
definition returns [List<Definition> ast=new ArrayList<>()]:
            v=var_definition {$ast.addAll($v.ast);}
        |   f=function_definition{$ast.add($f.ast);}
;
main_function returns [FunctionDef ast] locals[List<VariableDef> params=new ArrayList<>(),List<VariableDef> vars=new ArrayList<>(),List<Statement> body=new ArrayList<>()]:
            'def'MAIN='main''('')'':''{'
            (inline=inline_var_definition{$vars.addAll($inline.def); $body.addAll($inline.st);})*
            (s=statement{$body.addAll($s.ast);})*'}'
            {
            FunctionType ft=new FunctionType($MAIN.getLine(),$MAIN.getCharPositionInLine()+1,VoidType.getInstance(),$params);
            $ast=new FunctionDef($MAIN.getLine(),$MAIN.getCharPositionInLine()+1,$MAIN.text,ft,$vars,$body);
            }
;
var_definition returns[List<VariableDef> ast]:
    v=var_definition_aux';'{$ast=$v.ast;}
;
inline_var_definition returns[List<VariableDef> def, List<Statement> st]:
    v=inline_var_definition_aux';'{$def=$v.def;$st=$v.st;}
;
inline_var_definition_aux returns[List<VariableDef> def = new ArrayList<VariableDef>(),List<Statement> st=new ArrayList<>()] locals [List<VariableDef> vars=new ArrayList<>();]:
            id1=ID{
                VariableDef var=new VariableDef($id1.getLine(),$id1.getCharPositionInLine()+1,$id1.text,null);
                if($vars.contains(var)){
                    new ErrorType($id1.getLine(),$id1.getCharPositionInLine()+1,"Variable repeated: "+$id1.text);
                }else{
                    $vars.add(var);
                }
            }
            (','id2=ID{
                var=new VariableDef($id2.getLine(),$id2.getCharPositionInLine()+1,$id2.text,null);
                if($vars.contains(var)){
                     new ErrorType($id2.getLine(),$id2.getCharPositionInLine()+1,"Variable repeated: "+$id2.text);
                }
                else{
                    $vars.add(var);
                }
            })*
            ':'t=type
            {
                for(VariableDef v:$vars){
                    $def.add(new VariableDef(v.getLine(),v.getColumn()+1,v.getName(),$t.ast));
                }
            }
            ('='expression
            {
                for(VariableDef v: $def){
                    $st.add(new Asignment(v.getLine(),v.getColumn()+1,new Variable(v.getLine(), v.getColumn()+1, v.getName()), $expression.ast));
                }

            })?
;
var_definition_aux returns[List<VariableDef> ast = new ArrayList<VariableDef>()] locals [List<VariableDef> vars=new ArrayList<>();]:
            id1=ID{
                VariableDef var=new VariableDef($id1.getLine(),$id1.getCharPositionInLine()+1,$id1.text,null);
                if($vars.contains(var)){
                    new ErrorType($id1.getLine(),$id1.getCharPositionInLine()+1,"Variable repeated: "+$id1.text);
                }else{
                    $vars.add(var);
                }
            }
            (','id2=ID{
                var=new VariableDef($id2.getLine(),$id2.getCharPositionInLine()+1,$id2.text,null);
                if($vars.contains(var)){
                     new ErrorType($id2.getLine(),$id2.getCharPositionInLine()+1,"Variable repeated: "+$id2.text);
                }
                else{
                    $vars.add(var);
                }
            })*
            ':'t=type
            {
                for(VariableDef v:$vars){
                    $ast.add(new VariableDef(v.getLine(),v.getColumn()+1,v.getName(),$t.ast));
                }
            }
;
function_definition returns[FunctionDef ast] locals[List<VariableDef> params=new ArrayList<>(), List<VariableDef> vars=new ArrayList<>(), List<Statement> body=new ArrayList<>(), Type returnType=VoidType.getInstance()]:
            'def'ID'('(v1=var_definition_aux{$params.addAll($v1.ast);}(','(v2=var_definition_aux{$params.addAll($v2.ast);}))*)?')'':'(t1=type{$returnType=$t1.ast;})?'{'
             (inline=inline_var_definition{$vars.addAll($inline.def); $body.addAll($inline.st);})*
            (s=statement{$body.addAll($s.ast);})*('return't2=type';')?'}'
            {
                FunctionType ft=new FunctionType($ID.getLine(),$ID.getCharPositionInLine()+1,$returnType,$params);
                $ast=new FunctionDef($ID.getLine(),$ID.getCharPositionInLine()+1,$ID.text,ft,$vars,$body);
            }
;
statement returns [List<Statement> ast=new ArrayList<>();] locals[List<Statement> elseBody=new ArrayList<Statement>()]:
            'print'e1=expression{$ast.add(new Print($e1.ast.getLine(),$e1.ast.getColumn()+1,$e1.ast));}(','e2=expression{$ast.add(new Print($e2.ast.getLine(),$e2.ast.getColumn()+1,$e2.ast));})*';'
        |   'input'e1=expression{$ast.add(new Input($e1.ast.getLine(),$e1.ast.getColumn()+1,$e1.ast));}(','e2=expression{$ast.add(new Input($e2.ast.getLine(),$e2.ast.getColumn()+1,$e2.ast));})*';'
        |   assignment';'{$ast.add($assignment.ast);}
        |   IF='if'e=expression':'(ifBody=body_aux)('else'':'(elseBody_aux=body_aux){$elseBody=$elseBody_aux.ast;})?{$ast.add(new Conditional($IF.getLine(),$IF.getCharPositionInLine()+1,$e.ast,$ifBody.ast,$elseBody));}
        |   W='while'e=expression':'body=body_aux{$ast.add(new While($W.getLine(),$W.getCharPositionInLine()+1,$e.ast,$body.ast));}
        |   F='for''('init=assignment';'cond=expression';'change=assignment')'':'body=body_aux{$ast.add(new For($F.getLine(),$F.getCharPositionInLine()+1,$init.ast,$cond.ast,$change.ast,$body.ast));}
        |   R='return'e=expression';'{$ast.add(new Return($R.getLine(),$R.getCharPositionInLine()+1,$e.ast));}
        |   e1=expression'('p=params_aux')'';'{$ast.add(new FunctionCall($e1.ast.getLine(),$e1.ast.getColumn()+1,new Variable($e1.ast.getLine(), $e1.ast.getColumn()+1, $e1.text),$p.ast));}
        ;
assignment returns [Statement ast]:
        a=assignment_aux{$ast=$a.ast;}
;
assignment_aux returns [Asignment ast]:
    <assoc=right>e1=expression OP='=' a=assignment_aux{$ast=new Asignment($OP.getLine(),$OP.getCharPositionInLine()+1,$e1.ast,$a.ast);}
    |
    <assoc=right>e1=expression OP='=' e2=expression{$ast=new Asignment($OP.getLine(),$OP.getCharPositionInLine()+1,$e1.ast,$e2.ast);}
;
params_aux returns [List<Expression> ast = new ArrayList<>()]:
    (e1=expression{$ast.add($e1.ast);}(','e2=expression{$ast.add($e2.ast);})*)?
;
body_aux returns [List<Statement> ast = new ArrayList<>()]:
    '{'(s1=statement{$ast.addAll($s1.ast);})*'}'| s2=statement{$ast.addAll($s2.ast);}
;
expression returns [Expression ast] locals [List<Expression> params=new ArrayList<>()]:
            INT_CONSTANT {$ast=new IntLiteral($INT_CONSTANT.getLine(),$INT_CONSTANT.getCharPositionInLine()+1,LexerHelper.lexemeToInt($INT_CONSTANT.text));}
        |   REAL_CONSTANT {$ast=new DoubleLiteral($REAL_CONSTANT.getLine(),$REAL_CONSTANT.getCharPositionInLine()+1,LexerHelper.lexemeToReal($REAL_CONSTANT.text));}
        |   CHAR_CONSTANT {$ast=new CharLiteral($CHAR_CONSTANT.getLine(),$CHAR_CONSTANT.getCharPositionInLine()+1,LexerHelper.lexemeToChar($CHAR_CONSTANT.text));}
        |   BOOLEAN_CONSTANT {$ast=new BooleanLiteral($BOOLEAN_CONSTANT.getLine(),$BOOLEAN_CONSTANT.getCharPositionInLine()+1,LexerHelper.lexemeToBoolean($BOOLEAN_CONSTANT.text));}
        |   ID {$ast=new Variable($ID.getLine(),$ID.getCharPositionInLine()+1,$ID.text);}
        |   e1=expression'('(e2=expression{$params.add($e2.ast);}(','e3=expression {$params.add($e3.ast);})*)?')'
            {$ast = new FunctionCall($e1.ast.getLine(), $e1.ast.getColumn()+1, new Variable($e1.ast.getLine(), $e1.ast.getColumn()+1, $e1.text), $params);}
        |   '('e=expression')'{$ast=$e.ast;}
        |   e1=expression'['e2=expression']'{$ast=new ArrayAccess($e2.ast.getLine(),$e2.ast.getColumn()+1,$e1.ast,$e2.ast);}
        |   e=expression'.'ID{$ast=new StructAccess($ID.getLine(), $ID.getCharPositionInLine()+1,$e.ast,$ID.text);}
        |   '('t=type')'e=expression {$ast=new Cast($t.ast.getLine(),$t.ast.getColumn()+1,$e.ast,$t.ast);}
        |   OP='-'e=expression{$ast=new UnaryMinus($OP.getLine(),$OP.getCharPositionInLine()+1,$e.ast);}
        |   OP='!'e=expression{$ast=new UnaryNot($OP.getLine(),$OP.getCharPositionInLine()+1,$e.ast);}
        |   e1=expression OP=('*'|'/'|'%') e2=expression{$ast=new Arithmetic($OP.getLine(),$OP.getCharPositionInLine()+1,$e1.ast,$e2.ast,$OP.text);}
        |   e1=expression OP=('+'|'-') e2=expression{$ast=new Arithmetic($OP.getLine(),$OP.getCharPositionInLine()+1,$e1.ast,$e2.ast,$OP.text);}
        |   e1=expression OP=('>'|'>'|'<'|'<='|'>='|'!='|'==') e2=expression{$ast=new Comparator($OP.getLine(),$OP.getCharPositionInLine()+1,$e1.ast,$e2.ast,$OP.text);}
        |   e1=expression OP=('&&'|'||') e2=expression{$ast=new Logical($OP.getLine(),$OP.getCharPositionInLine()+1,$e1.ast,$e2.ast,$OP.text);}
;

type returns [Type ast] locals[List<RecordField> records=new ArrayList<>()]:
        'int' {$ast=IntType.getInstance();}
    |   'double'{$ast=DoubleType.getInstance();}
    |   'char'{$ast=CharType.getInstance();}
    |   'boolean'{$ast=BooleanType.getInstance();}
    |   '['INT_CONSTANT']'t=type{$ast=new ArrayType($t.ast.getLine(),$t.ast.getColumn()+1,LexerHelper.lexemeToInt($INT_CONSTANT.text),$t.ast);}
    |   STRUCT='struct''{'(v=var_definition
        {
            for(VariableDef vdef:$v.ast){
                RecordField record=new RecordField(vdef.getLine(), vdef.getColumn()+1, vdef.getName(),vdef.getType());
                if($records.contains(record)){
                    new ErrorType(vdef.getLine(),vdef.getColumn()+1,"Struct field repeated: "+vdef.getName());
                }
                else{
                    $records.add(record);
                }
            }
        }
        )*'}'{$ast=new StructType($STRUCT.getLine(),$STRUCT.getCharPositionInLine(),$records);}
;

/* LEXER PATTERNS */

TRASH: ([ \n\r\t]|COMMENT) -> skip
;

INT_CONSTANT:   [1-9][0-9]*|'0'
;

REAL_CONSTANT:  (INT_CONSTANT'.'[0-9]*)
|               (INT_CONSTANT?'.'[0-9]+)
|               (INT_CONSTANT|(INT_CONSTANT'.'[0-9]*)|(INT_CONSTANT?'.'[0-9]+))('e'|'E')('+'|'-')?(INT_CONSTANT)
;
BOOLEAN_CONSTANT:   'true'|'false'
;

COMMENT:    '#'.*?('\n'|EOF)
|           '"""'.*?'"""'
;

CHAR_CONSTANT:   '\''(
|          '\\'INT_CONSTANT
|           '\\t'
|           '\\n'
|           .
        )'\''
;
ID:  ([a-zA-Z]|'_')([a-zA-Z0-9]|'_')*
;

