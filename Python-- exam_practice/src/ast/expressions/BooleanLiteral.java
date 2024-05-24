package ast.expressions;

import semantic.Visitor;

public class BooleanLiteral extends AbstractExpression {
    private boolean value;

    public BooleanLiteral(int line, int column, boolean value) {
        super(line, column);
        this.value = value;
    }

    public int getValue() {
        return value?1:0;
    }

    @Override
    public String toString() {
        return "BooleanLiteral{" +
                "value=" + value +
                '}';
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
