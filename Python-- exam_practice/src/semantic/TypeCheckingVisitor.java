package semantic;

import ast.*;
import ast.definitions.FunctionDef;
import ast.definitions.VariableDef;
import ast.expressions.*;
import ast.statements.*;
import ast.types.*;

public class TypeCheckingVisitor extends AbstractVisitor<Type,Void>{
    @Override
    public Void visit(Arithmetic ast, Type param) {
        ast.setLValue(false);
        ast.getOp1().accept(this,param);
        ast.getOp2().accept(this, param);
        ast.setType(ast.getOp1().getType().arithmetic(ast.getOp2().getType(),ast));
        return null;
    }

    @Override
    public Void visit(ArrayAccess ast, Type param) {
        ast.setLValue(true);
        ast.getName().accept(this,param);
        ast.getField().accept(this,param);
        ast.setType(ast.getName().getType().squareBrackets(ast.getField().getType(),ast));
        return null;
    }

    @Override
    public Void visit(Cast ast, Type param) {
        ast.getType().accept(this,param);
        ast.getExpression().accept(this,param);
        ast.setLValue(false);
        ast.setType(ast.getExpression().getType().canBeCastTo(ast.getType(),ast));
        return null;
    }

    @Override
    public Void visit(CharLiteral ast, Type param) {
        ast.setLValue(false);
        ast.setType(CharType.getInstance());
        return null;
    }

    @Override
    public Void visit(Comparator ast, Type param) {
        ast.setLValue(false);
        ast.getOp1().accept(this,param);
        ast.getOp2().accept(this,param);
        ast.setType(ast.getOp1().getType().comparison(ast.getOp2().getType(),ast));
        return null;
    }

    @Override
    public Void visit(DoubleLiteral ast, Type param) {
        ast.setLValue(false);
        ast.setType(DoubleType.getInstance());
        return null;
    }

    @Override
    public Void visit(FunctionCall ast, Type param) {
        ast.setLValue(false);
        ast.getName().accept(this,param);
        for(Expression e:ast.getParams()){
            e.accept(this,param);
        }
        ast.setType(ast.getName().getType().parenthesis(ast.getParams().stream().map(Expression::getType).toList(),ast));
        return null;
    }

    @Override
    public Void visit(IntLiteral ast, Type param) {
        ast.setLValue(false);
        ast.setType(IntType.getInstance());
        return null;
    }
    @Override
    public Void visit(BooleanLiteral ast, Type param) {
        ast.setLValue(false);
        ast.setType(BooleanType.getInstance());
        return null;
    }

    @Override
    public Void visit(Logical ast, Type param) {
        ast.setLValue(false);
        ast.getOp1().accept(this,param);
        ast.getOp2().accept(this,param);
        ast.setType(ast.getOp1().getType().logic(ast.getOp2().getType(),ast));
        return null;
    }

    @Override
    public Void visit(StructAccess ast, Type param) {
        ast.setLValue(true);
        ast.getName().accept(this,param);
        ast.setType(ast.getName().getType().dot(ast.getField(),ast));
        return null;
    }

    @Override
    public Void visit(UnaryMinus ast, Type param) {
        ast.setLValue(false);
        ast.getExpression().accept(this,param);
        ast.setType(ast.getExpression().getType().arithmetic(ast));
        return null;
    }

    @Override
    public Void visit(UnaryNot ast, Type param) {
        ast.setLValue(false);
        ast.getExpression().accept(this,param);
        ast.setType(ast.getExpression().getType().logic(ast));
        return null;
    }

    @Override
    public Void visit(Variable ast, Type param) {
        ast.setLValue(true);
        if(ast.getDefinition()!=null)
            ast.setType(ast.getDefinition().getType());
        return null;
    }

    @Override
    public Void visit(Asignment ast, Type param) {
        ast.getLeft().accept(this,param);
        ast.setLValue(false);
        ast.getRight().accept(this,param);
        if(!ast.getLeft().getLValue()){
            new ErrorType(ast.getLeft().getLine(),ast.getLeft().getColumn()+1,"Expression is not a LValue");
        }
        ast.setType(ast.getRight().getType().promotesTo(ast.getLeft().getType(),ast));
        return null;
    }

    @Override
    public Void visit(Conditional ast, Type param) {
        ast.getCondition().accept(this,param);
        ast.getCondition().setType(ast.getCondition().getType().asLogical(ast));
        for(Statement def: ast.getBodyIf()){
            def.accept(this,param);
        }
        for(Statement def: ast.getBodyElse()){
            def.accept(this,param);
        }
        return null;
    }

    @Override
    public Void visit(Input ast, Type param) {
        ast.getExpression().accept(this,param);
        if(!ast.getExpression().getLValue()){
           new ErrorType(ast.getExpression().getLine(),ast.getExpression().getColumn()+1,"Expression is not a LValue");
        }
        ast.getExpression().getType().asBuiltInType(ast);
        return null;
    }

    @Override
    public Void visit(Print ast, Type param) {
        ast.getExpression().accept(this,param);
        ast.getExpression().getType().asBuiltInType(ast);
        return null;
    }

    @Override
    public Void visit(Return ast, Type param) {
        ast.getExpression().accept(this,param);
        ast.getExpression().setType(ast.getExpression().getType().promotesTo(((FunctionType)param).getReturnType(),ast));
        return null;
    }

    @Override
    public Void visit(While ast, Type param) {
        ast.getCondition().accept(this,param);
        ast.getCondition().setType(ast.getCondition().getType().asLogical(ast));
        for(Statement def: ast.getBody()){
            def.accept(this,param);
        }

        return null;
    }
    @Override
    public Void visit(For ast, Type param) {
        ast.getCondition().accept(this,param);
        ast.getCondition().setType(ast.getCondition().getType().asLogical(ast));
        ast.getInitialization().accept(this,param);
        ast.getChange().accept(this,param);
        for(Statement def: ast.getBody()){
            def.accept(this,param);
        }

        return null;
    }

    @Override
    public Void visit(FunctionType ast, Type param) {
        for(VariableDef def:ast.getParams()){
            def.accept(this,param);
        }
        ast.getReturnType().accept(this,param);
        return null;
    }

    @Override
    public Void visit(FunctionDef ast, Type param) {
        ast.getType().accept(this,param);
        for(VariableDef def:ast.getVars()){
            def.accept(this,param);
        }
        for(Statement st:ast.getBody()){
            st.accept(this,(ast.getType()));
        }
        return null;
    }
}
