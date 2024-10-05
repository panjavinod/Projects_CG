package com.cg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class EmployeeController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<EmployeeBean> emplist=new ArrayList<>();
		
		emplist.add(new EmployeeBean("vinod","atp",1,12000));
		emplist.add(new EmployeeBean("mahi","atp",2,10000));
		emplist.add(new EmployeeBean("vinay","atp",3,1000));
		emplist.add(new EmployeeBean("likith","atp",4,20000));
//		Scanner sc=new Scanner(System.in);
//		for(int i=0;i<1;i++) {
//			System.out.println("Enter name");
//			String eName=sc.next();
//			System.out.println("Enter address");
//			String eAddress=sc.next();
//			System.out.println("enter id");
//			int eid=sc.nextInt();
//			System.out.println("enter salary");
//			int eSalary=sc.nextInt();
//			emplist.add(new EmployeeBean(eName,eAddress,eid,eSalary));
//		}
		
		Iterator itr=emplist.iterator();
		while(itr.hasNext())
		{
			EmployeeBean elist=(EmployeeBean)itr.next();
			if(elist.geteSalary()>10000)
			{
				System.out.println(elist.geteName());
			}
		}
		
	
		
	}

}
