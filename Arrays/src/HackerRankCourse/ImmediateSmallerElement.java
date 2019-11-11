package HackerRankCourse;

import java.util.Arrays;
import java.util.Scanner;

public class ImmediateSmallerElement {

  public static void main(String[] args) {
//     Scanner scanner = new Scanner(System.in);
//     int numberofTCs = scanner.nextInt();
//     for (int i = 1; i <= numberofTCs; i++) {
//     int arraySize = scanner.nextInt();
//     int[] array = new int[arraySize];
//     for (int j = 0; j < arraySize; j++) {
//     array[j] = scanner.nextInt();
//     }
//     System.out.println("smallerElementArray" + "\n" + Arrays.toString(smallerElementArray(array)));
//    
//     }
    //int[] arr = {4, 2, 1, 5, 3};
    int[] arr = {468, 335 ,501 ,170, 725 ,479 ,359, 963 ,465, 706 ,146 ,282, 828, 962 ,492 ,996 ,943, 828, 437 ,392, 605 ,903, 154 ,293, 383, 422, 717 ,719 ,896 ,448 ,727 ,772 ,539 ,870, 913,668 ,300, 36 ,895, 704 ,812, 323};
    System.out.println("ElementArray" + "\n" + Arrays.toString(arr));
    System.out.println("smallerElementArray" + "\n" + Arrays.toString(smallerElementArray(arr)));
  }

  private static int[] smallerElementArray(int[] array) {
    int[] smallerArray = new int[array.length];
    for (int i = 0; i < array.length; i++) {
      if (i == array.length - 1) {
        smallerArray[i] = -1;
      }

      else {
        if (array[i + 1] < array[i])
          smallerArray[i] = array[i + 1];
        else
          smallerArray[i] = -1;
      }
    }
    return smallerArray;
  }

}
