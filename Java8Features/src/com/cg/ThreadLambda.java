package com.cg;

public class ThreadLambda {

	public static void main(String[] args) {
		Runnable r1=new Runnable() {

			@Override
			public void run() {
				System.out.println("Thread is running ");
				}
		};
		Runnable r2=()->{
			
				System.out.println("Thread two is running");
			
		};
		Thread t1=new Thread(r1);
		t1.start();
		Thread t2=new Thread(r2);
		t2.start();

}
}
