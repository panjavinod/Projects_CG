package com.cg;

public class Adress {
	 String area;
	 String state;
	 int pincode;
	public Adress(String area, String state, int pincode) {
		super();
		this.area = area;
		this.state = state;
		this.pincode = pincode;
	}
	
	
	@Override
	public String toString() {
		return "area=" + area + ", state=" + state + ", pincode=" + pincode + " ";
	}

}
