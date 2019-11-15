package interpreter.bytecode;

import interpreter.VirtualMachine;

public class LitCode extends ByteCode {
    private String litVariable;
    private int value;
    @Override
    public void execute(VirtualMachine vm) {
        System.out.println("yee");

    }

    public LitCode() {
    }

    public void addArgs(String[] tokens){
        System.out.println(tokens[0] + tokens[1]);
    }
}
