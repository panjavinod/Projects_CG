//Write a Java program to create a class called "Inventory" 
//with a collection of products and methods to add and remove products, 
//and to check for low inventory.

package com.cg;

import java.util.ArrayList;

class Product{
	private String name;
	private int quantity;
	
	public Product(String name, int quantity) {
		this.name = name;
		this.quantity = quantity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
class Inventory{
	private ArrayList<Product> products;
	
	public Inventory() {
		products=new ArrayList<Product>(); 
	}
	public void addProduct(Product product) {
		products.add(product);
	}
	public void removeProduct(Product product) {
		products.remove(product);
	}
	public void checkforlowinventory() {
		for(Product product:products) {
			if(product.getQuantity() <= 100) {
				 System.out.println(product.getName() + 
						 " is running low on inventory. Current quantity: " 
						 + product.getQuantity());
			}
		}
	}
}
public class Product_Details {

	public static void main(String[] args) {
		Product p=new Product("Oil",200);
		Product p2=new Product("Cutton",90);
		 Product p3 = new Product("Tablet", 50);
		
		Inventory inventory=new Inventory();
		inventory.addProduct(p);
		inventory.addProduct(p2);
		inventory.addProduct(p3);
		
		System.out.println("Before change--------------------");
		inventory.checkforlowinventory();
		
		
		inventory.removeProduct(p3);
		
		System.out.println("After change--------------------");
		inventory.checkforlowinventory();
	}

}
