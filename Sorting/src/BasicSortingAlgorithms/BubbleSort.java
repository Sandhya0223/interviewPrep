package BasicSortingAlgorithms;

import java.util.Arrays;

public class BubbleSort {

	static int[] arr = { 1, 5, 7, 2, 4, 6, 3,7 };

	public static void main(String[] args) {
		bbsort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void bbsort(int[] arr) {
		int size = arr.length;
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (arr[i] > arr[j]) {
					int swap = arr[i];
					arr[i] = arr[j];
					arr[j] = swap;
				}
			}
		}
	}
}
