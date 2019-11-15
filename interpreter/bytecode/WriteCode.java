package interpreter.bytecode;

import interpreter.VirtualMachine;

public class WriteCode extends ByteCode {
    private String label;
    @Override
    public void execute(VirtualMachine vm) {

    }

    public WriteCode() {
    }

    @Override
    public void addArgs(String[] tokens) {
        label = tokens[0];
        System.out.println(label);

    }
}
