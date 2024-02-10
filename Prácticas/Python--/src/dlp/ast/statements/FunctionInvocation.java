package dlp.ast.statements;

import dlp.ast.Expression;

public class FunctionInvocation extends AbstractStatement implements Expression {
    public FunctionInvocation(int line, int column) {
        super(line, column);
    }
}
