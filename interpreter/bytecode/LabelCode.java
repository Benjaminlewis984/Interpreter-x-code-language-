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

    public void addArgs(String[] tokens){
        System.out.println(tokens[0] +"          " + tokens[1]);
    }
}
