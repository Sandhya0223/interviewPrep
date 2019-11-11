package HackerRankCourse;

import java.util.Arrays;

/*
 * Given an array of N size. The task is to rotate array by d elements where d is less than or equal to N.
 */
public class RotatinganArray {

  public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5};
    int rotationSize = 2;
    rotateArray(array, rotationSize);
    System.out.println(Arrays.toString(array));
  }

  private static void rotateArray(int[] array, int rotationSize) {
    int len = array.length;
    for (int i = 0; i < rotationSize; i++) {
      int temp = array[0];
      for (int j = 0; j < len - 1; j++)
        array[j] = array[j + 1];
      array[len - 1] = temp;
    }    
  }
}
