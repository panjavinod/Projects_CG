package com.cg;

import java.util.Scanner;

public class MultidimensionalArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("---------------------Enter The Row Size------------------");
		int row=sc.nextInt();
		System.out.println("------------------Enter The Coloum Size------------------");
		int colum=sc.nextInt();
		System.out.println("--------------------Enter The Array Elements-----------------");
		int a[][]=new int[row][colum];
		for(int i=0;i<row;i++) {
			for(int j=0;j<colum;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("------------------Printing Array Elements--------------------");
		for(int i=0;i<row;i++) {
			for(int j=0;j<colum;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
		System.out.println("----------------------Add The TWo Matrix----------------------");
		int b[][]= {{1,2,3},{1,2,3}};
		int sum[][] =new int[row][colum];
		for(int i=0;i<row;i++) {
			for(int j=0;j<colum;j++) {
				sum[i][j]=a[i][j]+b[i][j];
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<colum;j++) {
				System.out.print(sum[i][j]+" ");
			}
			System.out.println("");
		}
		System.out.println("----------------------Multiply The TWo Matrix----------------------");
		int bb[][]= {{1,2,3},{1,2,3}};
		int summ[][] =new int[row][colum];
		for(int i=0;i<row;i++) {
			for(int j=0;j<colum;j++) {
				summ[i][j]=a[i][j]*b[i][j];
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<colum;j++) {
				System.out.print(summ[i][j]+" ");
			}
			System.out.println("");
		}
		
	}

}
