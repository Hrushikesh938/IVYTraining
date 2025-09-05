package com.hrushikesh;

import java.util.ArrayList;

public class MaxHeap {
	public static void main(String[] args) throws Exception {
		Heap1<Integer> heap = new Heap1<>();
		heap.insert(5);
		heap.insert(3);
		heap.insert(1);
		heap.insert(4);
		heap.insert(2);
		System.out.println(heap.heapSort());
	}
}

class Heap1<T extends Comparable<T>>{
	private ArrayList<T> list;
	
	public Heap1() {
		list = new ArrayList<>();
	}
	
	private int parent(int index) {
		return (index-1)/2;
	}
	
	private int left(int index) {
		return 2*index + 1;
	}
	
	private int right(int index) {
		return 2*index + 2;
	}
	
	private void swap(int first,int second) {
		T temp = list.get(first);
		list.set(first, list.get(second));
		list.set(second, temp);
	}
	
	public void insert(T value) {
		list.add(value);
		upheap(list.size()-1);
	}
	
	private void upheap(int index) {
		if(index==0) {
			return;
		}
		int p = parent(index);
		if(list.get(index).compareTo(list.get(p))>0) {
			swap(index,p);
			upheap(p);
		}
	}
	
	public T remove() throws Exception {
		if(list.isEmpty()) {
			throw new Exception("removing from empty heap!");
		}
		T removed = list.get(0);
		T last = list.remove(list.size()-1);
		if(!list.isEmpty()) {
		list.set(0, last);
		downheap(0);
		}
		
		return removed;
	}
	
	public ArrayList<T> heapSort() throws Exception{
		ArrayList<T> data = new ArrayList<>();
		while(!list.isEmpty()) {
			data.add(this.remove());
		}
		return data;
	}

	private void downheap(int index) {
		int max = index;
		int left = left(index);
		int right = right(index);
		
		if(left < list.size() && list.get(index).compareTo(list.get(left))<0) {
			max = left;
		}
		if(right < list.size() && list.get(index).compareTo(list.get(right))<0) {
			max = right;
		}
		
		if(max!=index) {
			swap(max , index);
			downheap(max);
		}
	}
}