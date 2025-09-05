package com.hrushikesh;

import java.util.ArrayList;

public class MinHeap {
	
	public static void main(String[] args) throws Exception {
		Heap heap = new Heap();
		heap.insert(5);
		heap.insert(3);
		heap.insert(1);
		heap.insert(4);
		heap.insert(2);
		System.out.println(heap.heapSort());
	}

}

class Heap {
	
	private ArrayList<Integer> list;
	
	public Heap() {
		list = new ArrayList<>();
	}
	
	private void swap(int first,int second) {
		int temp = list.get(first);
		list.set(first, list.get(second));
		list.set(second, temp);
	}
	
	private int parent(int index) {
		return (index-1)/2;
	}
	
	private int left(int index) {
		return index*2 + 1;
	}
	
	private int right(int index) {
		return index*2 + 2;
	}
	
	public void insert(int value) {
		list.add(value);
		upheap(list.size()-1);
	}

	private void upheap(int index) {
		if(index==0) {
			return;
		}
		int p = parent(index);
		if(list.get(index).compareTo(list.get(p))<0) {
			swap(index,p);
			upheap(p);
		}
	}
	
	public int remove() throws Exception {
		if(list.isEmpty()) {
			throw new Exception("removing from empty heap!");
		}
		int removed = list.get(0);
		int last = list.remove(list.size()-1);
		if(!list.isEmpty()) {
		list.set(0, last);
		downheap(0);
		}
		
		return removed;
	}

	private void downheap(int index) {
		int min = index;
		int left = left(index);
		int right = right(index);
		if(left < list.size() && list.get(min).compareTo(list.get(left))>0) {
			min = left;
		}
		if(right < list.size() && list.get(min).compareTo(list.get(right))>0) {
			min = right;
		}
		
		if(min!=index) {
			swap(min,index);
			downheap(min);
		}
		
	}
	
	public ArrayList<Integer> heapSort() throws Exception{
		ArrayList<Integer> data = new ArrayList<>();
		while(!list.isEmpty()) {
			data.add(this.remove());
		}
		return data;
	}
}