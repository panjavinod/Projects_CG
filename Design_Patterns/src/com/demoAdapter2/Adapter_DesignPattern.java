package com.demoAdapter2;

public class Adapter_DesignPattern {

	public static void main(String[] args) {
		Ios_Six IS=new ChargeAdapter();
		// Creating ChargingStatus object 
		ChargingStatus cs=new ChargingStatus();
		// Setting status to the Ios_Six Interface
		cs.setSatus(IS);
		// Calling chargeStatus method and passing string data
		cs.chargeStatus("You can charge now without your charger");
	}

}
