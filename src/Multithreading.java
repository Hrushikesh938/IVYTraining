package com.hrushikesh;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Multithreading {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(10);
		for (int i = 0; i < 100; i++) {
			int x = i;
			executor.submit(() -> process(x));
		}
		executor.shutdown();
		System.out.println("Started main");
	}

	private static void process(int i) {
		for (int k = i * 10 + 1; k <= i * 10 + 10; k++) {
			System.out.println(Thread.currentThread().getName()+" : "+k);
		}
		
	}
}
