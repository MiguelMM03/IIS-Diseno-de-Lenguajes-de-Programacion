package ast.expressions;

import ast.Expression;
import ast.Statement;

import java.util.ArrayList;
import java.util.List;

public class FunctionCall extends AbstractExpression implements Statement {

    private Variable name;
    private List<Expression> params=new ArrayList<>();
    public FunctionCall(int line, int column,Variable name, List<Expression> params) {
        super(line, column);
        this.name=name;
        this.params=params;
    }

    public Variable getName() {
        return name;
    }

    public List<Expression> getParams() {
        return params;
    }
}
