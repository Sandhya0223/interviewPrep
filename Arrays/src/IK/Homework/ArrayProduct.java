package IK.Homework;

import java.util.Arrays;

/*
 * Given an array arr[] of n integers, construct a Product Array prod[] (of same size) such that prod[i] is equal to the
 * product of all the elements of arr[] except arr[i]. Solve it without division operator and in O(n).
 * 
 * keyPoints 1. Go forward 2. come backward with multiplicationb
 */
public class ArrayProduct {

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    // int[] proArr = new int[arr.length];
    // int mul = 1;
    // for (int i = 0; i < arr.length; i++) {
    // proArr[i] = mul;
    // mul *= arr[i];
    // }
    // System.out.println(Arrays.toString(proArr));
    // mul = 1;
    // for (int i = arr.length - 1; i >= 0; i--) {
    // proArr[i] *= mul;
    // mul *= arr[i];
    // }
    // System.out.println(Arrays.toString(proArr));

    printpro(arr);
  }

  private static void printpro(int[] arr) {
    int prd[] = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        if (i == j)
          continue;
        if (prd[i] == 0)
          prd[i] = arr[j];
        else
          prd[i] = prd[i] * arr[j];

      }
    }
    System.out.println(Arrays.toString(prd));
  }
  
}


