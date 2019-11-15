package interpreter.bytecode;

import interpreter.VirtualMachine;

public class LitCode extends ByteCode {
    int literal;
    @Override
    public void execute(VirtualMachine vm) {
        System.out.println("yee");

    }

    public LitCode() {
    }

    public void addArgs(String[] tokens){
        literal = Integer.parseInt(tokens[1]);
        System.out.println(tokens[0] + tokens[1]);
    }
}
