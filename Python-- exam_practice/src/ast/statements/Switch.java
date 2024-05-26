package ast.statements;

import ast.Expression;
import ast.expressions.Case;
import semantic.Visitor;

import java.util.List;

public class Switch extends AbstractStatement{
    private Expression condition;
    private List<Case> cases;

    public Switch(int row, int column, Expression condition, List<Case> cases) {
        super(row, column);
        this.condition = condition;
        this.cases = cases;
    }

    public Expression getCondition() {
        return condition;
    }

    public List<Case> getCases() {
        return cases;
    }

    @Override
    public String toString() {
        return "Switch{" +
                "condition=" + condition +
                ", cases=" + cases +
                '}';
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
