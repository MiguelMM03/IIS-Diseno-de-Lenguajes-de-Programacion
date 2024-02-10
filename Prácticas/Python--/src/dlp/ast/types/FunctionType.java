package dlp.ast.types;

import dlp.ast.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FunctionType implements Type {
    private Type returnType;
    private List<Type> params=new ArrayList<>();
    public FunctionType(Type returnType, Type...params){
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
