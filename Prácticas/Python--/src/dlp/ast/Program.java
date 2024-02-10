package dlp.ast;

import java.util.ArrayList;
import java.util.List;

public class Program implements ASTNode {
    private List<Definition> definitions=new ArrayList<>();
    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
