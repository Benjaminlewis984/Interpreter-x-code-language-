package interpreter;

import interpreter.bytecode.ByteCode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.lang.reflect.*;

//Responsible for seperating based on spaces. Reads each .ine of the code file. (Constctor does that). Sends first part of seperation
//Splits into an array of strings. Offset in bytecode vector
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


  public Program loadCodes(LinkedList<String> items){
    Program program = new Program();
    String[] tokens = new String[3];
    String tokenHolder;

    try{
      for (int i = 0; i < items.size(); i++){
        tokens = items.get(i).split(" ");
      }
      ByteCode code = (ByteCode) Class.forName("interpreter.bytecode." + tokens[0]).newInstance();
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e){
      System.out.println("Load Codes***");
    }


    return null;
  }
}