package com.cg;

public class RecursionSentence {
   public static String Recursion(String s) {
    	if(s.isEmpty()) {
    		return s;
    	}else
		return Recursion(s.substring(1))+s.charAt(0);
    	// Hello-->ello+'H' ->llo+'e'+'H' ->lo+'l,e,H ->o+'lleH' -> olleH
   }
//	public static String Recursion(String s) {
//		if(s.isEmpty()) {
//			return "is empty";
//		}else
//		return s;
//		
//    }
	public static void main(String[] args) {
		String s ="Hello";
		String result=Recursion(s);
		System.out.println(result);
		}

}
