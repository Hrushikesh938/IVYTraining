package com.hrushikesh;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class SlidingWindowDemo {
	public static void main(String[] args) {
		int[] arr= {1,3,-1,-3,5,3,6,7};
		int k=3,n=arr.length;
		int[] r=new int[n-k+1];
		int ri=0;
		Deque<Integer> q= new ArrayDeque<>();
		
		for(int i=0;i<n;i++) {
			if(!q.isEmpty() && q.peek()==i-k) {
				q.poll();
			}
			while(!q.isEmpty()&&arr[q.peekLast()]<=arr[i]) {
				q.pollLast();
			}
			q.offer(i);
			if(i>=k-1) {
				r[ri++]=arr[q.peek()];
			}
		}
		System.out.println(Arrays.toString(r));
	}

}
