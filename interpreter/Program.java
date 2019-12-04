package interpreter;

import interpreter.bytecode.ByteCode;

import java.util.HashMap;
import java.util.Vector;

public class Program {

  private Vector<ByteCode> program;
  private String labelFinder = "12";
  private HashMap<String, Integer> addressResolver;
  private int currentAddress = 0;

  public void addCode(ByteCode code) {
    program.add(code);
    addressResolver = new HashMap<>();
  }

public int getLength(){
    return program.size();
}

  public Program(){
    program = new Vector<>();
  }

  public ByteCode getCode(int programCounter) {
    return program.get(programCounter);
  }
}