package interpreter;

import interpreter.bytecode.ByteCode;
import java.util.Vector;

//Holds verified byte codes. Probably want a vector
public class Program {

  private Vector<ByteCode> program;

  public void addCode(ByteCode code){
    program.add(code);
  }
  public Program(){
    program = new Vector<>();
  }
  public ByteCode getCode(int programCounter) {

    return program.get(programCounter);
  }
}