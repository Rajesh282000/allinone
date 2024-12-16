package Rough;

import java.util.HashMap;
import java.util.Map;

public class RemVow {
    public static void main(String[] args) {
      String str = "abcdef";
      String s = "cefz";
      str = str.replaceAll("["+s+"]", "");
        System.out.println(str);
    }
}
