package codegenerator;

import ast.Definition;
import ast.Program;
import ast.Statement;
import ast.definitions.FunctionDef;
import ast.definitions.VariableDef;
import ast.types.FunctionType;
import ast.types.RecordField;
import ast.types.StructType;
import semantic.AbstractVisitor;

public class OffSetVisitor extends AbstractVisitor<Void,Void> {
    int offset=0;
    int localOffset=0;

    @Override
    public Void visit(VariableDef ast, Void param) {
        if(ast.getScope()==0){
            ast.setOffset(offset);
            offset += ast.getType().numberOfBytes();
        }else{
            this.localOffset-= ast.getType().numberOfBytes();
            ast.setOffset(localOffset);
        }
        ast.getType().accept(this,param);
        return null;
    }
    @Override
    public Void visit(FunctionDef ast, Void param){
        int localOffset = 0;
        ast.getType().accept(this,param);
        for(VariableDef def:ast.getVars()){
            def.accept(this,param);
        }
        for(Statement st:ast.getBody()){
            st.accept(this,param);
        }
        return null;
    }

    @Override
    public Void visit(StructType ast, Void param) {
        int offset = 0;
        for(RecordField def:ast.getRecordFields()){
            def.setOffset(offset);
            offset += def.getType().numberOfBytes();
            def.getType().accept(this,param);
        }
        return null;
    }

    @Override
    public Void visit(FunctionType ast, Void param) {
        int offset = 4;
        for(int i=ast.getParams().size()-1;i>=0;i--){
            VariableDef def=ast.getParams().get(i);
            def.setOffset(offset);
            offset += def.getType().numberOfBytes();
        }
        return null;
    }


}
