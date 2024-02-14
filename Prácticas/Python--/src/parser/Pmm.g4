grammar Pmm;	

program: 
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

