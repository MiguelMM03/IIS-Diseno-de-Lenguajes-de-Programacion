package ast.types;

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
}
