package ast.expressions;

import ast.Definition;
import semantic.Visitor;

public class Variable extends AbstractExpression {

    private String name;
    private Definition definition;
    public Variable(int line, int column, String name){
        super(line,column);
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public Definition getDefinition() {
        return definition;
    }

    @Override
    public <TP,TR> TR accept(Visitor<TP,TR> visitor, TP param){
        return visitor.visit(this,param);
    }
}
