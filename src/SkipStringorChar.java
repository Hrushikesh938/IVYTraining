package com.hrushikesh;

public class SkipStringorChar {
	
	public static void main(String[] args) {
		//skip("","bccaada");
		//String ans=skip("bcaadaab");
		subSeq("","abc");
		//System.out.println(ans);
	}

	private static void subSeq(String p, String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		char ch=up.charAt(0);
			subSeq(p,up.substring(1));	
			subSeq(p+ch,up.substring(1));
	}

	private static String skip(String up) {
		if(up.isEmpty()) {
			return "";
		}
		
		char ch=up.charAt(0);
		if(ch=='a') {
			return skip(up.substring(1));
		}
		else {
			return ch+skip(up.substring(1));
		}
	}

	private static void skip(String p, String up) {
		if(up.isEmpty()) {
			System.out.print(p);
			return;
		}
		
		char ch=up.charAt(0);
		
		if(ch=='a') {
			skip(p,up.substring(1));
		}
		else {
			skip(p+ch,up.substring(1));
		}
	}

}
