grammar Pmm;	
@header{
    import ast.*;
    import ast.definitions.*;
    import ast.statements.*;
    import ast.expressions.*;
    import ast.types.*;
}

program returns[Program ast] locals[List<Definition> definitions=new ArrayList<>()]:
            (d=definition{$definitions.addAll($d.ast);})* main=main_function{$definitions.add($main.ast);} EOF
            {$ast=new Program($definitions);}
;
definition returns [List<Definition> ast=new ArrayList<>()]:
            v=var_definition {$ast.addAll($v.ast);}
        |   f=function_definition{$ast.add($f.ast);}
;
main_function returns [FunctionDef ast] locals[List<VariableDef> params=new ArrayList<>(),List<Statement> body=new ArrayList<>()]:
            'def'MAIN='main''('')'':''{'  (v=var_definition{$params.addAll($v.ast);})*(s=statement{$body.addAll($s.ast);})*'}'
            {$ast=new FunctionDef($MAIN.getLine(),$MAIN.getCharPositionInLine()+1,$MAIN.text,VoidType.getInstance(),$params,$body);}
;
var_definition returns[List<VariableDef> ast]:
    v=var_definition_aux';'{$ast=$v.ast;}
;
var_definition_aux returns[List<VariableDef> ast = new ArrayList<VariableDef>()] locals [List<VariableDef> vars=new ArrayList<>();]:
            id1=ID{ $vars.add(new VariableDef($id1.getLine(),$id1.getCharPositionInLine()+1,$id1.text,null));}
            (','id2=ID{ $vars.add(new VariableDef($id2.getLine(),$id1.getCharPositionInLine()+1,$id2.text,null));})*
            ':'t=type
            {
                for(VariableDef v:$vars){
                    $ast.add(new VariableDef(v.getLine(),v.getColumn()+1,v.getName(),$t.ast));
                }
            }
;
function_definition returns[FunctionDef ast] locals[List<VariableDef> params=new ArrayList<>(), List<Statement> body=new ArrayList<>(), Type returnType=VoidType.getInstance()]:
            'def'ID'('(v1=var_definition_aux{$params.addAll($v1.ast);}(','(v2=var_definition_aux{$params.addAll($v2.ast);}))*)?')'':'(t1=type{$returnType=$t1.ast;})?'{'
            (v3=var_definition{$params.addAll($v3.ast);})*(s=statement{$body.addAll($s.ast);})*('return't2=type';')?'}'
            {$ast=new FunctionDef($ID.getLine(),$ID.getCharPositionInLine()+1,$ID.text,$returnType,$params,$body);}
;
statement returns [List<Statement> ast=new ArrayList<>();] locals[List<Statement> elseBody=new ArrayList<Statement>()]:
            'print'e1=expression{$ast.add(new Print($e1.ast.getLine(),$e1.ast.getColumn()+1,$e1.ast));}(','e2=expression{$ast.add(new Print($e2.ast.getLine(),$e2.ast.getColumn()+1,$e2.ast));})*';'
        |   'input'e1=expression{$ast.add(new Input($e1.ast.getLine(),$e1.ast.getColumn()+1,$e1.ast));}(','e2=expression{$ast.add(new Input($e2.ast.getLine(),$e2.ast.getColumn()+1,$e2.ast));})*';'
        |   e1=expression OP='=' e2=expression';'{$ast.add(new Asignment($OP.getLine(),$OP.getCharPositionInLine()+1,$e1.ast,$e2.ast));}
        |   IF='if'e=expression':'(ifBody=body_aux)('else'':'(elseBody_aux=body_aux){$elseBody=$elseBody_aux.ast;})?{$ast.add(new Conditional($IF.getLine(),$IF.getCharPositionInLine()+1,$e.ast,$ifBody.ast,$elseBody));}
        |   W='while'e=expression':'body=body_aux{$ast.add(new While($W.getLine(),$W.getCharPositionInLine()+1,$e.ast,$body.ast));}
        |   R='return'e=expression';'{$ast.add(new Return($R.getLine(),$R.getCharPositionInLine()+1,$e.ast));}
        |   e1=expression'('p=params_aux')'';'{$ast.add(new FunctionCall($e1.ast.getLine(),$e1.ast.getColumn()+1,new Variable($e1.ast.getLine(), $e1.ast.getColumn()+1, $e1.text),$p.ast));}
        |   st=statement'('')'';'{$ast.add(new FunctionCall($e1.ast.getLine(),$e1.ast.getColumn()+1,new Variable($e1.ast.getLine(), $e1.ast.getColumn()+1, $e1.text),new ArrayList<Expression>()));}
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
        |   ID {$ast=new Variable($ID.getLine(),$ID.getCharPositionInLine()+1,$ID.text);}
        |   e1=expression'('(e2=expression{$params.add($e2.ast);}(','e3=expression {$params.add($e3.ast);})*)?')'
            {$ast = new FunctionCall($e1.ast.getLine(), $e1.ast.getColumn()+1, new Variable($e1.ast.getLine(), $e1.ast.getColumn()+1, $e1.text), $params);}
        |   '('e=expression')'{$ast=$e.ast;}
        |   e1=expression'['e2=expression']'{$ast=new ArrayAccess($e2.ast.getLine(),$e2.ast.getColumn()+1,$e1.ast,$e2.ast);}
        |   e=expression'.'ID{$ast=new StructAccess($ID.getLine(), $ID.getCharPositionInLine()+1,$e.ast,$ID.text);}
        |   '('t=type')'e=expression {$ast=new Cast($t.ast.getLine(),$t.ast.getColumn()+1,$e.ast,$t.ast);}
        |   OP='-'e=expression{$ast=new UnaryMinus($OP.getLine(),$OP.getCharPositionInLine()+1);}
        |   OP='!'expression{$ast=new UnaryNot($OP.getLine(),$OP.getCharPositionInLine()+1);}
        |   e1=expression OP=('*'|'/'|'%') e2=expression{$ast=new Arithmetic($OP.getLine(),$OP.getCharPositionInLine()+1,$e1.ast,$e2.ast,$OP.text);}
        |   e1=expression OP=('+'|'-') e2=expression{$ast=new Arithmetic($OP.getLine(),$OP.getCharPositionInLine()+1,$e1.ast,$e2.ast,$OP.text);}
        |   e1=expression OP=('>'|'>'|'='|'<'|'<='|'>='|'!='|'==') e2=expression{$ast=new Comparator($OP.getLine(),$OP.getCharPositionInLine()+1,$e1.ast,$e2.ast,$OP.text);}
        |   e1=expression OP=('&&'|'||') e2=expression{$ast=new Logical($OP.getLine(),$OP.getCharPositionInLine()+1,$e1.ast,$e2.ast,$OP.text);}
;

type returns [Type ast] locals[List<RecordField> records=new ArrayList<>()]:
        'int' {$ast=IntType.getInstance();}
    |   'double'{$ast=DoubleType.getInstance();}
    |   'char'{$ast=CharType.getInstance();}
    |   '['INT_CONSTANT']'t=type{$ast=new ArrayType($t.ast.getLine(),$t.ast.getColumn()+1,LexerHelper.lexemeToInt($INT_CONSTANT.text),$t.ast);}
    |   STRUCT='struct''{'(v=var_definition
        {
            for(VariableDef vdef:$v.ast){
                $records.add(new RecordField(vdef.getLine(), vdef.getColumn()+1, vdef.getName(),vdef.getType()));
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

