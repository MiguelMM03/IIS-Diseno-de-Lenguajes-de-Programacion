package dlp.ast.types;

import dlp.ast.Type;

public class Array implements Type {
    private int size;
    private Type type;

    public Array(int size, Type type) {
        this.size = size;
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public Type getType() {
        return type;
    }
}
