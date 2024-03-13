package ast.expressions;

import ast.AbstractASTNode;
import ast.Expression;

public class AbstractExpression extends AbstractASTNode implements Expression {
    public AbstractExpression(int line, int column){
        super(line, column);
    }

    @Override
    public boolean getLValue() {
        return false;
    }

    @Override
    public void setLValue(boolean bool) {

    }
}
