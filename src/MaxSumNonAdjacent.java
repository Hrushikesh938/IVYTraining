package com.hrushikesh;

public class MaxSumNonAdjacent {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 1 };
		int result = findMaxSumNonAdjacent(arr);
		System.out.println("Maximum sum of non-adjacent elements: " + result);
	}

	public static int findMaxSumNonAdjacent(int[] arr) {
		int include = 0; // Sum including the current element
		int exclude = 0; // Sum excluding the current element

		for (int num : arr) {
			// Temporarily store the previous 'include' value
			int newExclude = Math.max(include, exclude);

			// Update 'include' to be 'exclude + current element'
			include = exclude + num;

			// Update 'exclude' to the maximum sum without the current element
			exclude = newExclude;
		}

		// The result is the maximum of including or excluding the last element
		return Math.max(include, exclude);
	}
}
