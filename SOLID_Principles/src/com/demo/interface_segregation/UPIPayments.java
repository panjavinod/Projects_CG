package com.demo.interface_segregation;

public interface UPIPayments {
	//do not force any client to implement an interface which is irrelevant to them“.
    public void payMoney();
    
    public void getScratchCard();
    
    public void getCashBackAsCreditBalance();
}
