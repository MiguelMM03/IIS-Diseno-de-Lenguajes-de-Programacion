## Gramática atribuida para realizar toda la comprobación de tipos del lenguaje 
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
    (27) RecordType: type → field*
    (28) RecordField: field → type ID
    (29) FunctionType: type → type vardefinition*
### A
    Expression.type : Type

### R
    (1)
    (2)
    (3)

    (4) expression1.type = expression2.type.arithmetic(expression3.type, expression1)

    (5) expression1.type = expression2.type.squareBrackets(expression3.type, expression1)

    (6) expression1.type = expression2.type.canBeCastTo(type, expression1)
    
    (7) expression.type = CharType.getInstance()
    
    (8) expression1.type = expression2.type.comparison(expression3.type, expression1)
    
    (9) expression.type = RealType.getInstance()
    
    (10) expression1.type = variable.type.parenthesis(expression2*, expression1)
    
    (11) expression.type = IntType.getInstance()
    
    (12) expression1.type = expression2.type.logic(expression3.type, expression1)
    
    (13) expression1.type = expression2.type.dot(expression3, expression1)
    
    (14) expression1.type.arithmetic(expression2.type)
        
    (15) expression1.type.logic(expression2.type)
        
    (16) expression.type = expression.definition.type

    (17) expression1.type.promotesTo(expression2.type, expression1)
    
    (18) expression.type.asLogical()

    (19) expression.asBuildInType(statement)

    (20) expression.asBuildInType(statement)

    (21)

    (22) expression.type.asLogical()

    (23)

    (24)

    (25)

    (26)

    (27)

    (28)

    (29)
