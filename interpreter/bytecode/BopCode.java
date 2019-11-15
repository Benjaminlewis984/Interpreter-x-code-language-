package interpreter.bytecode;

import interpreter.VirtualMachine;

public class BopCode extends ByteCode {
    private String bopOperation;
    @Override
    public void execute(VirtualMachine vm) {

    }

    public BopCode() {
    }

    @Override
    public void init(String[] tokens) {
        bopOperation = tokens[1];

    }
}
