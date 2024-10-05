package com.cg;

import java.util.*;
public class Example {

public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter fist name");
String firstname=sc.nextLine();
System.out.println("Enter second name");
String lastname=sc.nextLine();
String a;
if(firstname.length()>4&& lastname.length()>4) {
a=firstname.substring(0, 4)+lastname.substring(0, 4);
System.out.println(a);
}
else if(firstname.length()>4 && lastname.length()<4){
a=firstname.substring(0,5)+lastname.substring(0, 3);
System.out.println(a);
}
else if(firstname.length()<4 && lastname.length()>4){
a=firstname.substring(0,3)+lastname.substring(0, 5);
System.out.println(a);
}
else{
String d,e;
d=firstname.substring(0);
e=lastname.substring(0);
if(firstname.length()<4)
{

for(int i=0;i<4-firstname.length();i++){
d=d+"1";
}
}
if(lastname.length()<4)
{

for(int i=0;i<4-lastname.length();i++){
e=e+"2";
}
}
a=d+e;
System.out.println(a);


}



}

}