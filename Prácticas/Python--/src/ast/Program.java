package ast;

import java.util.ArrayList;
import java.util.List;

public class Program extends AbstractASTNode {
    private List<Definition> definitions=new ArrayList<>();
    public Program(List<Definition> definitions){
        super(0,0);
        this.definitions=definitions;
    }
}
