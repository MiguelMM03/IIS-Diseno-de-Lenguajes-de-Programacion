package ast;

public interface Expression extends ASTNode {
    boolean getLValue();
    void setLValue(boolean bool);
    void setType(Type type);
    Type getType();

}
