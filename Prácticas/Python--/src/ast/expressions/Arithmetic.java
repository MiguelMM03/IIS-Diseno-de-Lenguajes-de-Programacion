package ast.expressions;

import ast.Expression;

public class Arithmetic extends AbstractOperator{

    public Arithmetic(int line, int column, Expression op1, Expression op2, String operator) {
        super(line, column,op1,op2,operator);

    }
}
