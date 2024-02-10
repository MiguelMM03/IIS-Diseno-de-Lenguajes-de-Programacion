package dlp.ast.definitions;

import dlp.ast.Statement;
import dlp.ast.Type;

import java.util.ArrayList;
import java.util.List;

public class FunctionDef extends AbstractDefinition{
    private List<Statement> body=new ArrayList<>();

    public FunctionDef(int line, int column, String name, Type type, List<Statement> body) {
        super(line, column, name, type);
        this.body=body;
    }

    public List<Statement> getBody() {
        return body;
    }
}
