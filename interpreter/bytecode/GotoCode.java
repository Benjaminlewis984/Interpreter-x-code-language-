package interpreter.bytecode;

import interpreter.VirtualMachine;

public class GotoCode extends ByteCode {
    String literal;

    public GotoCode() {
    }

    @Override
    public void execute(VirtualMachine vm) {
        System.out.println("yee");

    }
    public void addArgs(String[] tokens){
        literal = tokens[1];
        System.out.println(tokens[0] +"          " + tokens[1]);
    }

}
