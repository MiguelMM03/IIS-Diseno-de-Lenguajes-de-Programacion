package ast.expressions;

import semantic.Visitor;

public class DoubleLiteral extends AbstractExpression {

    private double value;
    public DoubleLiteral(int line, int column, double value){
        super(line,column);
        this.value=value;
    }
    public double getValue(){
        return value;
    }
    @Override
    public <TP,TR> TR accept(Visitor<TP,TR> visitor, TP param){
        return visitor.visit(this,param);
    }
}
