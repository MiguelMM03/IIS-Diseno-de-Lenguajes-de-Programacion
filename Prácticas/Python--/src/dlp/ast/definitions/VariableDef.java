package dlp.ast.definitions;

import dlp.ast.Type;

public class VariableDef extends AbstractDefinition{

    public VariableDef(int line, int column, String name, Type type) {
        super(line, column, name, type);
    }
}
