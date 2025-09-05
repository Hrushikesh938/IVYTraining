package com.hrushikesh;


public class LinkedList {
	
	public static void main(String[] args) {
		LL list=new LL();
		list.insertLast(5);
		list.insertLast(5);
		list.insertLast(1);
		list.insertAtIndex(2, 1);
		list.display();
	}

}

class LL{
	
	private Node head;
	private Node tail;
	private int size;
	
	public LL() {
		this.size=0;
	}
	
	public void insertFirst(int value) {
		Node node=new Node(value);
		node.next=head;
		head=node;
		
		if(tail==null) {
			tail=head;
		}
		
		size++;
	}
	
	public void insertAtIndex(int val,int index) {
		Node temp=head;
		if(index==0) {
			insertFirst(val);
			return;
		}
		for(int i=1;i<index;i++) {
			temp=temp.next;
		}
		Node node=new Node(val);
		node.next=temp.next;
		temp.next=node;
	}
	
	public void insertLast(int value) {
		Node node=new Node(value);
		if(tail==null) {
			tail=node;
			head=node;
		}
		tail.next=node;
		tail=node;
		
		size++;
	}
	
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.value+"->");
			temp=temp.next;
		}
		System.out.println("END");
	}
	
	class Node{
		private int value;
		Node next;
		
		public Node(int value) {
			this.value=value;
		}
		
		public Node(int value, Node next) {
			this.value=value;
			this.next=next;
		}
	}

	public void reverseFromMid() {
		Node mid=findMid();
		Node temp=head;
		while(temp.next!=mid) {
			temp=temp.next;
		}
		temp.next = reverse(mid);
	}

	private Node reverse(Node mid) {
		Node nh = null;
		while(mid!=null) {
			Node node = mid;
			mid=mid.next;
			node.next=nh;
			nh=node;
		}
		return nh;
	}

	private Node findMid() {
		Node fast = head;
		Node slow = head;
		while(fast!=null && fast.next!=null) {
			fast = fast.next.next;
			slow=slow.next;
		}
		return slow;
	}

	public void rotate(int k) {
		Node last = head;
		int length=1;
		while(last.next!=null) {
			last=last.next;
			length++;
		}
		
		last.next=head;
		int rotate = k%length;
		int skip=length - rotate;
		Node newLast=head;
		for(int i=0;i<skip-1;i++) {
			newLast = newLast.next;
		}
		head = newLast.next;
		newLast.next=null;
		
	}

	
}
