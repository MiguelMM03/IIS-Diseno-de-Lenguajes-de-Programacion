package codegenerator;

import ast.Definition;
import ast.Expression;
import ast.Program;
import ast.Statement;
import ast.definitions.FunctionDef;
import ast.definitions.VariableDef;
import ast.expressions.*;
import ast.statements.*;
import ast.types.*;
import semantic.Visitor;

public class AbstractCGVisitor<TP,TR> implements Visitor<TP,TR> {
    @Override
    public TR visit(Arithmetic ast, TP param) {
        ast.getOp1().accept(this,param);
        ast.getOp2().accept(this, param);
        return null;
    }

    @Override
    public TR visit(ArrayAccess ast, TP param) {
        ast.getName().accept(this,param);
        ast.getField().accept(this,param);
        return null;
    }

    @Override
    public TR visit(Cast ast, TP param) {
        return null;
    }

    @Override
    public TR visit(CharLiteral ast, TP param) {
        return null;
    }

    @Override
    public TR visit(Comparator ast, TP param) {
        ast.getOp1().accept(this,param);
        ast.getOp2().accept(this,param);
        return null;
    }

    @Override
    public TR visit(DoubleLiteral ast, TP param) {
        return null;
    }

    @Override
    public TR visit(FunctionCall ast, TP param) {
        ast.getName().accept(this,param);
        for(Expression e:ast.getParams()){
            e.accept(this,param);
        }
        return null;
    }

    @Override
    public TR visit(IntLiteral ast, TP param) {
        return null;
    }

    @Override
    public TR visit(Logical ast, TP param) {
        ast.getOp1().accept(this,param);
        ast.getOp2().accept(this,param);
        return null;
    }

    @Override
    public TR visit(StructAccess ast, TP param) {
        ast.getName().accept(this,param);
        return null;
    }

    @Override
    public TR visit(UnaryMinus ast, TP param) {
        ast.getExpression().accept(this,param);
        return null;
    }

    @Override
    public TR visit(UnaryNot ast, TP param) {
        ast.getExpression().accept(this,param);
        return null;
    }

    @Override
    public TR visit(Variable ast, TP param) {
        return null;
    }

    @Override
    public TR visit(Asignment ast, TP param) {
        ast.getLeft().accept(this,param);
        ast.getRight().accept(this,param);
        return null;
    }

    @Override
    public TR visit(Conditional ast, TP param) {
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
    public TR visit(Input ast, TP param) {
        ast.getExpression().accept(this,param);
        return null;
    }

    @Override
    public TR visit(Print ast, TP param) {
        ast.getExpression().accept(this,param);
        return null;
    }

    @Override
    public TR visit(Return ast, TP param) {
        ast.getExpression().accept(this,param);
        return null;
    }

    @Override
    public TR visit(While ast, TP param) {
        ast.getCondition().accept(this,param);
        for(Statement def: ast.getBody()){
            def.accept(this,param);
        }
        return null;
    }

    @Override
    public TR visit(ArrayType ast, TP param) {
        ast.isOf().accept(this,param);
        return null;
    }

    @Override
    public TR visit(CharType ast, TP param) {
        return null;
    }

    @Override
    public TR visit(DoubleType ast, TP param) {
        return null;
    }

    @Override
    public TR visit(ErrorType ast, TP param) {
        return null;
    }

    @Override
    public TR visit(FunctionType ast, TP param) {
        ast.getReturnType().accept(this,param);
        for(VariableDef def:ast.getParams()){
            def.accept(this,param);
        }
        return null;
    }

    @Override
    public TR visit(IntType ast, TP param) {
        return null;
    }

    @Override
    public TR visit(RecordField ast, TP param) {
        ast.getType().accept(this,param);
        return null;
    }

    @Override
    public TR visit(StructType ast, TP param) {
        for(RecordField def:ast.getRecordFields()){
            def.accept(this,param);
        }
        return null;
    }

    @Override
    public TR visit(VoidType ast, TP param) {
        return null;
    }

    @Override
    public TR visit(FunctionDef ast, TP param) {
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
    public TR visit(VariableDef ast, TP param) {
        ast.getType().accept(this,param);
        return null;
    }

    @Override
    public TR visit(Program ast, TP param) {
        for(Definition def:ast.getDefinitions()) {
            def.accept(this, param);
        }
        return null;
    }
}
