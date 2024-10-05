package com.cg;

public class RemoveWhiteSpace {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="my name is";
char[] strArray =s.toCharArray();
StringBuffer stringBuffer = new StringBuffer(); 
String a="";
//for(int i=0;i<strArray.length;i++) {
//	if ((strArray[i] != ' ') && (strArray[i] != '\t')) {  
//        stringBuffer.append(strArray[i]);
//        a+=strArray[i];
//    }  
//  }
for(int i=0;i<s.length();i++) {
	if ((s.charAt(i)!= ' ') && (s.charAt(i) != '\t')) {  
        stringBuffer.append(s.charAt(i));
        a+=s.charAt(i);
    }  
  }
System.out.println(stringBuffer);
System.out.println(a);
}
}
