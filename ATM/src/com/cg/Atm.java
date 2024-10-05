package com.cg;

import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
		int balance=100000,deposit,withdraw;
		Scanner sc=new Scanner(System.in);
		while(true) {
			    System.out.println("Automated Teller Machine");  
	            System.out.println("Choose 1 for Withdraw");  
	            System.out.println("Choose 2 for Deposit");  
	            System.out.println("Choose 3 for Check Balance");  
	            System.out.println("Choose 4 for EXIT");  
	            System.out.print("Choose the operation you want to perform:"); 
	            
	            
	            int choice=sc.nextInt();
	            switch(choice) {
	            case 1:
	            	    System.out.println("Enter the money  to be withdraw");
	            	    withdraw=sc.nextInt();
	            	    if(balance>=withdraw) {
	            	     balance=balance-withdraw;
	            		System.out.println("Please collect your cash");
	            		System.out.println("---------------------------------");
	            	    }else {
	            		System.out.println("in sufficient balance");
	            		System.out.println("---------------------------------");
	            	    }
	            	    break;
	            case 2:
	            	    System.out.println("Enter the money to be deposite");
	            	    deposit=sc.nextInt();
	            	    balance=balance+deposit;
	            	    System.out.println("Your Money has been successfully depsited");
	            	    System.out.println("---------------------------------");
	            	    break;
	            case 3:
	            	    System.out.println("Available Balance "+ balance);
	            	    System.out.println("---------------------------------");
	            	    break;
	            case 4:
	            	    System.exit(0);
	            	
	            	     
	            }
		}

	}

}
