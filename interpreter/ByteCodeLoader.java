package interpreter;

import interpreter.bytecode.ByteCode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class ByteCodeLoader {

  private BufferedReader source;
  private String nextLine;
  private boolean isPriorEndLine = true;
  LinkedList<String> items = new LinkedList<String>();

  public ByteCodeLoader(String byteCodeFile) throws IOException{
      try {
        source = new BufferedReader( new FileReader( byteCodeFile ));
        while ( isPriorEndLine ) {
        nextLine = source.readLine();
        if ( nextLine == null ){
            isPriorEndLine = false;
            source.close();
            break;
        }
        items.add(nextLine);
        }
      } catch (IOException e){
        throw new IOException();
      }

  }

  public Program loadCodes(){
    Program program = new Program();
    String[] tokens;

    try {
      for (int i = 0; i < items.size(); i++) {
        tokens = items.get(i).split(" ");

        ByteCode code = (ByteCode) Class.forName("interpreter.bytecode." + CodeTable.get(tokens[0])).newInstance();
        code.init(tokens);
        program.addCode(code);
      }
      } catch(ClassNotFoundException | InstantiationException | IllegalAccessException e){
        System.out.println("Load Codes***");
      }
    return null;
  }
}