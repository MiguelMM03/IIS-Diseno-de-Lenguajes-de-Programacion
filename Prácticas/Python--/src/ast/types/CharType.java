package ast.types;

import semantic.Visitor;

public class CharType extends AbstractType {
    private static CharType simpleType;
    private CharType() {
        super(0, 0);
    }
    public static CharType getInstance(){
        if(simpleType==null){
            simpleType=new CharType();
        }
        return simpleType;
    }
    @Override
    public <TP,TR> TR accept(Visitor<TP,TR> visitor, TP param){
        return visitor.visit(this,param);
    }
}
