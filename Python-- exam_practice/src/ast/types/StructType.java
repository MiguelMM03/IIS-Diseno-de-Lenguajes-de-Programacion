package ast.types;

import ast.ASTNode;
import ast.Type;
import semantic.Visitor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StructType extends AbstractType {
    private List<RecordField> recordFields=new ArrayList<>();
    public StructType(int line, int column, List<RecordField>recordFields){
        super(line, column);
        this.recordFields= recordFields;
    }

    public List<RecordField> getRecordFields() {
        return recordFields;
    }
    @Override
    public <TP,TR> TR accept(Visitor<TP,TR> visitor, TP param){
        return visitor.visit(this,param);
    }
    @Override
    public Type dot(String field, ASTNode ast) {
        for (RecordField recordField : recordFields) {
            if (recordField.getName().equals(field)) {
                return recordField.getType();
            }
        }
        return new ErrorType(ast.getLine(),ast.getColumn(),"Field "+field+" cannot be accessed from "+this);

    }
    @Override
    public int numberOfBytes() {
        int numberOfBytes=0;
        for(RecordField recordField:recordFields){
            numberOfBytes+=recordField.getType().numberOfBytes();
        }
        return numberOfBytes;
    }
    @Override
    public String toString() {
        return "StructType";
    }

    @Override
    public RecordField getField(String field) {
        for (RecordField recordField : recordFields) {
            if (recordField.getName().equals(field)) {
                return recordField;
            }
        }
        return null;
    }
}
