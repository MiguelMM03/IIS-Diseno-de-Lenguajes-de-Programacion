package ast.types;

import ast.ASTNode;
import ast.Type;
import semantic.Visitor;

public class DoubleType extends SimpleType {
    private static DoubleType instance;
    private DoubleType() {
        super(0, 0);
    }
    public static DoubleType getInstance(){
        if(instance ==null){
            instance =new DoubleType();
        }
        return instance;
    }
    @Override
    public <TP,TR> TR accept(Visitor<TP,TR> visitor, TP param){
        return visitor.visit(this,param);
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
        return "DoubleType";
    }
}
