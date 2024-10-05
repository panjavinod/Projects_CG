package com.demo.observer;

public class Subscriber {
 private String name;
 private Chanel chanel =new Chanel();
  
 public Subscriber(String name) {
	super();
	this.name = name;
}
 public void update() {
	 System.out.println(name+" " +"Video updated"+ chanel.title);
 }
 public void subScribeChannel(Chanel ch) {
	 chanel = ch;
 }
}
