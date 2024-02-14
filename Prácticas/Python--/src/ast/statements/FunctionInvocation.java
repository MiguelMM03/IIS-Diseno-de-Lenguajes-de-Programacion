package ast.statements;

import ast.Expression;

public class FunctionInvocation extends AbstractStatement implements Expression {
    public FunctionInvocation(int line, int column) {
        super(line, column);
    }
}
