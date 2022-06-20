package java_collections.Arrays;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		/**
		 * binary search
		 */
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int index = Arrays.binarySearch(nums, 4);

		System.out.println("number 4 is at the index of: " + index);

		/**
		 * sort
		 */
		int[] nums2 = { 5, 2, 1, 4, 3, 6, 9, 7, 8 };
		Arrays.sort(nums2);
		System.out.println("Sorted: " + Arrays.toString(nums2)); // Sorted: [1, 2, 3, 4, 5, 6, 7, 8, 9]

		/**
		 * copy
		 */
		int[] nums3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] copy3 = Arrays.copyOf(nums3, nums3.length);
		for (int i : copy3) {
			System.out.print(i + " ");
		}

		// when specified length is longer than actual length
		int[] nums4 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] copy4 = Arrays.copyOf(nums4, 15);
		for (int i : copy4) {
			System.out.print(i + " "); // 1 2 3 4 5 6 7 8 9 0 0 0 0 0 0
		}

		// when specified length is longer than actual length
		int[] nums5 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] copy5 = Arrays.copyOf(nums5, 6);
		for (int i : copy5) {
			System.out.print(i + " "); // 1 2 3 4 5 6
		}

	}

}
