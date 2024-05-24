## Gramática atribuida para calcular el offset de VarDefinition y FieldRecord
### G
    (1) Program: program → vardefinition* functiondefinition*

    (2) VarDefinition: vardefinition → type ID
    (3) FunctionDefinition: functiondefinition → type ID vardefinition* statement*

    (4) Arithmetic: expression1 → expression2 ('+'|'-'|'*'|'/') expression3
    (5) ArrayAccess: expression1 → expression2  expression3 
    (6) Cast: expression1 →  type  expression2
    (7) CharLiteral: expression → CHAR_LITERAL
    (8) Comparison: expression1 → expression2 ('<'|'>'|'<='|'>='|'=='|'!=') expression3
    (9) DoubleLiteral: expression → DOUBLE_LITERAL
    (10) FunctionCall: expression1 → variable expression2*
    (11) IntLiteral: expression → INT_LITERAL
    (12) Logical: expression1 → expression2 ('&&'|'||') expression3
    (13) StructAccess: expression1 → expression2  ID
    (14) UnaryMinus: expression1 →  expression2
    (15) UnaryNot: expression1 →  expression2
    (16) Variable: expression → ID

    (17) Asignment: statement → expression1 expression2
    (18) Conditional: statement1 → expression statement2* statement3*
    (19) Input: statement → expression
    (20) Print: statement → expression
    (21) Return: statement → expression
    (22) While: statement1 → expression statement2*

    (23) IntType: type → INT
    (24) RealType: type → DOUBLE
    (25) CharType: type → CHAR
    (26) ArrayType: type → type [ INT_CONSTANT ]
    (27) StructType: type → field*
    (28) RecordField: field → type ID
    (29) FunctionType: type → type vardefinition*

### A
    Definition.offset : int
    field.offset : int

### R
    (1) int offset = 0;
        for (int i = 0; i < vardefinition*.size; i++)
            vardefinition*[i].offset = offset
            offset += vardefinition*[i].type.numberOfBytes()
    (2) 
    (3) int offset = -4;
        for (int i = 0; i < vardefinition*.size; i++)
            vardefinition*[i].offset = offset 
            offset -= vardefinition*[i].type.numberOfBytes()

    (4) 
    (5)
    (6)
    (7)
    (8)
    (9)
    (10)
    (11)
    (12) 
    (13)
    (14)
    (15)
    (16)

    (17)
    (18)
    (19)
    (20)
    (21)
    (22)

    (23)
    (24)
    (25)
    (26)
    (27) int offset=0;
         for (int i = 0; i < field*.size; i++)
            field*[i].offset = offset
            offset += field*[i].type.numberOfBytes()
    (28) 
    (29) int offset = +4; 
         for (int i = vardefinition*.size; i > 0; i--)
            vardefinition*[i].offset = offset;
            offset += vardefinition*[i].type.numberOfBytes()

