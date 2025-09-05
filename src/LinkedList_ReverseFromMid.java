package com.hrushikesh;

import com.hrushikesh.LL.Node;

public class LinkedList_ReverseFromMid {
	public static void main(String[] args) {
		
		LL list=new LL();
		list.insertLast(1);
		list.insertLast(2);
		list.insertLast(3);
		list.insertLast(4);
		list.insertLast(5);
		list.insertLast(6);
		list.insertLast(7);
		
		list.reverseFromMid();
		
		list.display();
	}

}
