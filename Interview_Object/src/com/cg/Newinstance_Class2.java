package com.cg;

import java.security.DrbgParameters.Instantiation;

class Product {
    private String name="oil";
    private String available="Yes";
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAvailable() {
		return available;
	}
	public void setAvailable(String available) {
		this.available = available;
	}
	
    
}
public class Newinstance_Class2 {

	public static void main(String[] args) {
		try {

           
            Class clasz = Class.forName("com.cg.Product");
            Product product = (Product) clasz.newInstance();
            System.out.println(product.getName());
            System.out.println(product.getAvailable());
		}

//         catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }
		catch(Exception e) {
			System.out.println(e);
		}
	}
}


