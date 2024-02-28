package ast.types;

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
}
