package com.cg;
 interface interfacee {
	 abstract void mm();
	}

public class Interface implements interfacee {
	@Override
	public void mm() {
		System.out.println("hello interaface");
		
	}
	public static void main(String[] args) {
		Interface f=new Interface();
		f.mm();

	}

	

}
