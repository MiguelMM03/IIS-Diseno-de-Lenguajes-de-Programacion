package codegenerator;

import ast.definitions.VariableDef;

public class AddressCGVisitor extends AbstractCGVisitor<Void,Void>{
    private CodeGenerator cg;
    public AddressCGVisitor(CodeGenerator cg) {
        this.cg=cg;
    }
    @Override
    public Void visit(VariableDef ast, Void param) {
        cg.comment(ast.getType().toString()+" "+ast.getName()+" (offset "+ast.getOffset()+")");
        return null;
    }
}
