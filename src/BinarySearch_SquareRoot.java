/* SQRT of a number in integer value */
package com.hrushikesh;



import java.util.Arrays;

class BinarySearch_SquareRoot
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int ans=-1;
		int x=6;
		int s=0,e=x;
		while(s<=e) {
			int mid=s+(e-s)/2;
			System.out.println("Start :"+s+" ,Mid :"+mid+" ,End :"+e);
			if(mid>x/mid) {
				e=mid-1;
			}
			else if(mid<x/mid) {
				s=mid+1;
			}
			else {
				ans=mid;
				break;
			}
		}
		if(ans==-1)
			ans=e;
		System.out.print(ans);
	}
}