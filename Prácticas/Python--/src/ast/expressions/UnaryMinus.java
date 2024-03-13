package ast.expressions;

import semantic.Visitor;

public class UnaryMinus extends AbstractExpression {

    public UnaryMinus(int line, int column){
        super(line,column);
    }
    @Override
    public <TP,TR> TR accept(Visitor<TP,TR> visitor, TP param){
        return visitor.visit(this,param);
    }
}
