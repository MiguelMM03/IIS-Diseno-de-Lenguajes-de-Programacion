package ast.types;

import ast.ASTNode;
import ast.AbstractASTNode;
import ast.Type;
import ast.definitions.VariableDef;

public class RecordField extends AbstractASTNode {
    private String name;
    private Type type;
    public RecordField(int line, int column, String name, Type type){
        super(line,column);
        this.name=name;
        this.type=type;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        RecordField r = (RecordField) obj;
        return getName().equals(r.getName());
    }
}
