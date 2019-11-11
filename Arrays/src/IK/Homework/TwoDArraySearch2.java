package IK.Homework;
/*
 * Given a sorted matrix mat[n][m] and an element ‘x’. 
 * Find position of x in the matrix if it is present, else print -1. Matrix is sorted in a way such that 
 * all elements in a row are sorted in increasing order and for row ‘i’, where 1 <= i <= n-1, 
 * first element of row 'i' is greater than or equal to the last element of row 'i-1'. 
 * The approach should have O(log n + log m) time complexity.
 */
public class TwoDArraySearch2 {

  public static void main(String[] args) {
    int[][] mat = { {1, 5, 9, 11},
      {14, 20, 21, 26},
      {30, 34, 43, 50} };
    int x = 34;
    searchArray(mat, x);

  }

  private static void searchArray(int[][] mat, int x) {
    int i = 0;
    int j = mat.length - 1;
    if(x < mat[0][0] || x > mat[j][j]) {
      System.out.println("Element cant be found");
      return;
    }
    
    int size = mat.length;
    while (i < size && j >= 0) {
      if (mat[i][j] == x) {
        System.out.println("Element found at row " + i + " Col " + j);
        return;
      } else if (mat[i][j] > x)
        j--;
      else if (mat[i][j] < x)
        i++;
    }
    System.out.println("Element not found");
  }
}