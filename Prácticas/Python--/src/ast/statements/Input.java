package ast.statements;

import ast.Expression;

public class Input extends AbstractStatement{
    private Expression expression;
    public Input(int line, int column, Expression expression) {
        super(line, column);
        this.expression=expression;
    }

    public Expression getExpression() {
        return expression;
    }
}
