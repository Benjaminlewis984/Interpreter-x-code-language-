package interpreter.bytecode;

import interpreter.VirtualMachine;

public class LabelCode extends ByteCode {
    String literal;
    @Override
    public void execute(VirtualMachine vm) {
        System.out.println("yee");

    }

    public LabelCode() {
    }

    public void addArgs(String[] tokens){
        literal = tokens[1];
        System.out.println(tokens[0] +"          " + tokens[1]);
    }
}
