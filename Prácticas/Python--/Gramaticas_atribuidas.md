## Gramática atribuida que calcula el atributo "definition" para las "Variable".

### A
    Variable.definition : Definition

### R
    //Reglas para las Variable
        if(symbolTable.find(Variable.getName())){
            Variable.setDefinition(symbolTable.find(Variable.getName()));
        }
    //Reglas para las VariableDef
        symbolTable.insert(VariableDef)
    //Reglas para las FunctionDef
        ¿Modificar ámbito?
        
