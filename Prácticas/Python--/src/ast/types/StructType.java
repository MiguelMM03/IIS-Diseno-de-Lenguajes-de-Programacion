package ast.types;

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
}
