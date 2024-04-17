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
        throw new IllegalStateException("Exception in visit Arithmetic");
    }

    @Override
    public TR visit(ArrayAccess ast, TP param) {
        throw new IllegalStateException("Exception in visit ArrayAccess");
    }

    @Override
    public TR visit(Cast ast, TP param) {
        throw new IllegalStateException("Exception in visit Cast");
    }

    @Override
    public TR visit(CharLiteral ast, TP param) {
        throw new IllegalStateException("Exception in visit CharLiteral");
    }

    @Override
    public TR visit(Comparator ast, TP param) {
        throw new IllegalStateException("Exception in visit Comparator");
    }

    @Override
    public TR visit(DoubleLiteral ast, TP param) {
        throw new IllegalStateException("Exception in visit DoubleLiteral");
    }

    @Override
    public TR visit(FunctionCall ast, TP param) {
        throw new IllegalStateException("Exception in visit FunctionCall");
    }

    @Override
    public TR visit(IntLiteral ast, TP param) {
        throw new IllegalStateException("Exception in visit IntLiteral");
    }

    @Override
    public TR visit(Logical ast, TP param) {
        throw new IllegalStateException("Exception in visit Logical");
    }

    @Override
    public TR visit(StructAccess ast, TP param) {
        throw new IllegalStateException("Exception in visit StructAccess");
    }

    @Override
    public TR visit(UnaryMinus ast, TP param) {
        throw new IllegalStateException("Exception in visit UnaryMinus");
    }

    @Override
    public TR visit(UnaryNot ast, TP param) {
        throw new IllegalStateException("Exception in visit UnaryNot");
    }

    @Override
    public TR visit(Variable ast, TP param) {
        throw new IllegalStateException("Exception in visit Variable");
    }

    @Override
    public TR visit(Asignment ast, TP param) {
        throw new IllegalStateException("Exception in visit Asignment");
    }

    @Override
    public TR visit(Conditional ast, TP param) {
        throw new IllegalStateException("Exception in visit Conditional");
    }

    @Override
    public TR visit(Input ast, TP param) {
        throw new IllegalStateException("Exception in visit Input");
    }

    @Override
    public TR visit(Print ast, TP param) {
        throw new IllegalStateException("Exception in visit Print");
    }

    @Override
    public TR visit(Return ast, TP param) {
        throw new IllegalStateException("Exception in visit Return");
    }

    @Override
    public TR visit(While ast, TP param) {
        throw new IllegalStateException("Exception in visit While");
    }

    @Override
    public TR visit(ArrayType ast, TP param) {
        throw new IllegalStateException("Exception in visit ArrayType");
    }

    @Override
    public TR visit(CharType ast, TP param) {
        throw new IllegalStateException("Exception in visit CharType");
    }

    @Override
    public TR visit(DoubleType ast, TP param) {
        throw new IllegalStateException("Exception in visit DoubleType");
    }

    @Override
    public TR visit(ErrorType ast, TP param) {
        throw new IllegalStateException("Exception in visit ErrorType");
    }

    @Override
    public TR visit(FunctionType ast, TP param) {
        throw new IllegalStateException("Exception in visit FunctionType");
    }

    @Override
    public TR visit(IntType ast, TP param) {
        throw new IllegalStateException("Exception in visit IntType");
    }

    @Override
    public TR visit(RecordField ast, TP param) {
        throw new IllegalStateException("Exception in visit RecordField");
    }

    @Override
    public TR visit(StructType ast, TP param) {
        throw new IllegalStateException("Exception in visit StructType");
    }

    @Override
    public TR visit(VoidType ast, TP param) {
        throw new IllegalStateException("Exception in visit VoidType");
    }

    @Override
    public TR visit(FunctionDef ast, TP param) {
        throw new IllegalStateException("Exception in visit FunctionDef");
    }

    @Override
    public TR visit(VariableDef ast, TP param) {
        throw new IllegalStateException("Exception in visit VariableDef");
    }

    @Override
    public TR visit(Program ast, TP param) {
        throw new IllegalStateException("Exception in visit Program");
    }
}
