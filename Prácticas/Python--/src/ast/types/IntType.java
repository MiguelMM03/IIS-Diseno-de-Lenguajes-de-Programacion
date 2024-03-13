package ast.types;

import semantic.Visitor;

public class IntType extends AbstractType {
    private static IntType simpleType;
    private IntType() {
        super(0, 0);
    }
    public static IntType getInstance(){
        if(simpleType==null){
            simpleType=new IntType();
        }
        return simpleType;
    }
    @Override
    public <TP,TR> TR accept(Visitor<TP,TR> visitor, TP param){
        return visitor.visit(this,param);
    }
}
