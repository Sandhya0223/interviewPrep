package BasicSortingAlgorithms;

import java.util.Arrays;

public class Quicksort {

  public static void main(String[] args) {
    int[] arr = {1, 4, 6, 8, 9, 2, 3, 7, 7};
    int size = arr.length;
    qsort(arr, 0, size - 1);
    System.out.println(Arrays.toString(arr));
  }

  private static void qsort(int[] arr, int st, int end) {
    if (st > end)
      return;
    else {
      int pi = qsortHelper(arr, st, end);
      qsort(arr, st, pi - 1);
      qsort(arr, pi + 1, end);
    }

  }

  private static int qsortHelper(int[] arr, int st, int end) {
    int i = st;
    int j = end;
    int pivot = arr[st];
    while (i < j) {
      while (arr[i] <= pivot && i < end)
        i++;
      while (pivot < arr[j] && j > st)
        j--;
      if (i <= j) {
        int swap = arr[i];
        arr[i] = arr[j];
        arr[j] = swap;
      }
    }
    
    System.out.println("st " + st + " i " + i + " j " + j);
    
    if (arr[j] < pivot) {
      int temp = arr[j];
      arr[j] = arr[st];
      arr[st] = temp;
    }
    return j;
  }

}
