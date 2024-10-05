package com.demo.builder;

public class Builder_Pattern {

	public static void main(String[] args) {
		Phone details = new PhoneBuilder().setOs("Adroid").setRam("2 GB").getPhone();
		System.out.println(details);
	}

}
