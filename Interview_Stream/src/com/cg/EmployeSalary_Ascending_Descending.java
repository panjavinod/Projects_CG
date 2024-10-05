package com.cg;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employe{
	private String name;
	private int age;
	private long salary;
	public Employe(String name, int age, long salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employe [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
	
}
public class EmployeSalary_Ascending_Descending {

	public static void main(String[] args) {
		List<Employe> list=new ArrayList<Employe>();
        list.add(new Employe("Haram",24,50000));
        list.add(new Employe("karam",34,700000));
        list.add(new Employe("varam",26,80000));
        list.add(new Employe("maram",54,100000));
        
// -----------------------------ASCENDING ORDER BASED ON SALRY----------------------------                

//        List<Employe> lm=list.stream()
//        		             .sorted((o1,o2)->(int)(o1.getSalary()-o2.getSalary()))
//        		             .collect(Collectors.toList());
//        System.out.println(lm);
 
// -----------------------------DESENDING ORDER BASED ON SALRY----------------------------        
        
//        List<Employe> lm=list.stream()
//	             .sorted((o1,o2)->(int)(o2.getSalary()-o1.getSalary()))
//	             .collect(Collectors.toList());
//System.out.println(lm);
        
// -----------------------------ASCENDING ORDER BASED ON NAME----------------------------                

//      List<Employe> lm=list.stream()
//      		             .sorted((o1,o2)->o1.getName().compareTo(o2.getName()))
//      		             .collect(Collectors.toList());
//      System.out.println(lm); 

// -----------------------------DESENDING ORDER BASED ON NAME----------------------------                

//      List<Employe> lm=list.stream()
//      		             .sorted((o1,o2)->o2.getName().compareTo(o1.getName()))
//      		             .collect(Collectors.toList());
//      System.out.println(lm); 
        
    
// -----------------------------ASCENDING ORDER BASED ON AGE----------------------------                

//      List<Employe> lm=list.stream()
//      		             .sorted((o1,o2)->o1.getAge()-o2.getAge())
//      		             .collect(Collectors.toList());
//      System.out.println(lm);
        
// -----------------------------DESENDING ORDER BASED ON AGE----------------------------                

//        List<Employe> lm=list.stream()
//        		             .sorted((o1,o2)->o2.getAge()-o1.getAge())
//        		             .collect(Collectors.toList());
//        System.out.println(lm);
        
//---------------------------USING METHOD REFERENCE ------------------------------
        
//      List<Employe> lm=  list.stream()
//            .sorted(Comparator.comparingInt(Employe::getAge))
//            .collect(Collectors.toList());
//      lm.forEach(name->System.out.println(name));
//      lm.forEach(name->System.out.println(name.getName())); //  print names only
        
//        List<Employe> lm=  list.stream()
//                .sorted(Comparator.comparingInt(Employe::getAge).reversed())
//                .collect(Collectors.toList());
//          lm.forEach(name->System.out.println(name));
        
//---------------------------USING METHOD REFERENCE ------------------------------
        
      List<Employe> lm=  list.stream()
            .sorted(Comparator.comparing(Employe::getName))
            .collect(Collectors.toList());
      lm.forEach(name->System.out.println(name));
//      lm.forEach(name->System.out.println(name.getName())); //  print names only
	}

}
