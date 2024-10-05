package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
	private int price;
	private String name;
	private String availability;
	private String rating;
	private String id;
	public Product(int price, String name, String availability, String rating, String id) {
		super();
		this.price = price;
		this.name = name;
		this.availability = availability;
		this.rating = rating;
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
    
    
	
	
}
class ProductBasic{
	private int price;
	private String name;
	private String availability;
	public ProductBasic(int price, String name, String availability) {
		super();
		this.price = price;
		this.name = name;
		this.availability = availability;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	
}
public class ProductDetails_Using_Java8 {

	public static void main(String[] args) {
		
         List<Product> products=new ArrayList<>();
         products.add(new Product(100,"banana","Available","4","1"));
         products.add(new Product(200,"dates","Available","5","4"));
         products.add(new Product(300,"kivi","OutOfStock","5","2"));
         products.add(new Product(400,"avacado","Available","4","5"));
         products.add(new Product(500,"cherry","OutOfStock","3","3"));
         
       List<ProductBasic> productDetails=  products.stream().map(product -> {
        	 ProductBasic productbasic=new ProductBasic(product.getPrice(),product.getName(),product.getAvailability());
             return productbasic;
         }).collect(Collectors.toList());
       
       productDetails.stream().forEach(pd->{
    	   System.out.println(pd.getName());
    	   System.out.println(pd.getPrice());
    	   System.out.println(pd.getAvailability());
    	   System.out.println("-------------------------------------");
       });         
	}
	

}
