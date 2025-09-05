package com.hrushikesh;

public class StackDemo {
	
	public static void main(String[] args) throws Exception {
		Stack s= new Stack();
		//System.out.println(s.pop());
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		System.out.println(s.pop());
		s.add(6);
		System.out.println(s.pop());
	}

}

class Stack{
	private int[] arr;
	
	private int ptr = -1;
	
	private final static int DEFAULT_SIZE = 5;
	
	public Stack() {
		this(DEFAULT_SIZE);
	}
	
	public Stack(int size) {
		arr = new int[size];
	}
	
	public void add(int item) {
		if(ptr==arr.length - 1) {
			System.out.println("limit exceeded");
			return;
		}
		ptr++;
		arr[ptr] = item;
		System.out.println("Inserted");
	}
	
	public int pop() throws Exception {
		if(ptr==-1) {
			throw new Exception("Stack empty");
		}
		return arr[ptr--];
	}
}
