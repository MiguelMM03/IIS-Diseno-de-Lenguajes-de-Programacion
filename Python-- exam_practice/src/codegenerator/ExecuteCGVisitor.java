package codegenerator;

import ast.Definition;
import ast.Program;
import ast.definitions.FunctionDef;
import ast.definitions.VariableDef;
import ast.expressions.FunctionCall;
import ast.statements.*;
import ast.types.FunctionType;
import ast.types.VoidType;

public class ExecuteCGVisitor extends AbstractCGVisitor<FunctionDef,Void>{
    private CodeGenerator cg;
    private AddressCGVisitor address;
    private ValueCGVisitor value;
    public ExecuteCGVisitor(CodeGenerator cg) {
        this.cg=cg;
        address=new AddressCGVisitor(cg);
        value=new ValueCGVisitor(cg);
        this.value.setAddressVisitor(address);
        this.value.setExecuteVisitor(this);
        this.address.setValueVisitor(value);
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
    public Void visit(Program ast, FunctionDef param) {
        for(Definition def: ast.getDefinitions()){
            if(def instanceof VariableDef){
                def.accept(this,param);
            }
        }
        cg.callMain();
        cg.halt();
        for(Definition def: ast.getDefinitions()){
            if(def instanceof FunctionDef){
                def.accept(this,param);
            }
        }
        return null;
    }
    /*
        execute(FunctionDef: definition -> type ID varDefinition* statement*)
            <label>ID:
            varDefinition*.forEach(v->v.accept(this,param))
            int bytesLocals=varDefinition*.isEmpty()?0:-varDefinition*.get(varDefinition*.size()-1).getOffset();
            <enter> bytesLocals
            int bytesParam=type.params.stream().mapToInt(p->p.getType().numberOfBytes()).sum();
            int bytesReturn=type.getReturnType().numberOfBytes();
            statements*.forEach(s->execute[[s]](bytesLocals, bytesParam, bytesReturn))
            if(bytesReturn==0){
                <ret> bytesReturn <,> bytesLocals <,> bytesParam
            }

     */
    @Override
    public Void visit(FunctionDef ast, FunctionDef param){
        cg.line(ast.getLine());
        this.cg.printFunction(ast.getName());
        cg.comment("Parameters");
        ast.getType().accept(this,param);
        cg.comment("Local variables");
        ast.getVars().forEach(
            v->v.accept(this,param)
        );
        ast.setBytesLocals(ast.getVars().isEmpty()?0:-ast.getVars().get(ast.getVars().size()-1).getOffset());
        cg.enter(ast.getBytesLocals());
        ((FunctionType)ast.getType()).setBytesParam(((FunctionType)ast.getType()).getParams().stream().mapToInt(p->p.getType().numberOfBytes()).sum());
        ((FunctionType)ast.getType()).setBytesReturn(((FunctionType) ast.getType()).getReturnType().numberOfBytes());
        ast.getBody().forEach(
            s->s.accept(this,ast)
        );
        if(((FunctionType)ast.getType()).getBytesReturn()==0) {
            cg.ret(((FunctionType)ast.getType()).getBytesReturn(), ast.getBytesLocals(), ((FunctionType)ast.getType()).getBytesParam());
        }
        return null;
    }
    /*
    execute[[VariableDef: definition -> type ID]]
        <'*>type.toString() ID <(offset >definition.offset<)>
     */
    @Override
    public Void visit(VariableDef ast, FunctionDef param) {
        cg.comment(ast.getType().toString()+" "+ast.getName()+" (offset "+ast.getOffset()+")");
        return null;
    }

    /*
    execute[[FunctionType: type -> variableDefinition* type]]
        variableDefinition*.forEach(v->execute[[v]])
     */
    @Override
    public Void visit(FunctionType ast, FunctionDef param) {
        ast.getParams().forEach(
            v->v.accept(this,param)
        );
        return null;
    }
    /*
    execute[[Asignment: statement -> expression1 expression2]]
        address[[expression1]]()
        value[[expression2]]()
        cg.convertTo(expression2.getType(),expression1.getType())
        <store> expression1.type.suffix();
     */
    @Override
    public Void visit(Asignment ast, FunctionDef param) {
        cg.line(ast.getLine());
        cg.comment("Asignment");
        ast.getLeft().accept(address,null);
        ast.getRight().accept(value,null);
        cg.convertTo(ast.getRight().getType(),ast.getLeft().getType());
        cg.store(ast.getLeft().getType());
        return null;
    }

    /*
    execute[[Print: statement->expression]]
        value[[expression]]()
        <out> expression.type.suffix();
     */
    @Override
    public Void visit(Print ast, FunctionDef param) {
        cg.line(ast.getLine());
        cg.comment("Write");
        ast.getExpression().accept(value,null);
        cg.out(ast.getExpression().getType());
        return null;
    }
    /*
    execute[[Print: statement->expression]]
        address[[expression]]()
        <in> expression.type.suffix();
        <store> expression.type.suffix();
     */
    @Override
    public Void visit(Input ast, FunctionDef param) {
        cg.line(ast.getLine());
        cg.comment("Read");
        ast.getExpression().accept(address,null);
        cg.in(ast.getExpression().getType());
        cg.store(ast.getExpression().getType());
        return null;
    }

    /*
    execute[[While: statement -> expression statement*]]
        String condition=cg.nextLabel();
        String end=cg.nextLabel();
        <condition:>
        value[[expression]]()
        <jz end>
        statement*.forEach(s->execute[[s]])
        <jmp condition>
        <end:>
     */
    @Override
    public Void visit(While ast, FunctionDef param) {
        cg.line(ast.getLine());
        cg.comment("While");
        String condition=cg.getLabel();
        String end=cg.getLabel();
        cg.printLabel(condition);
        ast.getCondition().accept(value,null);
        cg.jz(end);
        ast.getBody().forEach(
            s->s.accept(this,param)
        );
        cg.jmp(condition);
        cg.printLabel(end);
        return null;
    }
    /*
    execute[[For: statement1 -> statement2 expression statement3 statement*]]
        String condition=cg.nextLabel();
        String end=cg.nextLabel();
        execute[[statement2]]
        <condition:>
        value[[expression]]
        <jz end>
        statement*.forEach(s->execute[[s]])
        execute[[statement3]]
        <jmp condition>
        <end:>
     */
    @Override
    public Void visit(For ast, FunctionDef param) {
        cg.line(ast.getLine());
        cg.comment("For");
        String condition=cg.getLabel();
        String end=cg.getLabel();
        ast.getInitialization().accept(this,param);
        cg.printLabel(condition);
        ast.getCondition().accept(value,null);
        cg.jz(end);
        ast.getBody().forEach(
                s->s.accept(this,param)
        );
        ast.getChange().accept(this,param);
        cg.jmp(condition);
        cg.printLabel(end);
        return null;
    }
    /*
    execute[[Conditional: statement -> expression statement*]]
        String elseLabel=cg.nextLabel();
        String end=cg.nextLabel();
        <condition:>
        value[[expression]]()
        <jz elseLabel>
        statement*.forEach(s->execute[[s]])
        <jmp end>
        <elseLabel:>
        statement*.forEach(s->execute[[s]])
        <end:>
     */
    @Override
    public Void visit(Conditional ast, FunctionDef param) {
        String elseLabel=cg.getLabel();
        String end=cg.getLabel();
        cg.line(ast.getLine());
        cg.comment("Conditional");
        ast.getCondition().accept(value,null);
        cg.jz(elseLabel);
        cg.comment("if body");
        ast.getBodyIf().forEach(
            s->s.accept(this,param)
        );
        cg.jmp(end);
        cg.printLabel(elseLabel);
        cg.comment("else body");
        ast.getBodyElse().forEach(
            s->s.accept(this,param)
        );
        cg.printLabel(end);
        return null;
    }

    /*
    execute[[FunctionCall: expression1 -> expression2 expression3]]
            value[[expression1]]()
            <pop> expression1.type.suffix();
     */
    @Override
    public Void visit(FunctionCall ast, FunctionDef param) {
        cg.line(ast.getLine());
        cg.comment("Function call");
        ast.accept(value,null);
        if(!(ast.getType() instanceof VoidType)){
            cg.pop(ast.getType());
        }
        return null;
    }
    /*
    execute[[Return: statement -> expression]] (bytesReturn, bytesLocals,bytesParam)
        value[[expression]]()
        <ret> bytesReturn <,> bytesLocals <,> bytesParam

     */
    @Override
    public Void visit(Return ast, FunctionDef param) {
        cg.line(ast.getLine());
        cg.comment("Return");
        if(ast.getExpression()!=null){
            ast.getExpression().accept(value,null);
            cg.ret(ast.getExpression().getType().numberOfBytes(),param.getBytesLocals(),((FunctionType)param.getType()).getBytesParam());
        }
        else{
            cg.ret(0,param.getBytesLocals(),((FunctionType)param.getType()).getBytesParam());
        }
        return null;
    }

}
