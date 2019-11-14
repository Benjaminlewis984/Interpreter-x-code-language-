package interpreter;

import java.util.Hashtable;

//holds logic and hashmap for string references to their objects.
public class CodeTable {
  private  static Hashtable<String, String> codeMap = new Hashtable<String, String>();

  public static void init () {
    codeMap.put("LIT", "interpreter.bytecode.LitCode" );


  }

//  returns value from hashmap
  public static String get(String code) {
    return "";
  }
}