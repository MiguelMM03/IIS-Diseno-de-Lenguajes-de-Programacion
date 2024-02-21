grammar Pmm;	

program: definition* main_function EOF
;
definition: var_definition
        |   function_definition
        |   main_function
;
main_function: 'def''main''('')'':''{'var_definition*statement*'}'
;
var_definition: expression(','expression)*':'type';'
;
function_definition: 'def'ID'('(expression(','expression)*':'type(','(expression(','expression)*':'type))*)?')'':'type?'{'var_definition*statement*('return'type';')?'}'
;
statement:  'print'expression(','expression)*';'
        |   'input'expression(','expression)*';'
        |   expression'='expression';'
        |   'if'expression':'('{'statement*'}'|statement)('else'':'('{'statement*'}'|statement))?
        |   'while'expression':''{'statement*'}'
        |   'return'expression';'
        |   expression'('(expression(','expression)*)?')'';'
        |   statement'('')'';'
;
expression: INT_CONSTANT
        |   REAL_CONSTANT
        |   CHAR_CONSTANT
        |   ID
        |   expression'('(expression(','expression)*)?')'
        |   '('expression')'
        |   expression'['expression']'
        |   expression'.'ID
        |   '('type')'expression
        |   '-'expression
        |   '!'expression
        |   expression('*'|'/'|'%')expression
        |   expression('+'|'-')expression
        |   expression('>'|'>'|'='|'<'|'<='|'>='|'!='|'==')expression
        |   expression('&&'|'||')expression
;
type:   'int'
    |   'double'
    |   'char'
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

