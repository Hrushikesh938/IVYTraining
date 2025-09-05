package com.hrushikesh;

import java.util.Arrays;

public class Recursion {
	
	public static void main(String[] args) {
		
		int fibo=6; //0,1,1,2,3,5,8,13............
		int result=findFibo(fibo);
		System.out.println(result);
		
		int[] arr= {1,3,4,5,20,100};
		int index=binarySearch(arr,1,0,arr.length);
		System.out.println(index);
		
		char[] s = {'h','e','l','l','o'};
		reverse(s,0,s.length-1);
		System.out.println(Arrays.toString(s));
	}

	private static void reverse(char[] arr,int s,int e) {
		if(s==e) {
			return;
		}
		char temp=arr[s];
		arr[s]=arr[e];
		arr[e]=temp;
		reverse(arr,s+1,e-1);
	}

	private static int binarySearch(int[] arr, int target, int s, int e) {
		//base condition
		if(s>e) {
			return -1;
		}
		
		int m=s+(e-s)/2;
		if(arr[m] == target) {
			return m;
		}
		if(target>arr[m]) {
			return binarySearch(arr, target, m+1, e); // Divide & conquer recursion == binary search
		}
		return binarySearch(arr, target, s, m-1); // Divide & conquer recursion == binary search
	}

	private static int findFibo(int n) {
		//base condition
		if(n<2) {
			return n;
		}
		
		return findFibo(n-1)+findFibo(n-2); //linear recursion == fibonacci
	}

}
