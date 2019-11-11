package Apple;

public class ReverseInteger {

  public static void main(String[] args) {
    int val = 23456001;
    reverseInt(val);

  }

  private static void reverseInt(int val) {
    int reverse = 0;
    while (val > 0) {
      int val1 = val % 10;
      val = val / 10;
      reverse = reverse * 10 + val1;

    }
    System.out.println(reverse);
  }

}
