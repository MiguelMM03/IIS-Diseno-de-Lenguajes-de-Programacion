package dlp.ast.expressions;

import dlp.ast.Expression;

import java.util.ArrayList;
import java.util.List;

public class FunctionCall extends AbstractExpression{

    private String name;
    private List<Expression> body=new ArrayList<>();
    public FunctionCall(int line, int column,String name, List<Expression> body) {
        super(line, column);
        this.name=name;
        this.body=body;
    }

    public String getName() {
        return name;
    }

    public List<Expression> getBody() {
        return body;
    }
}
