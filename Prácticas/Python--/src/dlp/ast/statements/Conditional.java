package dlp.ast.statements;

import dlp.ast.Expression;
import dlp.ast.Statement;

import java.util.ArrayList;
import java.util.List;

public class Conditional extends AbstractStatement{
    private Expression condition;
    private List<Statement> bodyIf=new ArrayList<>();
    private List<Statement> bodyElse=new ArrayList<>();
    public Conditional(int line, int column, Expression condition, List<Statement> bodyIf, List<Statement> bodyElse) {
        super(line, column);
        this.condition=condition;
        this.bodyIf=bodyIf;
        this.bodyElse=bodyElse;
    }

    public List<Statement> getBodyElse() {
        return bodyElse;
    }

    public List<Statement> getBodyIf() {
        return bodyIf;
    }

    public Expression getCondition() {
        return condition;
    }
}
