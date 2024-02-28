package ast.types;

import ast.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Struct extends AbstractType {
    private List<RecordField> recordFields=new ArrayList<>();
    public Struct(int line, int column,RecordField...recordFields){
        super(line, column);
        this.recordFields= Arrays.stream(recordFields).toList();
    }

    public List<RecordField> getRecordFields() {
        return recordFields;
    }
}
