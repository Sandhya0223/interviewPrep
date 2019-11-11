package IK.Homework;

/*
 * Given an n x n matrix and a number x, find the position of x in the matrix if it is present in it. Otherwise, print
 * “Not Found”. In the given matrix, every row and column is sorted in increasing order. The designed algorithm should
 * have linear time complexity.
 * 
 * Keypoints
 * 1. Rows are in increasing order - rows are sorted
 * 2. Columns are increasing order - columns are sorted
 * 
 * https://www.youtube.com/watch?v=ZhG1M_FzxgI
 */
public class TwoDArraySearch {

  public static void main(String[] args) {
    int[][] mat = {{1, 3, 5, 7},{10, 20, 30, 40}, {15, 25, 35, 45}, {27, 29, 37, 48}};
    int x = 3;
    searchArray(mat, x);

  }

  private static void searchArray(int[][] mat, int x) {
    int i = 0;
    int j = mat.length - 1;
    if(x < mat[0][0] || x > mat[j][j])
      System.out.println("Element cant be found");
    
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
