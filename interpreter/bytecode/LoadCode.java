package interpreter.bytecode;

import interpreter.VirtualMachine;

public class LoadCode extends ByteCode {
    @Override
    public void execute(VirtualMachine vm) {

    }

    public LoadCode() {
    }

    @Override
    public void addArgs(String[] tokens) {
        System.out.println(tokens[0] + tokens[1] + tokens[2]);
    }
}
