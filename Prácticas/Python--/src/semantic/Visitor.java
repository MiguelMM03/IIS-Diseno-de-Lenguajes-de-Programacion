package visitor;

import ast.ASTNode;
import ast.expressions.*;
import ast.statements.*;

public interface Visitor <TP,TR>{
    public TR visit(Arithmetic ast, TP param);
    public TR visit(ArrayAccess ast, TP param);
    public TR visit(Cast ast, TP param);
    public TR visit(CharLiteral ast, TP param);
    public TR visit(Comparator ast, TP param);
    public TR visit(DoubleLiteral ast, TP param);
    public TR visit(FunctionCall ast, TP param);
    public TR visit(IntLiteral ast, TP param);
    public TR visit(Logical ast, TP param);
    public TR visit(StructAccess ast, TP param);
    public TR visit(UnaryMinus ast, TP param);
    public TR visit(UnaryNot ast, TP param);
    public TR visit(Variable ast, TP param);
    public TR visit(Asignment ast, TP param);
    public TR visit(Conditional ast, TP param);
    public TR visit(Input ast, TP param);
    public TR visit(Print ast, TP param);
    public TR visit(Return ast, TP param);
    public TR visit(While ast, TP param);

}
