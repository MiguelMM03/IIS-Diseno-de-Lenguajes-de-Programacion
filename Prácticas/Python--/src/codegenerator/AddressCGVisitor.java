package codegenerator;

import ast.definitions.VariableDef;
import ast.expressions.Variable;
import ast.types.IntType;

public class AddressCGVisitor extends AbstractCGVisitor<Void,Void>{
    private CodeGenerator cg;
    public AddressCGVisitor(CodeGenerator cg) {
        this.cg=cg;
    }
    /*
        address[[Variable: expression -> ID]]
            if(expression.definition.scope==0){
                <pusha> expression.definition.offset
            }
            else{
                <push bp>
                <pushi> expression.definition.offset
                <addi>
            }

     */
    @Override
    public Void visit(Variable ast, Void param) {
        if(ast.getDefinition().getScope()==0){
            cg.pusha(((VariableDef)ast.getDefinition()).getOffset());
        }
        else{
            cg.pushbp();
            cg.push(((VariableDef)ast.getDefinition()).getOffset());
            cg.add(IntType.getInstance());
        }
        return null;
    }
}
