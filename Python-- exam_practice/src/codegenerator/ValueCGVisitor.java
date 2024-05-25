package codegenerator;

import ast.Expression;
import ast.Statement;
import ast.expressions.*;
import ast.statements.Asignment;

public class ValueCGVisitor extends AbstractCGVisitor<Void,Void>{
    private CodeGenerator cg;
    private AddressCGVisitor address;
    private ExecuteCGVisitor execute;
    public ValueCGVisitor(CodeGenerator cg) {
        this.cg=cg;
    }
    public void setAddressVisitor(AddressCGVisitor address){
        this.address=address;
    }
    public void setExecuteVisitor(ExecuteCGVisitor execute){
        this.execute=execute;
    }

    /*
        value[[Arithmetic: expression1 -> expression2 operator=(+|-|*|/|%) expression3]]
            value[[expression2]]
            cg.convertTo(expression2.getType(),expression1.getType())
            value[[expression3]]
            cg.convertTo(expression3.getType(),expression1.getType())
            cg.arithmetic(operator) expression1.type.suffix();
     */
    @Override
    public Void visit(Arithmetic ast, Void param) {
        ast.getOp1().accept(this,null);
        cg.convertTo(ast.getOp1().getType(),ast.getType());
        ast.getOp2().accept(this,null);
        cg.convertTo(ast.getOp2().getType(),ast.getType());
        cg.arithmetic(ast.getType(),ast.getOperator());
        return null;
    }
    /*
    value[[Cast: expression1 -> type expression2]]
        value[[expression2]]
        cg.convertTo(expression1.getType(),type)

     */
    @Override
    public Void visit(Cast ast, Void param) {
        ast.getExpression().accept(this,param);
        cg.convertTo(ast.getExpression().getType(),ast.getType());
        return null;
    }
    /*
    value[[CharLiteral: expression -> CHAR_CONSTANT]]
        <pushb> CHAR_CONSTANT

     */
    @Override
    public Void visit(CharLiteral ast, Void param) {
        cg.push(ast.getValue());
        return null;
    }
    /*
    value[[Comparator: expression1 -> expression2 operator=(<|>|<=|>=|==|!=) expression3]]
        value[[expression2]]
        cg.convertTo(expression2.getType(),expression1.getType())
        value[[expression3]]
        cg.convertTo(expression3.getType(),expression1.getType())
        cg.comparator(operator) expression1.type.suffix();
     */
    @Override
    public Void visit(Comparator ast, Void param) {
        ast.getOp1().accept(this,null);
        cg.convertTo(ast.getOp1().getType(),ast.getType());
        ast.getOp2().accept(this,null);
        cg.convertTo(ast.getOp2().getType(),ast.getType());
        cg.comparator(ast.getType(),ast.getOperator());
        return null;
    }
    /*
    value[[DoubleLiteral: expression -> DOUBLE_CONSTANT]]
        <pushf> DOUBLE_CONSTANT
     */
    @Override
    public Void visit(DoubleLiteral ast, Void param) {
        cg.push(ast.getValue());
        return null;
    }
    /*
        value[[IntLiteral: expression -> INT_CONSTANT]]
            <pushi> INT_CONSTANT
     */
    @Override
    public Void visit(IntLiteral ast, Void param) {
        cg.push(ast.getValue());
        return null;
    }
    /*
    value[[BooleanLiteral: expression -> BOOLEAN_CONSTANT]]
        <pushi> BOOLEAN_CONSTANT
    */
    @Override
    public Void visit(BooleanLiteral ast, Void param) {
        cg.push(ast.getValue());
        return null;
    }
    /*
    value[[Logical: expression1 -> expression2 operator=(&&| ||) expression3]]
        value[[expression2]]
        value[[expression3]]
        cg.logical(operator)
     */
    @Override
    public Void visit(Logical ast, Void param) {
        ast.getOp1().accept(this,null);
        ast.getOp2().accept(this,null);
        cg.logical(ast.getOperator());
        return null;
    }
    /*
    value[[UnaryMinus: expression1 -> expression2]]
        value[[expression2]]
        cg.convertTo(expression2.getType(),expression1.getType())
        <pushi> -1
        <mul> expression1.type.suffix();


     */
    @Override
    public Void visit(UnaryMinus ast, Void param) {
        ast.getExpression().accept(this,null);
        cg.convertTo(ast.getExpression().getType(),ast.getType());
        cg.push(-1);
        cg.mul(ast.getType());
        return null;
    }
    /*
    value[[UnaryNot: expression -> - expression]]
        value[[expression]]
        <not>
     */
    @Override
    public Void visit(UnaryNot ast, Void param) {
        ast.getExpression().accept(this,null);
        cg.not();
        return null;
    }
    /*
    value[[Variable: expression -> ID]]
        address[[expression]]()
        <load> expression.type.suffix();
 */
    @Override
    public Void visit(Variable ast, Void param) {
        address.visit(ast,null);
        cg.load(ast.getType());
        return null;

    }

    /*
    value[[ArrayAccess: expression1 -> expression2 expression3]]
        address[[expression1]]
        <load> expression1.type.suffix();
     */
    @Override
    public Void visit(ArrayAccess ast, Void param) {
        ast.accept(address,null);
        cg.load(ast.getType());
        return null;
    }

    /*
    value[[StructAccess: expression1 -> expression2 ID]]
        address[[expression1]]
        <load> expression1.type.suffix();
     */
    @Override
    public Void visit(StructAccess ast, Void param) {
        ast.accept(address,null);
        cg.load(ast.getType());
        return null;
    }

    /*
    value[[FunctionCall: expression1 -> expression2 expression3*]]
        for(Expression arg:expression3){
            value[arg]()
        }
        <call> expression2.name
     */
    @Override
    public Void visit(FunctionCall ast, Void param) {
        for(Expression e:ast.getParams()){
            e.accept(this,param);
        }
        cg.call(ast.getName().getName());
        return null;
    }

    /*
    value[[Assignment: statement -> expression1 expression2]]
        value[[expression1]]
     */
    public Void visit(Asignment ast, Void param){
        ast.getRight().accept(this,param);
        ((Statement)ast).accept(execute, null);
        return null;
    }
}
