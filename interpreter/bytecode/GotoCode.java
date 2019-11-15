package interpreter.bytecode;

import interpreter.VirtualMachine;

public class GotoCode extends ByteCode {
    private String label;

    public GotoCode() {
    }

    @Override
    public void execute(VirtualMachine vm) {
        System.out.println("yee");

    }
    public void init(String[] tokens){
        label = tokens[1];
    }

}
