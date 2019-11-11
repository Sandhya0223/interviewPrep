package BasicSortingAlgorithms;

public class BinarySearch {

  public static void main(String[] args) {
    int[] arr = {3, 4, 5, 9, 10, 19, 20, 45, 50};
    int key = 450;
    System.out.println(findBS(arr, key, 0, arr.length-1));

  }

  private static int findBS(int[] arr, int key, int start, int end) {
    if (start >= end)
      return -1;
    else {
      int mid = (start + end) / 2;
      if (key == arr[mid])
        return mid;
      else if (key < arr[mid]) {
        end = mid - 1;
        return findBS(arr, key, start, end);
      } else {
        start = mid + 1;
        return findBS(arr, key, start, end);
      }
    }

  }

}
