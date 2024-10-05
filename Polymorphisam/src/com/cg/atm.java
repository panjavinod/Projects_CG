package com.cg;
abstract class bank{
	public abstract void withdraw();
	public abstract void deposit();
}
public class atm extends bank {

	
	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("you can withdraw amount");
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("you can deposit amount");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		atm a=new atm();
		a.deposit();
		a.withdraw();

	}


}

