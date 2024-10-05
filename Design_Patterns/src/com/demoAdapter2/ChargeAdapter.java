 package com.demoAdapter2;

public class ChargeAdapter implements Ios_Six {
    
	// we cant create  object for interface directly
	
	// so i'm creating the Ios_Four Object 
	Ios_Four IF=new Ios_Four();
	@Override
	public void charge(String str) {
		// here I'm composeing the Ios_Four object data into the Ios_Six object
		IF.check(str);
	}
}
