package com.hrushikesh;
import java.util.Arrays;

public class Sorting_Bubble_Selection {
	public static void main(String[] args) {
		int[] arr= {4,5,3,2,1};
		//bubble(arr);
		//selection(arr);
		//insertion(arr);
		cyclicSort(arr);
		System.out.print(Arrays.toString(arr));
	}

	private static void cyclicSort(int[] arr) {
		int i=0;
		while(i<arr.length) {
			int correct=arr[i]-1;
			if(arr[i]!=arr[correct]) {
				swap(arr,i,correct);
			}
			else {
				i++;
			}
		}
		
	}

	private static void insertion(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j>0;j--) {
				if(arr[j]<arr[j-1])
					swap(arr, j, j-1);
				else
					break;
			}
		}
		
	}

	private static void selection(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int last=arr.length-i-1;
			int maxIndex=findMax(arr,0,last);
			swap(arr,maxIndex,last);
		}
		
	}

	private static void swap(int[] arr, int i, int last) {
		int temp=arr[i];
		arr[i]=arr[last];
		arr[last]=temp;
		
	}

	private static int findMax(int[] arr, int start, int last) {
		int max=start;
		for(int i=0;i<=last;i++) {
			if(arr[i]>arr[max]) {
				max=i;
			}
		}
		return max;
	}

	private static void bubble(int[] arr) {
		boolean swapped=false;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j]<arr[j-1]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					swapped=true;
				}
			}
			if(!swapped) {
				break;
			}
		}
		
	}

}
