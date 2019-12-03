package interpreter.bytecode;

import interpreter.VirtualMachine;

public class PopCode extends ByteCode {
    private int stackLevel;

    @Override
    public void execute(VirtualMachine vm) {
    }

    public PopCode() {
    }

    @Override
    public void init(String[] tokens) {
        stackLevel = Integer.parseInt(tokens[1]);
    }
}
