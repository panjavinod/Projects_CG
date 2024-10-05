package com.cg;

public class removeWhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "T    his is b  ett     er.";
        System.out.println("Original sentence: " + sentence);

        sentence = sentence.replaceAll(" ", "");
        System.out.println("After replacement: " + sentence);
	}

}
