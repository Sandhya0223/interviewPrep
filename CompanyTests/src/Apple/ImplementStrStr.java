package Apple;

public class ImplementStrStr {

  public static void main(String[] args) {
    String stck = "GeeksForGeeks";
    String needle = "Fori";
    System.out.println(findNeedleInStack(stck, needle));

  }

  private static int findNeedleInStack(String stck, String needle) {
    if (stck.length() < 0)
      return -1;
    if (needle.length() < 0 || needle.length() > stck.length())
      return -1;

    int needleLen = needle.length();
    for (int i = 0; i < stck.length(); i++) {
      String str = stck.substring(i, i + needleLen);
      if (str.contentEquals(needle))
        return i;
    }
    return -1;
  }

}
