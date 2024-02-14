package ast.statements;

import ast.Statement;

public class AbstractStatement implements Statement {
    private int line;
    private int column;
    public AbstractStatement(int line, int column){
        this.line=line;
        this.column=column;
    }
    @Override
    public int getLine() {
        return line;
    }

    @Override
    public int getColumn() {
        return column;
    }
}
