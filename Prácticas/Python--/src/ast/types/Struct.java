package ast.types;

import ast.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Struct implements Type {
    private List<RecordField> recordFields=new ArrayList<>();
    public Struct(RecordField...recordFields){
        this.recordFields= Arrays.stream(recordFields).toList();
    }

    public List<RecordField> getRecordFields() {
        return recordFields;
    }
}
