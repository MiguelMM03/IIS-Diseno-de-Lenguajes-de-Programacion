package ast.expressions;

import ast.Expression;

public class AbstractExpression implements Expression {
    private int line;
    private int column;
    public AbstractExpression(int line, int column){
        this.line=line;
        this.column=column;
    }
    @Override
    public int getLine() {
        return line;
    }

    @Override
    public int getColumn() {
        return column;
    }
}
