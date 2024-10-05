package com.demoAdapter2;

public class ChargingStatus 
{
	// Creating Ios_Six variable to assign the data to the Interface Using Setters and getters
	private Ios_Six satus;
	
    public Ios_Six getSatus() {
		return satus;
	}
	public void setSatus(Ios_Six satus) {
		this.satus = satus;
	}
	
	// here creating the method chargeStatus to now the charge status
    public void chargeStatus(String str) {
	satus.charge(str);
    }
}
