package ast.statements;

import ast.Expression;
import ast.Statement;
import semantic.Visitor;

import java.util.ArrayList;
import java.util.List;

public class While extends AbstractStatement{
    private Expression condition;
    private List<Statement> body=new ArrayList<>();
    public While(int line, int column, Expression condition, List<Statement> body) {
        super(line, column);
        this.condition=condition;
        this.body=body;
    }

    public Expression getCondition() {
        return condition;
    }

    public List<Statement> getBody() {
        return body;
    }
    @Override
    public <TP,TR> TR accept(Visitor<TP,TR> visitor, TP param){
        return visitor.visit(this,param);
    }
}
