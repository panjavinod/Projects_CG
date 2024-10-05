package com.cg;

public class PyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<5;i++) {
			for(int j=4;j>=i;j--) {                  //   4--> 4>=1 -->  -  >>>>  4>=2 --> -
				System.out.print(" ");               //   3--> 3>=1 -->  --  >>>>  3>=2 --> --
			}                                        //   2--> 2>=1 -->  ---  >>>> 2>=2 --> ---**
			for(int j=1;j<=i;j++) {                  //   1--> 1>=1 -->  ----*  >>> 1>=2 --> false
				System.out.print("* ");              //   0--> 0>=1  false
			}
			System.out.println("");
		}

	}

}
