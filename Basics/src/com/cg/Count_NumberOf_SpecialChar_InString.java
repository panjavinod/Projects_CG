package com.cg;

public class Count_NumberOf_SpecialChar_InString {

	public static void main(String[] args) {
		String name="cloudtech#$%";
		System.out.print("Special Charecters are in given string ");
		String RemoveSpChars="";
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
			if(!Character.isAlphabetic(ch) && !Character.isDigit(ch) && 
					!Character.isWhitespace(ch)) {
				System.out.print(ch);
			}else {
				RemoveSpChars+=ch;
			}
		}
		System.out.println();
		System.out.println("After removing of special chars from given String ---- "+RemoveSpChars);
	}

}
