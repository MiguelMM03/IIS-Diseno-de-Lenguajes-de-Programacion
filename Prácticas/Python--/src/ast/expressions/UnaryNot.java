package ast.expressions;

import semantic.Visitor;

public class UnaryNot extends AbstractExpression {

    public UnaryNot(int line,int column){
        super(line,column);
    }
    @Override
    public <TP,TR> TR accept(Visitor<TP,TR> visitor, TP param){
        return visitor.visit(this,param);
    }
}
