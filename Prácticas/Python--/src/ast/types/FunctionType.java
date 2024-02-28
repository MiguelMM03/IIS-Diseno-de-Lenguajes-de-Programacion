package ast.types;

import ast.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FunctionType extends AbstractType  {
    private Type returnType;
    private List<Type> params=new ArrayList<>();
    public FunctionType(int line, int column, Type returnType, Type...params){
        super(line, column);
        this.returnType=returnType;
        this.params= Arrays.stream(params).toList();
    }

    public Type getReturnType() {
        return returnType;
    }

    public List<Type> getParams() {
        return params;
    }
}
