package ast.types;

import ast.ASTNode;
import ast.Type;

public abstract class SimpleType extends AbstractType{

    public SimpleType(int line, int column) {
        super(line, column);
    }

    @Override
    public Type asBuiltInType(ASTNode ast) {
        return this;
    }
    @Override
    public Type promotesTo(Type type, ASTNode ast) {
        if (type instanceof ErrorType)
            return type;
        if (this.getClass() == type.getClass())
            return this;
        return new ErrorType(ast.getLine(),ast.getColumn(),"Cannot promote "+this+" to "+type);
    }
    @Override
    public Type canBeCastTo(Type type, ASTNode ast) {
        Type t=type.asBuiltInType(ast);
        if(t instanceof ErrorType)
            return t;
        return new ErrorType(ast.getLine(),ast.getColumn(),"Cannot cast "+this+" to "+type);
    }

}
