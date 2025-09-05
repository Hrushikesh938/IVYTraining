package com.hrushikesh;

import java.util.ArrayList;
import java.util.Arrays;

public class DiceProblem_Subsets {

	public static void main(String[] args) {
		//dice("",4);
		System.out.println(diceReturn("",4));
	}


	private static ArrayList<String> diceReturn(String p, int target) {
		if(target==0) {
			ArrayList<String> list=new ArrayList<>();
			list.add(p);
			return list;
		}
		
		ArrayList<String> result=new ArrayList<>();
		
		for(int i=1;i<=6 && i<=target;i++) {
			result.addAll(diceReturn(p+i,target-i));
		}
		return result;
	}


	private static void dice(String p, int target) {
		if(target==0) {
			System.out.println(p);
			return;
		}
		
		for(int i=1;i<=6 && i<=target;i++) {
			dice(p+i,target-i);
		}
		
	}
}
