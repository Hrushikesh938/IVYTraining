package com.hrushikesh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
public class LeetcodePractice_Sorting {
	
	public static void main(String[] args) {
		int[] nums= {8,1,2,2,2};
        int[] temp=new int[nums.length];
        for(int i=0;i<temp.length;i++) {
        	temp[i]=nums[i];
        }
        int k=0;
        int[] res=new int[nums.length];
        Arrays.sort(temp);
        int[] check=new int[temp[temp.length-1]+1];
        Arrays.fill(check, -1); 
        for(int i=0;i<temp.length;i++) {
        	if(check[temp[i]]!=-1)
        		continue;
        	check[temp[i]]=i;
        }
        for(int i:nums){
            res[k++]=check[i];
        }
        System.out.println(Arrays.toString(res));
	}

}
