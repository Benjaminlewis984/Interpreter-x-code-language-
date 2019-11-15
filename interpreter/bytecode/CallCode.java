package interpreter.bytecode;

import interpreter.VirtualMachine;

public class CallCode extends ByteCode {
    @Override
    public void execute(VirtualMachine vm) {

    }

    public CallCode() {
    }

    @Override
    public void addArgs(String[] tokens) {
        System.out.println(tokens[0] + " " + tokens[1]);
    }
}
