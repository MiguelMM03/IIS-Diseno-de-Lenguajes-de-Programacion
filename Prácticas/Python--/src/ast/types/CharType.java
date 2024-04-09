package ast.types;

import ast.ASTNode;
import ast.Type;
import semantic.Visitor;

public class CharType extends SimpleType {
    private static CharType instance;
    private CharType() {
        super(0, 0);
    }
    public static CharType getInstance(){
        if(instance==null){
            instance=new CharType();
        }

        return instance;
    }
    @Override
    public <TP,TR> TR accept(Visitor<TP,TR> visitor, TP param){
        return visitor.visit(this,param);
    }
    @Override
    public Type arithmetic(Type type, ASTNode ast) {
        if (type instanceof IntType || type instanceof CharType) {
            return IntType.getInstance();
        }
        return super.arithmetic(type, ast);
    }
    @Override
    public Type comparison(Type type, ASTNode ast) {
        Type t=instance.promotesTo(type, ast);
        if(t instanceof ErrorType){
            return super.comparison(type, ast);
        }
        return t;
    }

    @Override
    public String toString() {
        return "CharType";
    }
}
