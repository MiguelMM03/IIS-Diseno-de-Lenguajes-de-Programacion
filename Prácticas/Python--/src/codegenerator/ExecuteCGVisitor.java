package codegenerator;

import ast.Definition;
import ast.Program;
import ast.definitions.FunctionDef;
import ast.definitions.VariableDef;
import ast.statements.Print;

public class ExecuteCGVisitor extends AbstractCGVisitor<Void,Void>{
    private CodeGenerator cg;
    private AddressCGVisitor address=new AddressCGVisitor(cg);
    private ValueCGVisitor value=new ValueCGVisitor(cg);
    public ExecuteCGVisitor(CodeGenerator cg) {
        this.cg=cg;
    }
    /*
    execute[[Program: program -> definition*]]
        definition*.forEach(def->{
            if(def instance of VarDefinition){
                execute[[def]]
            }
        })
        CALL MAIN
        HALT
        definition*.forEach(def->{
            if(def instance of FuncDefinition){
                execute[[def]]
            }
        })
     */
    @Override
    public Void visit(Program ast, Void param) {
        for(Definition def: ast.getDefinitions()){
            if(def instanceof VariableDef){
                def.accept(this,param);
            }
        }
        cg.call("main");
        cg.halt();
        for(Definition def: ast.getDefinitions()){
            if(def instanceof FunctionDef){
                def.accept(this,param);
            }
        }
        return null;
    }
    /*
    execute[[Print: statement->expression]]
        value[[expression]]()
        <out> expression.type.suffix();
     */
    @Override
    public Void visit(Print ast, Void param) {
        ast.getExpression().accept(value,param);
        cg.out(ast.getExpression().getType());
        return null;
    }

}
