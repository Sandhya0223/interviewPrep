package HackerRankCourse;
// https://www.geeksforgeeks.org/program-for-nth-fibonacci-number/

public class FibonacciSeries {


  public static void main(String[] args) {
    int n = 9;
    System.out.println(fiboRecur(n));
    System.out.println(fiboitr(n));
    System.out.println(fiboDP(n));
  }

  private static int fiboDP(int n) {
    int[] fibArr = new int[n + 1];
    fibArr[0] = 0;
    fibArr[1] = 1;
    for (int i = 2; i <= n; i++) {
      fibArr[i] = fibArr[i - 1] + fibArr[i - 2];
    }
    return fibArr[n];
  }


  private static int fiboitr(int n) {
    int result = 0;
    int n1 = 0, n2 = 1;

    for (int i = 2; i <= n; i++) {
      result = n1 + n2;
      n1 = n2;
      n2 = result;
    }
    return result;
  }

  private static int fiboRecur(int n) {
    if (n <= 1)
      return n;
    return fiboRecur(n - 1) + fiboRecur(n - 2);

  }

}
