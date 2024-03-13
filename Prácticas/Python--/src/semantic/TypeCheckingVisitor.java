package visitor;

import ast.ASTNode;
import ast.expressions.*;
import ast.statements.*;

public class TypeCheckingVisitor implements Visitor<Void,Void>{
    @Override
    public Void visit(Arithmetic ast, Void param) {
        return null;
    }

    @Override
    public Void visit(ArrayAccess ast, Void param) {
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
        return null;
    }

    @Override
    public Void visit(DoubleLiteral ast, Void param) {
        return null;
    }

    @Override
    public Void visit(FunctionCall ast, Void param) {
        return null;
    }

    @Override
    public Void visit(IntLiteral ast, Void param) {
        return null;
    }

    @Override
    public Void visit(Logical ast, Void param) {
        return null;
    }

    @Override
    public Void visit(StructAccess ast, Void param) {
        return null;
    }

    @Override
    public Void visit(UnaryMinus ast, Void param) {
        return null;
    }

    @Override
    public Void visit(UnaryNot ast, Void param) {
        return null;
    }

    @Override
    public Void visit(Variable ast, Void param) {
        return null;
    }

    @Override
    public Void visit(Asignment ast, Void param) {
        return null;
    }

    @Override
    public Void visit(Conditional ast, Void param) {
        return null;
    }

    @Override
    public Void visit(Input ast, Void param) {
        return null;
    }

    @Override
    public Void visit(Print ast, Void param) {
        return null;
    }

    @Override
    public Void visit(Return ast, Void param) {
        return null;
    }

    @Override
    public Void visit(While ast, Void param) {
        return null;
    }
}
