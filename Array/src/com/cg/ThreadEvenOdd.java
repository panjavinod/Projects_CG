package com.cg;

 class even extends Thread //implements Runnable 
 {
	
	
	 public void run() {
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				System.out.println(Thread.currentThread().getName()+" "+i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
	}
}
class odd extends Thread // implements Runnable
{
	public void run() {
		for(int i=1;i<=10;i++) {
			if(i%2!=0) {
				System.out.println(Thread.currentThread().getName()+" "+i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
}
public class ThreadEvenOdd{
	public static void main(String[]args) {
//		Runnable R1=new even();
//		Runnable R2=new odd();
//		Thread T1=new Thread(R1);
//		Thread T2=new Thread(R2);
		even T1=new even();
		odd T2=new odd();
		T1.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		T2.start();
	}
}
