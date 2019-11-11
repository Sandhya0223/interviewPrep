package BasicSortingAlgorithms;

import java.util.Arrays;

public class InsertionSort {
  static int[] arr = {1, 5, 7, 2, 4, 6, 3, 7};

  public static void main(String[] args) {
    InsertionsortAl(arr);
    System.out.println(Arrays.toString(arr));
  }

  private static void InsertionsortAl(int[] arr) {

    int hole = 0;
    int minVal=Integer.MIN_VALUE;
    
    for (int i = 1; i < arr.length - 1; i++) {
      minVal = arr[i];
      hole =i;
      
      while(hole > 0 && arr[hole-1]> minVal) {
        arr[hole] = arr[hole-1];
        hole--;
      }
      arr[hole] = minVal;
    }
  }
}
