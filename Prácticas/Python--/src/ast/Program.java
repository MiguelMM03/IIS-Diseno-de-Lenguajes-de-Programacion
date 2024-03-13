package ast;

import semantic.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Program extends AbstractASTNode {
    private List<Definition> definitions=new ArrayList<>();
    public Program(List<Definition> definitions){
        super(0,0);
        this.definitions=definitions;
    }

    public List<Definition> getDefinitions() {
        return this.definitions;
    }
    @Override
    public <TP,TR> TR accept(Visitor<TP,TR> visitor, TP param){
        return visitor.visit(this,param);
    }
}
