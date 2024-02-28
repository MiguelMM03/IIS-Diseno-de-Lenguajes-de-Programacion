package ast.types;

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
}
