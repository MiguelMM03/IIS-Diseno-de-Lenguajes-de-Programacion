package ast.expressions;

import ast.Expression;
import visitor.Visitor;

public class Arithmetic extends AbstractOperator{

    public Arithmetic(int line, int column, Expression op1, Expression op2, String operator) {
        super(line, column,op1,op2,operator);

    }
    @Override
    public <TP,TR> TR accept(Visitor<TP,TR> visitor, TP param){
        return visitor.visit(this,param);
    }
}
