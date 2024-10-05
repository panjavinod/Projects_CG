package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employe{
	private int id;
	private String name;
	private String gender;
	private String department;
	public Employe(int id, String name, String gender, String department) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.department = department;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
//	@Override
//	public String toString() {
//		return "Employe [id=" + id + ", name=" + name + ", gender=" + gender + ", department=" + department + "]";
//	}
	
	
}
public class Count_MaleFemale_Using_java8 {

	public static void main(String[] args) {
		List<Employe> employeList =new ArrayList<>();
		employeList.add(new Employe(111,"jiya ","female","hr"));
		employeList.add(new Employe(112,"hulk","male","manager"));
		employeList.add(new Employe(113,"james","male","director"));
		employeList.add(new Employe(114,"karin","female","it"));
		employeList.add(new Employe(115,"dinu","male","finance"));
		employeList.add(new Employe(116,"reyaj","female","product"));
		employeList.add(new Employe(117,"kavya","female","account"));
		employeList.add(new Employe(118,"javin","male","sales"));
		employeList.add(new Employe(119,"barin","male","sales"));
		System.out.println("----------Number of males and females in given list---------------");
		Map<String, Long> collect = employeList.stream()
		           .collect(Collectors.groupingBy(Employe :: getGender, Collectors.counting()));
       System.out.println(collect);
       Map<String,List<String>> collect1 = employeList.stream()
	           .collect(Collectors.groupingBy(Employe :: getGender, Collectors.mapping(emp->emp.getName(),Collectors.toList())));
       System.out.println("----------Number of males and females based on names---------------");
       System.out.println(collect1);
       System.out.println();
       System.out.println("----------All Departments in organization---------------");
       Set<String> collect2=employeList.stream().map(e->e.getDepartment()).collect(Collectors.toSet());
       System.out.println(collect2);
	}
	

}
