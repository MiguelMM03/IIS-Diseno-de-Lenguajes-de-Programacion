package errorhandler;

import ast.types.ErrorType;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class ErrorHandler {
    private static ErrorHandler errorHandler;
    List<ErrorType> errors=new ArrayList<>();

    private ErrorHandler(){}

    public static ErrorHandler getInstance(){
        if(errorHandler==null){
            errorHandler=new ErrorHandler();
        }
        return errorHandler;
    }
    public boolean anyError(){
        return !errors.isEmpty();
    }
    public void showErrors(PrintStream ps){
        for(ErrorType error: errors){
            ps.println(error.toString());
        }
    }


}
