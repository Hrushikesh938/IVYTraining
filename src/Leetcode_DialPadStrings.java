package com.hrushikesh;

public class Leetcode_DialPadStrings {
	
	public static void main(String[] args) {
		find("","12");
	}

	private static void find(String p, String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		
		int digit=up.charAt(0)-'0';
		for(int i=(digit-1)*3;i<3*digit;i++) {
			char ch=(char) ('a'+i);
			
			find(p+ch,up.substring(1));
		}
		
	}

}
