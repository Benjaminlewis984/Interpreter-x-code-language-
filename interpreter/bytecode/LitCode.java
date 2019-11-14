package interpreter.bytecode;

import interpreter.VirtualMachine;

public class LitCode extends ByteCode {
    int literal;
    @Override
    public void execute(VirtualMachine vm) {

    }
    public void addArgs(String[] tokens){
        literal = Integer.parseInt(tokens[1]);
    }
}
