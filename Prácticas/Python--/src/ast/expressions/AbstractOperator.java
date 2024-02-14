package ast.expressions;

import ast.Expression;

public class AbstractOperator extends AbstractExpression{
    private String operator;
    private Expression op1;
    private Expression op2;
    public AbstractOperator(int line, int column, Expression op1, Expression op2, String operator) {
        super(line, column);
        this.op1=op1;
        this.op2=op2;
        this.operator=operator;
    }
    public String getOperator() {
        return operator;
    }

    public Expression getOp1() {
        return op1;
    }

    public Expression getOp2() {
        return op2;
    }
}
