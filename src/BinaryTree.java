package com.hrushikesh;

import java.util.Scanner;

public class BinaryTree {
	
	class Node{
		int val;
		Node left;
		Node right;
		
		public Node(int val) {
			this.val=val;
		}
	}
	
	public BinaryTree() {
	}

	private Node root;
	
	public void insert(Scanner sc) {
		System.out.println("Enter the root value");
		int value=sc.nextInt();
		root = new Node(value);
		insert(root,sc);
	}

	private void insert(Node node, Scanner sc) {
		System.out.println("Do u want to enter left of "+node.val);
		boolean left = sc.nextBoolean();
		if(left) {
			System.out.println("enter the value of left of "+node.val);
			int value = sc.nextInt();
			node.left = new Node(value);
			insert(node.left , sc);
		}
		
		System.out.println("Do u want to enter right of "+node.val);
		boolean right = sc.nextBoolean();
		if(right) {
			System.out.println("enter the value of right of "+node.val);
			int value = sc.nextInt();
			node.right = new Node(value);
			insert(node.right , sc);
		}
		
	}
	
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		Scanner sc = new Scanner(System.in);
		bt.insert(sc);
	}
}
