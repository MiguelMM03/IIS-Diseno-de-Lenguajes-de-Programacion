package ast.types;

import ast.ASTNode;
import ast.Type;

public class BooleanType extends AbstractType{
    private static BooleanType instance;
    private BooleanType() {
        super(0, 0);
    }
    public static BooleanType getInstance(){
        if(instance ==null){
            instance =new BooleanType();
        }
        return instance;
    }
    @Override
    public Type printeable(ASTNode ast) {
        return instance;
    }
    @Override
    public Type promotesTo(Type type, ASTNode ast) {
        if(type instanceof ErrorType){
            return type;
        }
        if(type instanceof BooleanType){
            return this;
        }
        return new ErrorType(ast.getLine(),ast.getColumn(),"Cannot promote boolean to "+type);
    }

    @Override
    public String toString() {
        return "BOOLEAN";
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
    public Type logic(Type type,ASTNode ast) {
        Type t=instance.promotesTo(type, ast);
        if(t instanceof ErrorType){
            return super.logic(type, ast);
        }
        return t;
    }
    @Override
    public Type logic(ASTNode ast) {
        return instance;
    }
    @Override
    public Type asBoolean(ASTNode ast) {
        return instance;
    }

    @Override
    public int numberOfBytes() {
        return 2;
    }

    @Override
    public char suffix() {
        return 'i';
    }
}
