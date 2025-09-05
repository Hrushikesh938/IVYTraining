package com.hrushikesh;

import java.util.HashMap;
import java.util.Map;

public class LRUCacheDemo {
	public static void main(String[] args) {
		LRUCache lRUCache = new LRUCache(2);
		lRUCache.put(1, 1); // cache is {1=1}
		lRUCache.put(2, 2); // cache is {1=1, 2=2}
		lRUCache.display();
	}
}

class LRUCache{
	Node head=new Node(0,0),tail=new Node(0,0);
	Map<Integer,Node> map=new HashMap<>();
	int capacity;

    public LRUCache(int _capacity) {
        capacity = _capacity;
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
    	if(map.containsKey(key)) {
    		Node node = map.get(key);
    		remove(node);
            insert(node);
            return node.value;
    	}
    	return -1;
    }
    
    public void put(int key,int value) {
    	if(map.containsKey(key)) {
    		remove(map.get(key));
    	}
    	if(map.size()==capacity) {
    		remove(tail.prev);
    	}
    	insert(new Node(key,value));
    }
    
    public void insert(Node node) {
    	map.put(node.key, node);
        node.next = head.next;
        node.next.prev = node;
        head.next = node;
        node.prev = head;
    }
    
    public void remove(Node node) {
    	 map.remove(node.key);
         node.prev.next = node.next;
         node.next.prev = node.prev;
    }
    
    public void display() {
    	Node temp = head.next;
    	while(temp!=tail) {
    		System.out.println(temp.key+","+temp.value);
    		temp=temp.next;
    	}
    	System.out.print("END");
    }
	
	class Node {
        Node prev, next;
        int key, value;
        Node(int _key, int _value) {
            key = _key;
            value = _value;
        }
    }
}