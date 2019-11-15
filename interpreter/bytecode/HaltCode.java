package interpreter.bytecode;

import interpreter.VirtualMachine;

public class HaltCode extends ByteCode {


    @Override
    public void execute(VirtualMachine vm) {

    }

    public HaltCode() {
    }

    @Override
    public void addArgs(String[] tokens) {
        System.out.println(tokens[0]);
    }
}
