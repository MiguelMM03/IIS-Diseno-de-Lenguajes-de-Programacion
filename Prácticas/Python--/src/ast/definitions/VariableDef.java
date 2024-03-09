package ast.definitions;

import ast.Type;

public class VariableDef extends AbstractDefinition{

    public VariableDef(int line, int column, String name, Type type) {
        super(line, column, name, type);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        VariableDef v = (VariableDef) obj;
        return super.getName().equals(v.getName());
    }

}
