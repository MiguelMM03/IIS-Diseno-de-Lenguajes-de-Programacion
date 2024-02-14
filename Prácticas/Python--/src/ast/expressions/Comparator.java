package ast.expressions;

import ast.Expression;

public class Comparator extends AbstractExpression{
    private String operator;
    private Expression op1;
    private Expression op2;
    public Comparator(int line, int column, Expression op1, Expression op2) {
        super(line, column);
        this.op1=op1;
        this.op2=op2;
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
