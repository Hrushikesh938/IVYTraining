package com.hrushikesh;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sorting_IntersectionOfArrays {
	
	public static void main(String[] args) {
		int[] nums1= {1,2,3};
		int[] nums2= {2,3,5};
		int[] res=answer(nums1,nums2);
		System.out.print(Arrays.toString(res));
	}
	
	public static int[] answer(int[] nums1, int[] nums2) 
	{
		int[] a = null,b=null;
		List<Integer> list=new ArrayList<>();
		Map<Integer,Integer> map=new HashMap<>();
		if(nums1.length>nums2.length) {
			Arrays.sort(nums1);
			a=nums1;
			b=nums2;
		}
		else {
			Arrays.sort(nums2);
			a=nums2;
			b=nums1;
		}
		for(int num:b) {
			if(num>=a[0] && num<=a[a.length-1] && !map.containsKey(num)) {
				int s=0,e=a.length;
				while(s<=e) {
					int mid=s+(e-s)/2;
					
					if(a[mid]<num) {
						s=mid+1;
					}
					else if(a[mid]>num) {
						e=mid-1;
					}
					else {
						map.put(num, 1);
						list.add(num);
						break;
					}
				}
			}
		}
		int[] ans=new int[list.size()];
		for (int i = 0; i < list.size(); i++) 
        {
            ans[i] = list.get(i);
        }
		return ans;
	}
}

