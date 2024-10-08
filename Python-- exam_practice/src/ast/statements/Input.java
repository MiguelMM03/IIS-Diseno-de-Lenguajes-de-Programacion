package ast.statements;

import ast.Expression;
import semantic.Visitor;

public class Input extends AbstractStatement{
    private Expression expression;
    public Input(int line, int column, Expression expression) {
        super(line, column);
        this.expression=expression;
    }

    public Expression getExpression() {
        return expression;
    }
    @Override
    public <TP,TR> TR accept(Visitor<TP,TR> visitor, TP param){
        return visitor.visit(this,param);
    }
}
