package semantic;

import ast.Definition;
import ast.Expression;
import ast.Program;
import ast.Statement;
import ast.definitions.FunctionDef;
import ast.definitions.VariableDef;
import ast.expressions.*;
import ast.statements.*;
import ast.types.*;
import errorhandler.ErrorHandler;

public class AbstractVisitor implements Visitor<Void,Void>{
    @Override
    public Void visit(Arithmetic ast, Void param) {
        ast.getOp1().accept(this,param);
        ast.getOp2().accept(this, param);
        return null;
    }

    @Override
    public Void visit(ArrayAccess ast, Void param) {
        ast.getName().accept(this,param);
        ast.getField().accept(this,param);
        return null;
    }

    @Override
    public Void visit(Cast ast, Void param) {
        return null;
    }

    @Override
    public Void visit(CharLiteral ast, Void param) {
        return null;
    }

    @Override
    public Void visit(Comparator ast, Void param) {
        ast.getOp1().accept(this,param);
        ast.getOp2().accept(this,param);
        return null;
    }

    @Override
    public Void visit(DoubleLiteral ast, Void param) {
        return null;
    }

    @Override
    public Void visit(FunctionCall ast, Void param) {
        ast.getName().accept(this,param);
        for(Expression e:ast.getParams()){
            e.accept(this,param);
        }
        return null;
    }

    @Override
    public Void visit(IntLiteral ast, Void param) {
        return null;
    }

    @Override
    public Void visit(Logical ast, Void param) {
        ast.getOp1().accept(this,param);
        ast.getOp2().accept(this,param);
        return null;
    }

    @Override
    public Void visit(StructAccess ast, Void param) {
        ast.getName().accept(this,param);
        return null;
    }

    @Override
    public Void visit(UnaryMinus ast, Void param) {
        ast.getExpression().accept(this,param);
        return null;
    }

    @Override
    public Void visit(UnaryNot ast, Void param) {
        ast.getExpression().accept(this,param);
        return null;
    }

    @Override
    public Void visit(Variable ast, Void param) {
        return null;
    }

    @Override
    public Void visit(Asignment ast, Void param) {
        ast.getLeft().accept(this,param);
        ast.getRight().accept(this,param);
        return null;
    }

    @Override
    public Void visit(Conditional ast, Void param) {
        ast.getCondition().accept(this,param);
        for(Statement st:ast.getBodyIf()){
            st.accept(this,param);
        }
        for(Statement st:ast.getBodyElse()){
            st.accept(this,param);
        }
        return null;
    }

    @Override
    public Void visit(Input ast, Void param) {
        ast.getExpression().accept(this,param);
        return null;
    }

    @Override
    public Void visit(Print ast, Void param) {
        ast.getExpression().accept(this,param);
        return null;
    }

    @Override
    public Void visit(Return ast, Void param) {
        ast.getExpression().accept(this,param);
        return null;
    }

    @Override
    public Void visit(While ast, Void param) {
        ast.getCondition().accept(this,param);
        for(Statement def: ast.getBody()){
            def.accept(this,param);
        }
        return null;
    }

    @Override
    public Void visit(ArrayType ast, Void param) {
        ast.isOf().accept(this,param);
        return null;
    }

    @Override
    public Void visit(CharType ast, Void param) {
        return null;
    }

    @Override
    public Void visit(DoubleType ast, Void param) {
        return null;
    }

    @Override
    public Void visit(ErrorType ast, Void param) {
        return null;
    }

    @Override
    public Void visit(FunctionType ast, Void param) {
        ast.getReturnType().accept(this,param);
        for(VariableDef def:ast.getParams()){
            def.accept(this,param);
        }
        return null;
    }

    @Override
    public Void visit(IntType ast, Void param) {
        return null;
    }

    @Override
    public Void visit(RecordField ast, Void param) {
        ast.getType().accept(this,param);
        return null;
    }

    @Override
    public Void visit(StructType ast, Void param) {
        for(RecordField def:ast.getRecordFields()){
            def.accept(this,param);
        }
        return null;
    }

    @Override
    public Void visit(VoidType ast, Void param) {
        return null;
    }

    @Override
    public Void visit(FunctionDef ast, Void param) {
        ast.getType().accept(this,param);
        for(VariableDef def:ast.getVars()){
            def.accept(this,param);
        }
        for(Statement st:ast.getBody()){
            st.accept(this,param);
        }
        return null;
    }

    @Override
    public Void visit(VariableDef ast, Void param) {
        ast.getType().accept(this,param);
        return null;
    }

    @Override
    public Void visit(Program ast, Void param) {
        for(Definition def:ast.getDefinitions()) {
            def.accept(this, param);
        }
        return null;
    }
}
