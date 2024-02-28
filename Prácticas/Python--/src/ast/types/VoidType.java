package ast.types;

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
}
