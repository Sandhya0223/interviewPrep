package BasicSortingAlgorithms;

import java.util.Arrays;

//https://www.youtube.com/watch?v=GUDLRan2DWM&list=PL2_aWCzGMAwKedT2KfDMB9YA5DgASZb3U&index=2

public class SelectionSort {

  static int[] arr = {1, 5, 7, 2, 4, 6, 3, 7,0};

  public static void main(String[] args) {
    sSort(arr);
    System.out.println(Arrays.toString(arr));
  }

  private static void sSort(int[] arr) {
    int minIndex = 0;
    for (int i = 0; i < arr.length; i++) {
      minIndex = i;
     for(int j=i+1;j<arr.length;j++) {
         if(arr[j] < arr[minIndex])
           minIndex = j;
     }
       int temp = arr[minIndex];
       arr[minIndex] = arr[i];
       arr[i]= temp;

    }


  }


}
