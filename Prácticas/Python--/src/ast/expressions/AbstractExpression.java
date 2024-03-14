package ast.expressions;

import ast.AbstractASTNode;
import ast.Expression;

public abstract class AbstractExpression extends AbstractASTNode implements Expression {
    private boolean lvalue;
    public AbstractExpression(int line, int column){
        super(line, column);
    }

    @Override
    public  boolean getLValue(){return lvalue;}

    @Override
    public void setLValue(boolean bool){
        this.lvalue=bool;
    }
}
