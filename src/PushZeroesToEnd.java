package com.hrushikesh;

import java.util.Arrays;

public class PushZeroesToEnd {

	public static void main(String[] args) {
		int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
		int n=arr.length;
		int count = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				if(i!=count) {
				int temp=arr[i];
				arr[i]=arr[count];
				arr[count]=temp;
			}
				count++;
		}
		}
		System.out.println(Arrays.toString(arr));
		
	}
}
