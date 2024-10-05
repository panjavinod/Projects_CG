package com.demo.singlone;

public class Singletone_DesignPattern {

	public static void main(String[] args) {
		System.out.println("Early Instantiation: creation of instance at load time");
		MarketStore ms1=MarketStore.getInstance();
		System.out.println(ms1);
		MarketStore ms2=MarketStore.getInstance();
		System.out.println(ms2);


	}

}
