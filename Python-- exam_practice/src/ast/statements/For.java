package ast.statements;

import ast.Definition;
import ast.Expression;
import ast.Statement;
import semantic.Visitor;

import java.util.ArrayList;
import java.util.List;

public class For extends AbstractStatement{
    private Statement initialization;
    private Expression condition;
    private Statement change;

    private List<Statement> body=new ArrayList<>();
    public For(int line, int column, Statement initialization, Expression condition, Statement change,  List<Statement> body) {
        super(line, column);
        this.initialization=initialization;
        this.condition=condition;
        this.change=change;
        this.body=body;
    }

    public Expression getCondition() {
        return condition;
    }


    public Statement getInitialization() {
        return initialization;
    }

    public Statement getChange() {
        return change;
    }

    public List<Statement> getBody() {
        return body;
    }
    @Override
    public <TP,TR> TR accept(Visitor<TP,TR> visitor, TP param){
        return visitor.visit(this,param);
    }
}
