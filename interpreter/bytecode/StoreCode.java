package interpreter.bytecode;

import interpreter.VirtualMachine;

public class StoreCode extends ByteCode {
    private int offset;
    private String variableName;

    @Override
    public void execute(VirtualMachine vm) {
    }

    public StoreCode() {
    }

    @Override
    public void init(String[] tokens) {
        offset = Integer.parseInt(tokens[1]);
        variableName = tokens[2];
    }
}
