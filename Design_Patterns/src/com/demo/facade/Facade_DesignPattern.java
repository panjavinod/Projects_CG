package com.demo.facade;

public class Facade_DesignPattern {

	public static void main(String[] args) {
		ShopFacade sf=new ShopFacade();
		sf.iphoneSale();
		sf.samsungSale();
		sf.blackberrySale();

	}

}
