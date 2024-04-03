package ast.types;

import ast.ASTNode;
import ast.Type;
import semantic.Visitor;

public class IntType extends SimpleType {
    private static IntType instance;
    private IntType() {
        super(0, 0);
    }
    public static IntType getInstance(){
        if(instance ==null){
            instance =new IntType();
        }
        return instance;
    }
    @Override
    public <TP,TR> TR accept(Visitor<TP,TR> visitor, TP param){
        return visitor.visit(this,param);
    }

    @Override
    public Type asLogical(ASTNode ast) {
        return instance;
    }
    @Override
    public Type arithmetic(Type type, ASTNode ast) {
        Type t=instance.promotesTo(type, ast);
        if(t instanceof ErrorType){
            return super.arithmetic(type, ast);
        }
        return t;
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
        return "IntType";
    }
}
