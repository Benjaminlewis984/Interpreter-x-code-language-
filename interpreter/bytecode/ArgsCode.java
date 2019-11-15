package interpreter.bytecode;

import interpreter.VirtualMachine;

public class ArgsCode extends ByteCode {
    private int argumentAmount;

    public ArgsCode() {
    }

    @Override
    public void execute(VirtualMachine vm) {

    }

    @Override
    public void addArgs(String[] tokens) {
        System.out.println(tokens[0]);
    }
}
