package com.hrushikesh;

import java.util.Arrays;

public class RangeQuery {
	public static void main(String[] args) {
		int[] arr= {1,2,3,5,6,7,9,8,10};
		
		int n = arr.length;
		int sqrt = (int) Math.sqrt(n);
		int block_size = -1;
		
		int[] blocks = new int[sqrt+1];
		int i=0;
		while(i<n) {
			if(i%sqrt==0) {
				block_size++;
			}
			blocks[block_size]+=arr[i];
			i++;
		}
		System.out.println(Arrays.toString(blocks));
		System.out.println(findSumInRange(blocks, 2 , 5, arr, sqrt));
		
	}
	
	private static int findSumInRange(int[] blocks,int left,int right,int[] arr,int sqrt) {
		int sum=0;
		while(left%sqrt!=0) {
			sum+=arr[left];
			left++;
		}
		
		while(left+sqrt<=right && left<arr.length) {
			sum+=blocks[left/sqrt];
			left+=sqrt;
		}
		
		while(left<=right && left<arr.length) {
			sum+=arr[left];
			left++;
		}
		
		return sum;
	}
}
