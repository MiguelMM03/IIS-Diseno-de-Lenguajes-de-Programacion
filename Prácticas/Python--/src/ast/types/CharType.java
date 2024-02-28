package ast.types;

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
}
