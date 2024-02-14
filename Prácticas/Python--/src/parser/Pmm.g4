grammar Pmm;	

program: 
       ;
  		 



/* LEXER PATTERNS */

TRASH: ([ \n\r\t]|COMMENT) -> skip
;

INT_CONSTANT:   [1-9][0-9]*|'0'
;

DECIMAL:    (INT_CONSTANT'.'[0-9]*)
|           (INT_CONSTANT?'.'[0-9]+)
;

REAL_CONSTANT:  DECIMAL
|               (INT_CONSTANT|DECIMAL)('e'|'E')('+'|'-')?(INT_CONSTANT)
;

COMMENT:    '#'.*?('\n'|EOF)
|           '"""'.*?'"""'
;

CHAR:   '\''
            ~[0-9]
|           '\\'INT_CONSTANT
|           '\'\t\''
|           '\'\n\''
        '\''
;
IDENT:  ([a-zA-Z]|'-')([a-zA-Z0-9]|'_')*
;

