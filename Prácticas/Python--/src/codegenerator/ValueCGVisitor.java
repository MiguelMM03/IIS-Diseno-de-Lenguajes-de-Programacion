package codegenerator;

public class ValueCGVisitor extends AbstractCGVisitor<Void,Void>{
    private CodeGenerator cg;
    public ValueCGVisitor(CodeGenerator cg) {
        this.cg=cg;
    }
}
