package interpreter.bytecode;

import interpreter.VirtualMachine;

public class LabelCode extends ByteCode {
    private String label;
    private int address;

    @Override
    public void execute(VirtualMachine vm) {
    }

    public LabelCode() {
    }


    public void init(String[] tokens){
        label = tokens[1];
    }
    public void setLabelAddress(int address){
        this.address = address;
    }
}
