package ast.types;

import ast.ASTNode;
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
    @Override
    public Type parenthesis(List<Type> types, ASTNode ast) {
        if (types.size() != params.size()) {
            return new ErrorType(ast.getLine(), ast.getColumn(), "Number of parameters does not match");
        }
        for(int i=0;i<types.size();i++){
            Type t=params.get(i).getType().promotesTo(types.get(i),ast); //TODO: Check if this is correct
            if(t instanceof ErrorType){
                return new ErrorType(ast.getLine(), ast.getColumn(), "Type of parameter "+(i+1)+" does not match. Expected: "+params.get(i).getType().toString()+". Found: "+types.get(i).toString());
            }
        }
        return returnType;
    }
    @Override
    public int numberOfBytes() {
        int numberOfBytes=0;
        for(VariableDef param:params){
            numberOfBytes+=param.getType().numberOfBytes();
        }
        return numberOfBytes;
    }
    @Override
    public String toString() {
        return "FunctionType";
    }
}
