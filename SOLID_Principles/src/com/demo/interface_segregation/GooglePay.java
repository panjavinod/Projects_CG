package com.demo.interface_segregation;

public class GooglePay implements UPIPayments{

	@Override
	public void payMoney() {	
	}

	@Override
	public void getScratchCard() {
	
	}

	@Override
	public void getCashBackAsCreditBalance() {
		// this feature are in Gpay
		
	}

}
