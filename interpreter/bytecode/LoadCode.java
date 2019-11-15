package interpreter.bytecode;

import interpreter.VirtualMachine;

public class LoadCode extends ByteCode {
    private int offset;
    private String loadVariable;
    @Override
    public void execute(VirtualMachine vm) {

    }

    public LoadCode() {
    }

    @Override
    public void init(String[] tokens) {
        offset = Integer.parseInt(tokens[1]);
        loadVariable = tokens[2];

    }
}
