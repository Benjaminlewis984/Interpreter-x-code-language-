package interpreter;

import interpreter.bytecode.HaltCode;
import interpreter.bytecode.WriteCode;

import java.util.Hashtable;

//holds logic and hashmap for string references to their objects.
public class CodeTable {
  private  static Hashtable<String, String> codeMap = new Hashtable<String, String>();

  public static void init () {
    codeMap.put("LIT", "interpreter.bytecode.LitCode" );
    codeMap.put("HALT", "HaltCode");
    codeMap.put("Return", "ReturnCode");
    codeMap.put("Bop", "BopCode");
    codeMap.put("Call", "CallCode");
    codeMap.put("FalseBranch", "FalseBranchCode");
    codeMap.put("Pop", "PopCode");
    codeMap.put("Read", "ReadCode");
    codeMap.put("Write", "WriteCode");
    codeMap.put("Store", "StoreCode");
    codeMap.put("Args", "ArgsCode");
    codeMap.put("Label", "LabelCode");
    codeMap.put("Goto", "GotoCode");
    codeMap.put("Load", "LoadCode");
  }

//  returns value from hashmap
  public static String get(String code) {

    return codeMap.get(code);
  }
}