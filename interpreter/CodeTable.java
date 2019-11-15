package interpreter;

import interpreter.bytecode.HaltCode;
import interpreter.bytecode.WriteCode;

import java.util.Hashtable;

//holds logic and hashmap for string references to their objects.
public class CodeTable {
  private static Hashtable<String, String> codeMap = new Hashtable<String, String>();

  public static void init () {
    codeMap.put("LIT", "LitCode" );
    codeMap.put("HALT", "HaltCode");
    codeMap.put("RETURN", "ReturnCode");
    codeMap.put("BOP", "BopCode");
    codeMap.put("CALL", "CallCode");
    codeMap.put("FALSEBRANCH", "FalseBranchCode");
    codeMap.put("POP", "PopCode");
    codeMap.put("READ", "ReadCode");
    codeMap.put("WRITE", "WriteCode");
    codeMap.put("STORE", "StoreCode");
    codeMap.put("ARGS", "ArgsCode");
    codeMap.put("LABEL", "LabelCode");
    codeMap.put("GOTO", "GotoCode");
    codeMap.put("LOAD", "LoadCode");
  }

//  returns value from hashmap
  public static String get(String code) {

    return codeMap.get(code);
  }
}