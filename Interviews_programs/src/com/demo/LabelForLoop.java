package com.demo;

public class LabelForLoop {

	public static void main(String[] args) {
		aa:
			for(int i=0;i<3;i++) {
				bb:
					for(int j=0;j<4;j++) {
						 if(i==2&&j==2){    
	                            //using break statement with label  
	                            break aa;    
	                        }    
	                        System.out.println(i+" "+j);    
					}
			}
	}

}
