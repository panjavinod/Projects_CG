package com.cg;

interface Hello{
	//public String say(String name);
	 int add(int a,int b);  
}
public class Lambda2 {
	
           // using return types
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//       Hello a=name->{ return "Hello,"+name;};
//       System.out.println(a.say("Vinnu"));
//       Hello b=name->{ return "Hello,"+name;};
//       System.out.println(b.say("Vin"));
       
		Hello aa=(a,b)->(a+b);
		System.out.println(aa.add(10,20));  
        
        // Multiple parameters with data type in lambda expression  
        Hello ad2=(int a,int b)->(a+b);  
        System.out.println(ad2.add(100,200));  
        
        // using return type
        Hello ad=(int a,int b)->{  
            return (a+b);   
            };  
        System.out.println(ad.add(100,200));  
}
}
