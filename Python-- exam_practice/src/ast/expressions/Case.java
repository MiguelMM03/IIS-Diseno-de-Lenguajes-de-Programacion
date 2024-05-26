package ast.expressions;

import ast.Expression;
import ast.Statement;
import semantic.Visitor;

import java.util.List;

public class Case extends AbstractExpression{
    private Expression condition;
    private List<Statement> statements;

    public Case(int row, int column, Expression condition, List<Statement> statements) {
        super(row, column);
        this.condition = condition;
        this.statements = statements;
    }

    public Expression getCondition() {
        return condition;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    @Override
    public String toString() {
        return "Case{" +
                "condition=" + condition +
                ", statements=" + statements +
                '}';
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
