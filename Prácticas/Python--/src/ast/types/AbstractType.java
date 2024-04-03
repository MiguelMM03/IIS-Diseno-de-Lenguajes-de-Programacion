package ast.types;

import ast.ASTNode;
import ast.AbstractASTNode;
import ast.Type;

import java.util.List;

public abstract class AbstractType extends AbstractASTNode implements Type  {

    public AbstractType(int line, int column){
        super(line,column);
    }

    @Override
    public Type asBuiltInType(ASTNode ast) {
        if(this instanceof ErrorType)
            return this;
        return new ErrorType(ast.getLine(),ast.getColumn(),"A built-in type was expected. Received: "+this);
    }

    @Override
    public Type asLogical(ASTNode ast) {
        if(this instanceof ErrorType)
            return this;
        return new ErrorType(ast.getLine(),ast.getColumn(),"A logical type was expected. Received: "+this);
    }

    public Type arithmetic(Type type, ASTNode ast) {
        if (type instanceof ErrorType)
            return type;
        return new ErrorType(ast.getLine(),ast.getColumn(),"Arithmetic operation cannot be done with "+this+" and "+type);
    }

    @Override
    public Type arithmetic(ASTNode ast) {
        if(this instanceof ErrorType)
            return this;
        return new ErrorType(ast.getLine(),ast.getColumn(),"Arithmetic type expected");
    }

    @Override
    public Type logic(Type type, ASTNode ast) {
        if (type.asLogical(ast) instanceof ErrorType)
            return type;
        return new ErrorType(ast.getLine(),ast.getColumn(),"Logic operation cannot be done with "+this+" and "+type);
    }

    @Override
    public Type logic(ASTNode ast) {
        return new ErrorType(ast.getLine(),ast.getColumn(),"Logic type expected");
    }

    @Override
    public Type promotesTo(Type type, ASTNode ast) {
        if (type instanceof ErrorType)
            return type;
        return new ErrorType(ast.getLine(),ast.getColumn(),"Cannot promote "+this+" to "+type);
    }

    @Override
    public Type canBeCastTo(Type type, ASTNode ast) {
        if (type instanceof ErrorType)
            return type;
        return new ErrorType(ast.getLine(),ast.getColumn(),"Cannot cast "+this+" to "+type);
    }

    @Override
    public Type comparison(Type type, ASTNode ast) {
        if (type instanceof ErrorType)
            return type;
        return new ErrorType(ast.getLine(),ast.getColumn(),"Comparison operation cannot be done with "+this+" and "+type);
    }

    @Override
    public Type squareBrackets(Type type, ASTNode ast) {
        if (type instanceof ErrorType)
            return type;
        return new ErrorType(ast.getLine(),ast.getColumn(),"Array type expected. Received: "+type);
    }

    @Override
    public Type dot(String field, ASTNode ast) {
        return new ErrorType(ast.getLine(),ast.getColumn(),"Field "+field+" cannot be accessed from "+this);
    }

    @Override
    public Type parenthesis(List<Type> types, ASTNode ast) {
        return new ErrorType(ast.getLine(),ast.getColumn(),"Function type expected");

    }
}
