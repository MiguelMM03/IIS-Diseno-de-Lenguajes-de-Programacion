package ast;

import visitor.Visitor;

public class AbstractASTNode implements ASTNode{
    private int line;
    private int column;
    public AbstractASTNode(int line, int column){
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

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return null;
    }
}
