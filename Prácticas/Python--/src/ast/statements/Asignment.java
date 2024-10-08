package ast.statements;

import ast.Expression;
import semantic.Visitor;

public class Asignment extends AbstractStatement{
    private Expression left;
    private Expression right;
    public Asignment(int line, int column, Expression left, Expression right) {
        super(line, column);
        this.left=left;
        this.right=right;
    }

    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }
    @Override
    public <TP,TR> TR accept(Visitor<TP,TR> visitor, TP param){
        return visitor.visit(this,param);
    }
}
