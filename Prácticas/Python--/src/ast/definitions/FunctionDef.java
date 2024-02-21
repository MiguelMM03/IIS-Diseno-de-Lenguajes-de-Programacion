package ast.definitions;

import ast.Statement;
import ast.Type;

import java.util.ArrayList;
import java.util.List;

public class FunctionDef extends AbstractDefinition{
    private List<VariableDef> params=new ArrayList<>();
    private List<Statement> body=new ArrayList<>();

    public FunctionDef(int line, int column, String name, Type type, List<VariableDef> params, List<Statement> body) {
        super(line, column, name, type);
        this.params=params;
        this.body=body;
    }

    public List<VariableDef> getParams() {
        return params;
    }

    public List<Statement> getBody() {
        return body;
    }
}
