package ast.types;

import ast.ASTNode;
import ast.Type;
import semantic.Visitor;

public class BooleanType extends SimpleType{
    private static BooleanType instance;
    private BooleanType() {
        super(0, 0);
    }
    public static BooleanType getInstance(){
        if(instance==null){
            instance=new BooleanType();
        }

        return instance;
    }
    @Override
    public <TP,TR> TR accept(Visitor<TP,TR> visitor, TP param){

        return visitor.visit(this,param);
    }
    @Override
    public Type asBuiltInType(ASTNode ast) {
        return this;
    }
    @Override
    public Type asLogical(ASTNode ast) {
        return instance;
    }
    @Override
    public Type logic(Type type, ASTNode ast) {
        Type t=instance.promotesTo(type, ast);
        if(t instanceof ErrorType){
            return super.logic(type, ast);
        }
        return t;
    }
    @Override
    public int numberOfBytes() {
        return 1;
    }

    @Override
    public String toString() {
        return "BooleanType";
    }
    @Override
    public char suffix() {
        return 'i';
    }
}
