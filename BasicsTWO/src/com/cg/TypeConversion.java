package com.cg;

public class TypeConversion {

	public static void main(String[] args) {
		System.out.println("---------- Char To String-----------");
		char ch='c';
		String s=String.valueOf(ch);
		String st = Character.toString(ch);
		System.out.println(s);
		
		System.out.println("---------- int To String-----------");
		int a=200;
		String s1=String.valueOf(a);
		System.out.println(s1);
		
		System.out.println("---------- char To int-----------");
		char aa='a';
		char b='e';
		int num1=aa;
		int num2=b;
//		int num1 = Character.getNumericValue(aa);
//	    int num2 = Character.getNumericValue(b);
		System.out.println(num1);
		System.out.println(num2);
		
		System.out.println("---------- int To char-----------");
		int no1=65;
		char c1=(char)no1;
		System.out.println(c1);
		
		System.out.println("---------- int To long-----------");
        int n1=23;
        long long1=n1;
        double bb=n1;
        System.out.println(long1);
        System.out.println(bb);
        
        System.out.println("---------- long to int-----------");
        long l1=123456;
        double loo=678;
        int in=(int)l1;
        int ii=(int)loo;
        System.out.println(in);
        System.out.println(ii);
        
        System.out.println("---------- string To boolean-----------");
        String str1 = "true";
        String str2 = "false";

        boolean b1 = Boolean.parseBoolean(str1);
        boolean b2 = Boolean.parseBoolean(str2);

      
        System.out.println(b1);    // true
        System.out.println(b2);    // false
        
        System.out.println("----------premitive to wrraper ----------");
        int var1 = 5;
        double var2 = 5.65;
        Integer obj1 = Integer.valueOf(var1);
        Double obj2 = Double.valueOf(var2);
        if(obj1 instanceof Integer) {
            System.out.println("An object of Integer is created.");
          }

          if(obj2 instanceof Double) {
            System.out.println("An object of Double is created.");
          }
          System.out.println("----------wrraper to premitive ----------");  
          Integer obj11 = Integer.valueOf(23);
          Double obj22 = Double.valueOf(5.55);
          int var11 = obj11.intValue();
          double var22 = obj22.doubleValue();
          System.out.println("The value of int variable: " + var11);
          System.out.println("The value of double variable: " + var22);
          
	}

}
