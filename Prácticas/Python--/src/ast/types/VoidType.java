package ast.types;

import semantic.Visitor;

public class VoidType extends AbstractType {
    private static VoidType simpleType;
    private VoidType() {
        super(0, 0);
    }
    public static VoidType getInstance(){
        if(simpleType==null){
            simpleType=new VoidType();
        }
        return simpleType;
    }
    @Override
    public <TP,TR> TR accept(Visitor<TP,TR> visitor, TP param){
        return visitor.visit(this,param);
    }
}
