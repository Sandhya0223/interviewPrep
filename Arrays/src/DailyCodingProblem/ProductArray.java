package DailyCodingProblem;

import java.util.Arrays;

/*
 * Given an array of integers, return a new array such that each element at index i of the new array is the product of
 * all the numbers in the original array except the one at i.
 * 
 * For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was
 * [3, 2, 1], the expected output would be [2, 3, 6].
 * 
 * Follow-up: what if you can't use division?
 */

public class ProductArray {

  public static void main(String[] args) {
    //int[] arr = {1, 2, 3, 4, 5};
    int[] arr = { 3,2,1};
    findProductArr(arr);

  }

  private static void findProductArr(int[] arr) {
    int[] prodArr = new int[arr.length];
    int mul = 1;

    for (int i = 0; i < arr.length; i++) {
      prodArr[i] = mul;
      mul *= arr[i];
    }

    mul = 1;
    for (int i = arr.length - 1; i >= 0; i--) {
      prodArr[i] *= mul;
      mul *= arr[i];
    }
    
    System.out.println(Arrays.toString(prodArr));
  }

}
