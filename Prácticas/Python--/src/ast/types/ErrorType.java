package ast.types;

import semantic.Visitor;

public class ErrorType extends AbstractType{
    private String message;
    public ErrorType(int line, int column, String message) {
        super(line, column);
        this.message=message;
    }

    public String toString(){
        return String.format("Error (line: %d, column: %d): %s",this.getLine(),this.getColumn(),this.message);
    }
    @Override
    public <TP,TR> TR accept(Visitor<TP,TR> visitor, TP param){
        return visitor.visit(this,param);
    }
}
