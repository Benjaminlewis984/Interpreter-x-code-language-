package interpreter.bytecode;

import interpreter.VirtualMachine;

public class FalseBranchCode extends ByteCode {
    private String label;

    @Override
    public void execute(VirtualMachine vm) {
    }

    public FalseBranchCode() {
    }

    @Override
    public void init(String[] tokens) {
        label = tokens[1];
    }
}
