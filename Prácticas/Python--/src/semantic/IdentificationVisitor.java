package semantic;

import ast.Definition;
import ast.Expression;
import ast.Program;
import ast.Statement;
import ast.definitions.FunctionDef;
import ast.definitions.VariableDef;
import ast.expressions.*;
import ast.statements.*;
import ast.types.*;
import symboltable.SymbolTable;

public class IdentificationVisitor extends AbstractVisitor {
    private SymbolTable symbolTable=new SymbolTable();

    @Override
    public Void visit(Variable ast, Void param) {
        return null;
    }
    @Override
    public Void visit(FunctionDef ast, Void param) {
        ast.getType().accept(this,param);
        for(VariableDef def:ast.getVars()){
            def.accept(this,param);
        }
        for(Statement st:ast.getBody()){
            st.accept(this,param);
        }
        return null;
    }

    @Override
    public Void visit(VariableDef ast, Void param) {
        ast.getType().accept(this,param);
        return null;
    }
}
