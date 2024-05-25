package ast.expressions;

import ast.Expression;
import semantic.Visitor;

public class CountElementsArrayWithConditions extends AbstractExpression{
    private Variable array;
    private String operator;
    private Expression condition;
    public CountElementsArrayWithConditions(int line, int column, Variable array, String operator, Expression expression) {
        super(line, column);
        this.array=array;
        this.operator=operator;
        this.condition=expression;
    }

    public Expression getCondition() {
        return condition;
    }

    public Variable getArray() {
        return array;
    }

    public String getOperator() {
        return operator;
    }

    @Override
    public String toString() {
        return "CountElementsArrayWithConditions{" +
                "array=" + array +
                ", condition=" + condition +
                '}';
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this,param);
    }
}
