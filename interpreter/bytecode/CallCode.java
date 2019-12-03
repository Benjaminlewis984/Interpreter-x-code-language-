package interpreter.bytecode;

import interpreter.VirtualMachine;

public class CallCode extends ByteCode {
    private String label;
    @Override
    public void execute(VirtualMachine vm) {

    }

    public CallCode() {
    }

    @Override
    public void init(String[] tokens) {
        label = tokens[1];
    }
}
