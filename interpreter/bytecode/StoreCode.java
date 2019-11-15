package interpreter.bytecode;

import interpreter.VirtualMachine;

public class StoreCode extends ByteCode {

    @Override
    public void execute(VirtualMachine vm) {

    }

    public StoreCode() {
    }

    @Override
    public void addArgs(String[] tokens) {
        System.out.println(tokens[0] + tokens[1] + tokens[2]);
    }
}
