package dlp.ast.expressions;

import dlp.ast.Expression;

public class ArrayAccess extends AbstractExpression{
    private Expression field;
    private Expression name;

    public ArrayAccess(int line, int column, Expression name, Expression field) {
        super(line, column);
        this.name=name;
        this.field=field;
    }
    public Expression getField() {
        return field;
    }

    public Expression getName() {
        return name;
    }
}
