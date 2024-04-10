package codegenerator;

import ast.Definition;
import ast.Program;
import ast.definitions.FunctionDef;
import ast.definitions.VariableDef;
import ast.types.FunctionType;
import ast.types.RecordField;
import ast.types.StructType;

public class OffSetVisitor extends AbstractCGVisitor<Void,Void>{
    int offset=0;

    @Override
    public Void visit(VariableDef ast, Void param) {
        ast.setOffset(offset);
        offset += ast.getType().numberOfBytes();
        return null;
    }
    @Override
    public Void visit(FunctionDef ast, Void param){
        int offset = -4;
        for(VariableDef def:ast.getVars()){
            def.setOffset(offset);
            offset -= def.getType().numberOfBytes();
        }
        return null;
    }

    @Override
    public Void visit(StructType ast, Void param) {
        int offset = 0;
        for(RecordField def:ast.getRecordFields()){
            def.setOffset(offset);
            offset += def.getType().numberOfBytes();
        }
        return null;
    }

    @Override
    public Void visit(FunctionType ast, Void param) {
        int offset = 4;
        for(int i=ast.getParams().size();i>0;i--){
            VariableDef def=ast.getParams().get(i);
            def.setOffset(offset);
            offset += def.getType().numberOfBytes();
        }
        return null;
    }


}
