package com.hrushikesh;

import java.util.Arrays;

//	https://leetcode.com/problems/relative-sort-array/description/
public class Leetcode_RelativeSortArray {

	public static void main(String[] args) {
		int[] arr1 = { 2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19 };
		int[] arr2 = { 2, 1, 4, 3, 9, 6 };
		int[] freq = new int[1001];
		int[] ans = new int[arr1.length];
		int x = 0;
		for (int i : arr1) {
			freq[i]++;
		}
		for (int i : arr2) {
			while (freq[i] > 0) {
				ans[x++] = i;
				freq[i]--;
			}
		}
		for (int i = 0; i < freq.length; i++) {
			while (freq[i] > 0) {
				ans[x++] = i;
				freq[i]--;
			}
		}
		System.out.println(Arrays.toString(ans));
	}

}
