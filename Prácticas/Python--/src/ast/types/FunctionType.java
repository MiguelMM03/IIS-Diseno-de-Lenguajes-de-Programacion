package ast.types;

import ast.Type;
import ast.definitions.VariableDef;
import semantic.Visitor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FunctionType extends AbstractType  {
    private Type returnType;
    private List<VariableDef> params=new ArrayList<>();
    public FunctionType(int line, int column, Type returnType, List<VariableDef> params){
        super(line, column);
        this.returnType=returnType;
        this.params= params;
    }

    public Type getReturnType() {
        return returnType;
    }

    public List<VariableDef> getParams() {
        return params;
    }
    @Override
    public <TP,TR> TR accept(Visitor<TP,TR> visitor, TP param){
        return visitor.visit(this,param);
    }
}
