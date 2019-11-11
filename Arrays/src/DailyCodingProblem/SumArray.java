package DailyCodingProblem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * 08/16/2019 Given a list of numbers and a number k, return whether any two numbers from the list add up to k. you may
 * assume that each input would have exactly one solution, and you may not use the same element twice.
 * 
 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
 * 
 * Bonus: Can you do this in one pass?
 * 
 * https://www.youtube.com/watch?v=TcsYEnMrnFo
 */

public class SumArray {

  public static void main(String[] args) {
    int[] arr = {10, 15, 3, 7};
    int target = 10;
    System.out.println(findPair(arr, target).toString());

  }

  private static List<Integer> findPair(int[] arr, int target) {

    Map<Integer, Integer> numMap = new HashMap<Integer, Integer>();
    List<Integer> res = new ArrayList<Integer>();

    for (int i = 0; i < arr.length; i++) {
      int rem = target - arr[i];
      if (numMap.containsKey(rem)) {
        res.add(i);
        res.add(numMap.get(rem));
      } else {
        numMap.put(arr[i], i);
      }
    }
    return res;

  }

}
