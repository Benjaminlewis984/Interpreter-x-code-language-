package interpreter.bytecode;

import interpreter.VirtualMachine;

public class LabelCode extends ByteCode {
    private String label;

    @Override
    public void execute(VirtualMachine vm) {
        System.out.println("yee");

    }

    public LabelCode() {
    }

    public void init(String[] tokens){
        label = tokens[1];
    }
}
