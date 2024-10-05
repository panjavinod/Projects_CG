package com.demo.singlone;

public class MarketStore {
	
	// instance should be private static
	private static MarketStore ms=new MarketStore();
	
	// constuctor should be private
	private MarketStore(){
		
	}
	//method should return the instance
	public static MarketStore getInstance() {
		return ms;
		
	}
	
}
