package com.cg;

import java.util.Scanner;

public class MultiThread extends Thread{
	public static void run(int n) {
		for(int i=1;i<=n;i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.out.println("Enter the number");
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 MultiThread t=new MultiThread();
 run(n);
 t.start();
	}

}
