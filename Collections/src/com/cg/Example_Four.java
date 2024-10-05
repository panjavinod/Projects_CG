package com.cg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee{
	String eMPID;
	String eAME;
	String dEPT;
	int aGE;
	 
	
	public Employee(String eMPID, String eAME, String dEPT, int aGE) {
		super();
		this.eMPID = eMPID;
		this.eAME = eAME;
		this.dEPT = dEPT;
		this.aGE = aGE;
	}


	public String geteMPID() {
		return eMPID;
	}


	public void seteMPID(String eMPID) {
		this.eMPID = eMPID;
	}


	public String geteAME() {
		return eAME;
	}


	public void seteAME(String eAME) {
		this.eAME = eAME;
	}


	public String getdEPT() {
		return dEPT;
	}


	public void setdEPT(String dEPT) {
		this.dEPT = dEPT;
	}


	public int getaGE() {
		return aGE;
	}


	public void setaGE(int aGE) {
		this.aGE = aGE;
	}
	
}
public class Example_Four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List<Employee> employeList=new ArrayList<>();
      employeList.add(new Employee("E40001","Pradeep","Hr",36));
      employeList.add(new Employee("E40002","Ashok","manager",28));
      employeList.add(new Employee("E40003","Santosh","AstManager",25));
      employeList.add(new Employee("E40004","Ashok","StoreManager",25));
      employeList.add(new Employee("E40005","Pradeep","GManager",26));
      employeList.add(new Employee("E40005","Pradeep","GManager",26));
      
      System.out.println("-------------------------Using-Iterator-----------------------------------");
      System.out.println();
      Iterator itr=employeList.iterator();
      Map<String,Integer> map1=new HashMap<>(); 
      while(itr.hasNext()) {
    	  int count=1;
    	  Employee emp=(Employee) itr.next();
    	  if(!map1.containsKey(emp.eAME)) {
    		  map1.put(emp.eAME, 1);
    	  }else {
    		  map1.put(emp.eAME,map1.get(emp.geteAME())+1); //map1.put(emp.eAME,count+1); 
    	  }
      }
      System.out.println(map1);
      
      System.out.println();
      System.out.println("-------------------------Using-Loop-----------------------------------");
    
      Map<String,Integer> map=new HashMap<>(); 
      for(Employee e:employeList) {
    	  if(!map.containsKey(e.eAME)) {
    		  map.put(e.geteAME(),1);
    	  }else {
    		  map.put(e.geteAME(), map.get(e.geteAME())+1);
    	  }
       }
       // Both difference bellow program wont check multiple duplicates above it ll check multiple
//      for(Employee e:employeList) {
//    	  int count=1;
//    	  if(!map.containsKey(e.eAME)) {
//    		  map.put(e.eAME,1);
//    	  }else {
//			map.put(e.eAME,count+1);
//    	  }
//       }
      System.out.println(map);
      
      System.out.println();
      System.out.println("-------------------------Using-JAVA8-----------------------------------");
    
      Map<String, Long> nameCount=employeList.stream().collect(Collectors
    		  .groupingBy(Employee::geteAME,Collectors.counting()));
      System.out.println(nameCount);
     }
	
      

}
