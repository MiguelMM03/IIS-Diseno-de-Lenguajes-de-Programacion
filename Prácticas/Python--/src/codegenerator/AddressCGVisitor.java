package codegenerator;

import ast.definitions.VariableDef;
import ast.expressions.ArrayAccess;
import ast.expressions.StructAccess;
import ast.expressions.Variable;
import ast.types.IntType;

public class AddressCGVisitor extends AbstractCGVisitor<Void,Void>{
    private CodeGenerator cg;
    private ValueCGVisitor value;
    public AddressCGVisitor(CodeGenerator cg) {
        this.cg=cg;
        value=new ValueCGVisitor(cg);
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

    /*
    address[[ArrayAccess: expression1 -> expression2 expression3]]
        address[expression2]
        value[expression3]
        <pushi> expression1.type.numberOfBytes()
        <muli>
        <addi>
     */
    @Override
    public Void visit(ArrayAccess ast, Void param) {
        ast.getName().accept(this,param);
        ast.getField().accept(value,param);
        cg.push(ast.getName().getType().numberOfBytes());
        cg.mul(IntType.getInstance());
        cg.add(IntType.getInstance());
        return null;
    }
    /*
    address[[StructAccess: expression1 -> expression2 ID]]
        address[expresion2]
        <pushi> expression2.type.getField(expression1.fieldName).offset
        <addi>

     */
    public Void visit(StructAccess ast, Void param) {
        ast.getName().accept(this,param);
        cg.push(ast.getName().getType().getField(ast.getField()).getOffset());
        cg.add(IntType.getInstance());
        return null;
    }
}
