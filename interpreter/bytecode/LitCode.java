package interpreter.bytecode;

import interpreter.VirtualMachine;

public class LitCode extends ByteCode {
    private String litVariable;
    private int value;
    @Override
    public void execute(VirtualMachine vm) {

    }

    public LitCode() {
    }

    public void init(String[] tokens){
        value = Integer.parseInt(tokens[1]);
        if (tokens.length == 3){
            litVariable = tokens[2];
        }
    }
}
