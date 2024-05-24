package semantic;

import ast.Definition;
import ast.Statement;
import ast.definitions.FunctionDef;
import ast.definitions.VariableDef;
import ast.expressions.*;
import ast.types.*;
import symboltable.SymbolTable;

public class IdentificationVisitor extends AbstractVisitor<Void,Void> {
    private final SymbolTable symbolTable=new SymbolTable();

    @Override
    public Void visit(Variable ast, Void param) {
        Definition def = symbolTable.find(ast.getName());
        if(def==null){
            new ErrorType(ast.getLine(),ast.getColumn()+1,"Variable not defined");
        }
        ast.setDefinition(def);
        return null;
    }
    @Override
    public Void visit(FunctionDef ast, Void param) {
        if(!symbolTable.insert(ast)){
            new ErrorType(ast.getLine(),ast.getColumn()+1,"Function definition repeated");
        }
        symbolTable.set();
        ast.getType().accept(this,param);
        for(VariableDef def:ast.getVars()){
            def.accept(this,param);
        }
        for(Statement st:ast.getBody()){
            st.accept(this,param);
        }
        symbolTable.reset();;
        return null;
    }

    @Override
    public Void visit(VariableDef ast, Void param) {
        if(!symbolTable.insert(ast)){
            new ErrorType(ast.getLine(),ast.getColumn()+1,"Variable definition repeated");
        }
        ast.getType().accept(this,param);
        return null;
    }
}
