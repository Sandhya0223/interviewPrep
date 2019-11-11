package VMWare;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ProgrammerString {

  static final String str = "programmer";
  static final int len = 10;


  public static void main(String[] args) {
    String s = "programmerxxxprozmerqgram";
    System.out.println(programmerStrings(s));
  }

  private static int programmerStrings(String s) {
    if (s.length() < len)
      return -1;

    int endIndex = len;
    int incrementIndex = 0;
    int startIndex = len;


    while (endIndex < s.length()) {

      if (Isprogrammer(s.substring(startIndex, endIndex), str)) {
        startIndex = endIndex + 1;
        endIndex = endIndex + 10;
      } else {
        incrementIndex++;
        endIndex++;
      }
    }

    System.out.println(startIndex + " " + endIndex + " " + incrementIndex);
    return incrementIndex;

  }

  private static boolean Isprogrammer(String substring, String programmerString) {
    int len = substring.length();
    Character[] charArr = programmerString.chars().mapToObj(c -> (char) c).toArray(Character[]::new);
    int minSt = -1;
    int minend = -1;
    int minlen = -1;
    for (int st = 0; st <= len - 1; st++) {
      Set<Character> copySet = new HashSet<Character>();
      Collections.addAll(copySet, charArr);
      for (int end = st; end <= len - 1; end++) {
        if (copySet.contains(substring.charAt(end))) {
          copySet.remove(substring.charAt(end));
          if (copySet.size() == 0) {
            if (minlen == -1 || minlen > (end - st)) {
              minSt = st;
              minend = end;
              minlen = end - st;
              return true;
            }
          }
        }
      }
      // System.out.println(str.substring(minSt, minend + 1));
    }
    return false;
  }

}
