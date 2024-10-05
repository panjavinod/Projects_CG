package com.demo.builder;

public class Phone {
	private String os;
	private String ram;
	private String processor;
	private String screeSize;
	private String battery;
	public Phone(String os, String ram, String processor, String screeSize, String battery) {
		super();
		this.os = os;
		this.ram = ram;
		this.processor = processor;
		this.screeSize = screeSize;
		this.battery = battery;
	}
	@Override
	public String toString() {
		return "Phone [os=" + os + ", ram=" + ram + ", processor=" + processor + ", screeSize=" + screeSize
				+ ", battery=" + battery + "]";
	}
	

}
