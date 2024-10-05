package com.cg;
enum Level{
	LOW,
	MEDIUM,
	HIGH,
}

public class Enum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Level Myvar=Level.MEDIUM;
		switch(Myvar) {
		case LOW:
			System.out.println("LoW");
			break;
		case MEDIUM:
			System.out.println("MEDIUM");
			break;
		case HIGH:
			System.out.println("HIGH");
			break;
		}

	}

}
