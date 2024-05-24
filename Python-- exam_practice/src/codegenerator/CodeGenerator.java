package codegenerator;

import ast.Type;
import ast.types.CharType;
import ast.types.DoubleType;
import ast.types.IntType;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CodeGenerator {
    private int labels=0;
    private PrintWriter out;
    public CodeGenerator(String outputFilename, String inputFilename) throws FileNotFoundException {
        this.out=new PrintWriter(outputFilename);
        source(inputFilename);
    }
    public void pushbp(){
        out.println("\tpusha bp");
        out.flush();
    }
    public void push(char constant){
        out.println("\tpushb\t"+(int)constant);
        out.flush();
    }
    public void push(int constant){
        out.println("\tpushi\t"+constant);
        out.flush();
    }
    public void pusha(int constant){
        out.println("\tpusha\t"+constant);
        out.flush();
    }
    public void push(double constant){
        out.println("\tpushf\t"+constant);
        out.flush();
    }
    public void pop(Type type){
        out.println("\tpop"+type.suffix());
        out.flush();
    }
    public void dup(Type type){
        out.println("\tdup"+type.suffix());
        out.flush();
    }
    public void add(Type type){
        out.println("\tadd"+type.suffix());
        out.flush();
    }
    public void sub(Type type){
        out.println("\tsub"+type.suffix());
        out.flush();
    }
    public void mul(Type type){
        out.println("\tmul"+type.suffix());
        out.flush();
    }
    public void div(Type type){
        out.println("\tdiv"+type.suffix());
        out.flush();
    }
    public void mod(Type type){
        out.println("\tmod"+type.suffix());
        out.flush();
    }
    public void arithmetic(Type type, String operator){
        switch (operator){
            case "+":
                add(type);
                break;
            case "-":
                sub(type);
                break;
            case "*":
                mul(type);
                break;
            case "/":
                div(type);
                break;
            case "%":
                mod(type);
                break;
        }
    }

    public void gt(Type type){
        out.println("\tgt"+type.suffix());
        out.flush();
    }
    public void lt(Type type){
        out.println("\tlt"+type.suffix());
        out.flush();
    }

    public void ge(Type type){
        out.println("\tge"+type.suffix());
        out.flush();
    }
    public void le(Type type){
        out.println("\tle"+type.suffix());
        out.flush();
    }
    public void eq(Type type){
        out.println("\teq"+type.suffix());
        out.flush();
    }
    public void ne(Type type){
        out.println("\tne"+type.suffix());
        out.flush();
    }
    public void comparator(Type type, String operator){
        switch (operator){
            case "<":
                lt(type);
                break;
            case ">":
                gt(type);
                break;
            case "<=":
                le(type);
                break;
            case ">=":
                ge(type);
                break;
            case "==":
                eq(type);
                break;
            case "!=":
                ne(type);
                break;
        }
    }
    public void and(){
        out.println("\tand");
        out.flush();
    }
    public void or(){
        out.println("\tor");
        out.flush();
    }
    public void not(){
        out.println("\tnot");
        out.flush();
    }
    public void logical(String operator){
        switch (operator){
            case "&&":
                and();
                break;
            case "||":
                or();
                break;
        }
    }
    public void load(Type type){
        out.println("\tload"+type.suffix());
        out.flush();
    }
    public void store(Type type){
        out.println("\tstore"+type.suffix());
        out.flush();
    }
    public void in(Type type){
        out.println("\tin"+type.suffix());
        out.flush();
    }
    public void out(Type type){
        out.println("\tout"+type.suffix());
        out.flush();
    }
    public void b2i(){
        out.println("\tb2i");
        out.flush();
    }
    public void i2f(){
        out.println("\ti2f");
        out.flush();
    }
    public void f2i(){
        out.println("\tf2i");
        out.flush();
    }
    public void i2b(){
        out.println("\ti2b");
        out.flush();
    }
    public void convertTo(Type from, Type to) {
        if (from.equals(IntType.getInstance())) {
            if (to.equals(CharType.getInstance())) {
                i2b();
            } else if (to.equals(DoubleType.getInstance())) {
                i2f();
            }
        } else if (from.equals(DoubleType.getInstance())) {
            if (to.equals(IntType.getInstance())) {
                f2i();
            } else if (to.equals(CharType.getInstance())) {
                f2i();
                i2b();
            }
        } else if (from.equals(CharType.getInstance())) {
            if (to.equals(IntType.getInstance())) {
                b2i();
            } else if (to.equals(DoubleType.getInstance())) {
                b2i();
                i2f();
            }
        }
        this.out.flush();
    }
    public void printFunction(String functionName) {
        this.out.println("\n " + functionName + ":");
        this.out.flush();
    }
    public void printLabel(String name){
        out.println(name + ":");
        out.flush();
    }
    public String getLabel(){
        return "label"+labels++;
    }
    public void jz(String label){
        out.println("\tjz\t"+label);
        out.flush();
    }
    public void jnz(String label){
        out.println("\tjnz\t"+label);
        out.flush();
    }
    public void jmp(String label){
        out.println("\tjmp\t"+label);
        out.flush();
    }
    public void call(String label){
        out.println("\tcall\t"+label);
        out.flush();
    }
    public void callMain(){
        out.println("call\tmain");
        out.flush();
    }
    public void enter(int bytes){
        out.println("\tenter\t"+bytes);
        out.flush();
    }

    public void ret(int bytesToReturn, int bytesLocalVariables, int bytesArguments) {
        out.println("\tret\t" + bytesToReturn + "," + bytesLocalVariables + "," + bytesArguments);
        out.flush();
    }

    public void halt(){
        out.println("halt");
        out.flush();
    }
    public void comment(String comment){
        out.println("\t'*\t"+comment);
        out.flush();
    }
    public void source(String filename){
        out.println("\n#source\t\""+filename+"\"");
        out.flush();
    }
    public void line(int line){
        out.println("\n#line\t"+line);
        out.flush();
    }

}
