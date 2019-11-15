package interpreter.bytecode;

import interpreter.VirtualMachine;

public class FalseBranchCode extends ByteCode {

    @Override
    public void execute(VirtualMachine vm) {

    }

    public FalseBranchCode() {
    }

    @Override
    public void addArgs(String[] tokens) {
        String address = tokens[1];
        System.out.println(address);

    }
}
