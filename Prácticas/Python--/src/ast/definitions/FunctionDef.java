package ast.definitions;

import ast.Statement;
import ast.Type;

import java.util.ArrayList;
import java.util.List;

public class FunctionDef extends AbstractDefinition{
    private List<VariableDef> vars =new ArrayList<>();
    private List<Statement> body=new ArrayList<>();

    public FunctionDef(int line, int column, String name, Type type, List<VariableDef> vars, List<Statement> body) {
        super(line, column, name, type);
        this.vars =vars;
        this.body=body;
    }

    public List<VariableDef> getVars() {
        return vars;
    }

    public List<Statement> getBody() {
        return body;
    }
}
