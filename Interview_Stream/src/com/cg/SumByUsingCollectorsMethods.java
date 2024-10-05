package com.cg;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class SumByUsingCollectorsMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List < Product > productsList = new ArrayList < Product > ();
        //Adding Products  
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));
        

        double totalPrice3 = productsList.stream()
                .collect(Collectors.summingDouble(product -> product.getPrice()));
            System.out.println(totalPrice3);
            
         // max() method to get max Product price
//       Product p= productsList.stream()
//                    .max((product1,product2)-> product1.getPrice()>product2.getPrice()?1:-1)
//                    .get(); 
//       System.out.println(p.getPrice());
           
         // min() method to get max Product price
            Product p= productsList.stream()
                    .min((product1,product2)-> product1.getPrice()>product2.getPrice()?1:-1)
                    .get(); 
       System.out.println(p.getPrice());
       
       
       //sum of integers in list
//       List<Integer> str=Arrays.asList(1,2,1,1,1,1,1,1,1,1,1,1,1,1,1);
//       int sum=str.stream().limit(10).collect(Collectors.summingInt(Integer::intValue));
//     System.out.println(sum);
       
//       List<Integer> str=Arrays.asList(1,1,1,1,1);
//       int sum=str.stream().collect(Collectors.summingInt(e->e));
//       System.out.println(sum);
	}

}
