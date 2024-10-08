package ast.types;

import ast.ASTNode;
import ast.Type;
import semantic.Visitor;

public class VoidType extends SimpleType {
    private static VoidType instance;
    private VoidType() {
        super(0, 0);
    }
    public static VoidType getInstance(){
        if(instance==null){
            instance=new VoidType();
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
    public String toString() {
        return "VoidType";
    }
}
