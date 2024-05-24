package ast.expressions;

import ast.Expression;
import semantic.Visitor;

public class StructAccess extends AbstractExpression{
    private String field;
    private Expression name;

    public StructAccess(int line, int column, Expression name, String field) {
        super(line, column);
        this.name=name;
        this.field=field;
    }
    public String getField() {
        return field;
    }

    public Expression getName() {
        return name;
    }
    @Override
    public <TP,TR> TR accept(Visitor<TP,TR> visitor, TP param){
        return visitor.visit(this,param);
    }
}
