package semantic;

import ast.Definition;
import ast.Program;
import ast.definitions.FunctionDef;
import ast.definitions.VariableDef;
import ast.expressions.*;
import ast.statements.*;
import ast.types.*;

public class IdentificationVisitor implements Visitor<String, Definition> {
    @Override
    public Definition visit(Arithmetic ast, String param) {
        return null;
    }

    @Override
    public Definition visit(ArrayAccess ast, String param) {
        return null;
    }

    @Override
    public Definition visit(Cast ast, String param) {
        return null;
    }

    @Override
    public Definition visit(CharLiteral ast, String param) {
        return null;
    }

    @Override
    public Definition visit(Comparator ast, String param) {
        return null;
    }

    @Override
    public Definition visit(DoubleLiteral ast, String param) {
        return null;
    }

    @Override
    public Definition visit(FunctionCall ast, String param) {
        return null;
    }

    @Override
    public Definition visit(IntLiteral ast, String param) {
        return null;
    }

    @Override
    public Definition visit(Logical ast, String param) {
        return null;
    }

    @Override
    public Definition visit(StructAccess ast, String param) {
        return null;
    }

    @Override
    public Definition visit(UnaryMinus ast, String param) {
        return null;
    }

    @Override
    public Definition visit(UnaryNot ast, String param) {
        return null;
    }

    @Override
    public Definition visit(Variable ast, String param) {
        return null;
    }

    @Override
    public Definition visit(Asignment ast, String param) {
        return null;
    }

    @Override
    public Definition visit(Conditional ast, String param) {
        return null;
    }

    @Override
    public Definition visit(Input ast, String param) {
        return null;
    }

    @Override
    public Definition visit(Print ast, String param) {
        return null;
    }

    @Override
    public Definition visit(Return ast, String param) {
        return null;
    }

    @Override
    public Definition visit(While ast, String param) {
        return null;
    }

    @Override
    public Definition visit(ArrayType ast, String param) {
        return null;
    }

    @Override
    public Definition visit(CharType ast, String param) {
        return null;
    }

    @Override
    public Definition visit(DoubleType ast, String param) {
        return null;
    }

    @Override
    public Definition visit(ErrorType ast, String param) {
        return null;
    }

    @Override
    public Definition visit(FunctionType ast, String param) {
        return null;
    }

    @Override
    public Definition visit(IntType ast, String param) {
        return null;
    }

    @Override
    public Definition visit(RecordField ast, String param) {
        return null;
    }

    @Override
    public Definition visit(StructType ast, String param) {
        return null;
    }

    @Override
    public Definition visit(VoidType ast, String param) {
        return null;
    }

    @Override
    public Definition visit(Program ast, String param) {
        return null;
    }

    @Override
    public Definition visit(FunctionDef ast, String param) {
        return null;
    }

    @Override
    public Definition visit(VariableDef ast, String param) {
        return null;
    }
}
