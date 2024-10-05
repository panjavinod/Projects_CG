package com.demo.observer;

public class Observer_Design_Patterns {

	public static void main(String[] args) {
		Chanel youtube=new Chanel();
		Subscriber sc=new Subscriber("rihan");
		Subscriber sc2=new Subscriber("sima");
		Subscriber sc3=new Subscriber("marin");
		
		youtube.subscriber(sc);
		youtube.subscriber(sc2);
		youtube.subscriber(sc3);
		
		sc.subScribeChannel(youtube);
		sc2.subScribeChannel(youtube);
		sc3.subScribeChannel(youtube);
		
		youtube.upload("How to learn programming----?");
	}

}
