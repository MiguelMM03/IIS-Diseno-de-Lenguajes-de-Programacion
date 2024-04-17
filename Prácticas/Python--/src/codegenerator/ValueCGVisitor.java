package codegenerator;

import ast.expressions.*;

public class ValueCGVisitor extends AbstractCGVisitor<Void,Void>{
    private CodeGenerator cg;
    private AddressCGVisitor address;
    public ValueCGVisitor(CodeGenerator cg) {
        this.cg=cg;
        address=new AddressCGVisitor(cg);
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
}
