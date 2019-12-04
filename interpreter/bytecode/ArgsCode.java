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
    public void init(String[] tokens) {
        argumentAmount = Integer.parseInt(tokens[1]);
    }
}
