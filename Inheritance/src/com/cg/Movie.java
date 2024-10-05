package com.cg;

//single level inheritance
public class Movie {
 public void Entry() {
	 System.out.println("Welcome To Movie");
 }
}
class RRR extends Movie{
	private void Entery() {
	 System.out.println("RRR Movie");
	
	}
}
//multilevel inheritance
class Radhyesyam extends Movie{
	private void Entery() {
		 System.out.println("Radhyesyam Movie");
		
		}
}
class Arya extends Movie{
	private void Entery() {
		super.Entry();
		 System.out.println("Arya Movie");
		
		}
	public static void main(String[]args) {
		Arya aa=new Arya();
		aa.Entery();
		System.out.println("Please choose your Class");
		 System.out.println("Please select tects");
	}
}
