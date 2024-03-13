package ast.types;

import ast.Type;
import semantic.Visitor;

public class ArrayType extends AbstractType {
    private int size;
    private Type of;

    public ArrayType(int line, int column, int size, Type of) {
        super(line, column);
        this.size = size;
        this.of = of;
    }

    public int getSize() {
        return size;
    }

    public Type isOf() {
        return of;
    }
    @Override
    public <TP,TR> TR accept(Visitor<TP,TR> visitor, TP param){
        return visitor.visit(this,param);
    }
}
