grammar Pmm;	
@header{
    import ast.*;
    import ast.definitions.*;
    import ast.statements.*;
    import ast.expressions.*;
    import ast.types.*;
}
/*
rule returns [ASTNode ast(=initialization)?] locals [Type variable (=initialization)?]
nt=
*/

program returns[Program ast]:
            definition* main_function EOF
;
definition:
            var_definition
        |   function_definition
        |   main_function
;
main_function:
            'def''main''('')'':''{'var_definition*statement*'}'
;
var_definition:
            expression(','expression)*':'type';'
;
function_definition:
            'def'ID'('(expression(','expression)*':'type(','(expression(','expression)*':'type))*)?')'':'type?'{'var_definition*statement*('return'type';')?'}'
;
statement :
            'print'expression(','expression)*';'
        |   'input'expression(','expression)*';'
        |   expression'='expression';'
        |   'if'expression':'('{'statement*'}'|statement)('else'':'('{'statement*'}'|statement))?
        |   'while'expression':''{'statement*'}'
        |   'return'expression';'
        |   expression'('(expression(','expression)*)?')'';'
        |   statement'('')'';'
;
expression returns [Expression ast] :
            INT_CONSTANT {$ast=new IntLiteral($INT_CONSTANT.getLine(),$INT_CONSTANT.getCharPositionInLine()+1,LexerHelper.lexemeToInt($INT_CONSTANT.text));}
        |   REAL_CONSTANT {$ast=new DoubleLiteral($REAL_CONSTANT.getLine(),$REAL_CONSTANT.getCharPositionInLine()+1,LexerHelper.lexemeToReal($REAL_CONSTANT.text));}
        |   CHAR_CONSTANT {$ast=new CharLiteral($CHAR_CONSTANT.getLine(),$CHAR_CONSTANT.getCharPositionInLine()+1,LexerHelper.lexemeToChar($CHAR_CONSTANT.text));}
        |   ID {$ast=new Variable($ID.getLine(),$ID.getCharPositionInLine()+1,$ID.text);}
        |   expression'('(expression(','expression)*)?')'
        |   '('e=expression')'{$ast=$e.ast;}
        |   e1=expression'['e2=expression']'{$ast=new ArrayAccess($e2.ast.getLine(),$e2.ast.getColumn(),$e1.ast,$e2.ast);}
        |   e=expression'.'ID{$ast=new StructAccess($ID.getLine(), $ID.getCharPositionInLine()+1,$e.ast,$ID.text);}
        |   '('t=type')'e=expression {$ast=new Cast($t.ast.getLine(),$t.ast.getColumn(),$e.ast,$t.ast);}
        |   '-'e=expression{$ast=new UnaryMinus($e.ast.getLine(),$e.ast.getColumn());}
        |   '!'expression
        |   expression('*'|'/'|'%')expression
        |   expression('+'|'-')expression
        |   expression('>'|'>'|'='|'<'|'<='|'>='|'!='|'==')expression
        |   expression('&&'|'||')expression
;
type returns [Type ast]:
        'int' {$ast=IntType.getInstance();}
    |   'double'{$ast=DoubleType.getInstance();}
    |   'char'{$ast=CharType.getInstance();}
    |   '['INT_CONSTANT']'type
    |   'struct''{'var_definition*'}'
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

