package com.cg;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
	private int id;
	private String name;
	private float price;
	
	
	
	public Product(int id, String name, float price) {
		
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
}
public class ProductData_WTO_Using_stream {
	private static List < Product > productsList = new ArrayList < Product > ();

	public static void main(String[] args) {
		productsList.add(new Product(101,"oil",24000));
		productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));
        withOutStram();
	}
	public static void withOutStram() {
//		List < Float > productPriceList = new ArrayList < Float > ();
//		for (Product product: productsList) {
//            if (product.getPrice() > 25000) {
//                
//                productPriceList.add(product.getPrice());
//            }
//        }
//		for(Float price:productPriceList) {
//			System.out.println(price);
//		}
		
// ------------------------ USING STREAM --------------------------------------------
		
	List < Float > productPriceList =
	productsList.stream()
				.filter((product) -> product.getPrice() > 25000)
	            .map((product) -> product.getPrice())
	            .collect(Collectors.toList());
	        
	        productPriceList.forEach((price) -> System.out.println(price));
	        
	        productsList.stream()
	                    .filter((product) -> product.getPrice()>25000)
	                    .map((product)-> product.getPrice())
	                    .forEach(price -> System.out.println(price));    
	}
}
