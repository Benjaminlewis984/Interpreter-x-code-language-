package interpreter.bytecode;

import interpreter.VirtualMachine;

public class ReadCode extends ByteCode {
    private String label;
    @Override
    public void execute(VirtualMachine vm) {

    }

    public ReadCode() {
    }

    @Override
    public void addArgs(String[] tokens) {
        label = tokens[0];
        System.out.println(label);
    }
}
