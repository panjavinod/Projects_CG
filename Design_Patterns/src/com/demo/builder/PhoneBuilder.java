package com.demo.builder;

public class PhoneBuilder {
	private String os;
	private String ram;
	private String processor;
	private String screeSize;
	private String battery;
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public PhoneBuilder setRam(String ram) {
		this.ram = ram;
		return this;
	}
	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public PhoneBuilder setScreeSize(String screeSize) {
		this.screeSize = screeSize;
		return this;
	}
	public PhoneBuilder setBattery(String battery) {
		this.battery = battery;
		return this;
	}
	public Phone getPhone() {
		return new Phone(os,ram,processor,screeSize,battery);
		
	}

}
