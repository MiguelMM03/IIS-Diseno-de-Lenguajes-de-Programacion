package ast.types;

import semantic.Visitor;

public class DoubleType extends AbstractType {
    private static DoubleType simpleType;
    private DoubleType() {
        super(0, 0);
    }
    public static DoubleType getInstance(){
        if(simpleType==null){
            simpleType=new DoubleType();
        }
        return simpleType;
    }
    @Override
    public <TP,TR> TR accept(Visitor<TP,TR> visitor, TP param){
        return visitor.visit(this,param);
    }
}
