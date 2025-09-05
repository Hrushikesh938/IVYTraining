package com.hrushikesh;

public class ConcurrentExample {

    public static void main(String[] args) {
        // Task 1: Counting numbers
        Runnable countTask = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Number: " + i);
                try { Thread.sleep(100); } catch (InterruptedException e) { }
            }
        };

        // Task 2: Printing letters
        Runnable letterTask = () -> {
            for (char c = 'A'; c <= 'E'; c++) {
                System.out.println("Letter: " + c);
                try { Thread.sleep(100); } catch (InterruptedException e) { }
            }
        };

        Thread thread1 = new Thread(countTask);
        Thread thread2 = new Thread(letterTask);

        // Start both threads
        thread1.start();
        thread2.start();
    }
}
