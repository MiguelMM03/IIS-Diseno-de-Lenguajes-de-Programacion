package semantic;

import ast.Program;
import ast.definitions.FunctionDef;
import ast.definitions.VariableDef;
import ast.expressions.*;
import ast.statements.*;
import ast.types.*;

public interface Visitor <TP,TR>{
    TR visit(Arithmetic ast, TP param);
    TR visit(ArrayAccess ast, TP param);
    TR visit(Cast ast, TP param);
    TR visit(CharLiteral ast, TP param);
    TR visit(Comparator ast, TP param);
    TR visit(DoubleLiteral ast, TP param);
    TR visit(FunctionCall ast, TP param);
    TR visit(IntLiteral ast, TP param);
    TR visit(Logical ast, TP param);
    TR visit(StructAccess ast, TP param);
    TR visit(UnaryMinus ast, TP param);
    TR visit(UnaryNot ast, TP param);
    TR visit(Variable ast, TP param);
    TR visit(Asignment ast, TP param);
    TR visit(Conditional ast, TP param);
    TR visit(Input ast, TP param);
    TR visit(Print ast, TP param);
    TR visit(Return ast, TP param);
    TR visit(While ast, TP param);
    TR visit(ArrayType ast, TP param);
    TR visit(CharType ast, TP param);
    TR visit(DoubleType ast, TP param);
    TR visit(ErrorType ast, TP param);
    TR visit(FunctionType ast, TP param);
    TR visit(IntType ast, TP param);
    TR visit(RecordField ast, TP param);
    TR visit(StructType ast, TP param);
    TR visit(VoidType ast, TP param);
    TR visit(FunctionDef ast, TP param);
    TR visit(VariableDef ast, TP param);
    TR visit(Program ast, TP param);
}
