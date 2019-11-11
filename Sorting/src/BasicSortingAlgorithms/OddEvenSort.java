package BasicSortingAlgorithms;

//https://en.wikipedia.org/wiki/Odd–even_sort

import java.util.Arrays;

public class OddEvenSort {
  static int[] arr = {1, 5, 7, 2, 4, 6, 3, 7};

  public static void main(String[] args) {
    oeSort(arr);
    System.out.println(Arrays.toString(arr));
  }

  private static void oeSort(int[] arr) {
    boolean sorted = false;

    while (!sorted) {
      sorted = true;
      for (int i = 1; i < arr.length - 1; i = i + 2) {
        if (arr[i] > arr[i + 1]) {
          swap(arr, i, i + 1);
          sorted = false;
        }
      }

      for (int i = 0; i < arr.length - 1; i = i + 2) {
        if (arr[i] > arr[i + 1]) {
          swap(arr, i, i + 1);
          sorted = false;
        }
      }
    }

  }

  private static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;

  }

}
