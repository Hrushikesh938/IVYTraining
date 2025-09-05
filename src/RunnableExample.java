package com.hrushikesh;

class Sample implements Runnable{
	
	private Runnable runnable;
	
	public Sample(Runnable runnable) {
		this.runnable=runnable;
	}
	
	@Override
	public void run() {
		
		if(runnable!=null) {
			runnable.run();
		}
	}
}

public class RunnableExample {
	
	static int v=0;
	
	public static void main(String[] args) throws InterruptedException {
		Runnable r=() -> System.out.println("Sample");
		Sample s=new Sample(r);
		s.run();
		
		String msg1="Hi started";
		String msg2="Hi ended";
		Runnable runnable = () -> add();
		Runnable runnable2 = () -> add();
		
		Thread t1=new Thread(runnable);
		Thread t2=new Thread(runnable2);
		
		t1.start();
		t2.sleep(10);
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(v);
		
		Runnable runnable3 = () -> print(msg1);
		Runnable runnable4 = () -> print(msg2);
		Runnable runnable5 = () -> print("Bye");
		
		Thread t3=new Thread(runnable3);
		Thread t4=new Thread(runnable4);
		Thread t5=new Thread(runnable5);
		
		t3.start();
		t4.start();	
		t5.start();
		
	}
	
	private static void add() {
		for(int i=0;i<100000;i++) {
			v++;
		}
	}

	private static void print(String msg) {
		for(int i=0;i<5;i++) {
			System.out.println(msg);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
