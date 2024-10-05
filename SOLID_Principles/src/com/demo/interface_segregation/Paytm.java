 package com.demo.interface_segregation;

public class Paytm implements UPIPayments{

	@Override
	public void payMoney() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getScratchCard() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getCashBackAsCreditBalance() {
		// this feature are not support
		
	}

}
