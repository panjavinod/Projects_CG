package com.cg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Employe {
	String name;
	long salary;

	public Employe() {
		super();
	}

	public Employe(String name, long salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public void show() {
		System.out.println(name + " " + name + " Salary " + salary);
	}

	@Override
	public String toString() {
		return "Employe [name=" + name + ", salary=" + salary + "]";
	}

}

public class EmploeSecondHighestSalary {

	public static void main(String[] args) {
		HashMap<Integer, Employe> hasmap = new HashMap<Integer, Employe>();
		Scanner sc = new Scanner(System.in);
		System.out.println("How many members you want ");
		int size = sc.nextInt();
		System.out.println("Enter the details ");
		for (int i = 0; i < size; i++) {
			Employe e = new Employe();
			e.setName(sc.next());
			e.setSalary(sc.nextLong());
			hasmap.put(i, e);
		}

		List<Long> series = new ArrayList<>();
		for (Map.Entry<Integer, Employe> entry : hasmap.entrySet()) {
			Employe emp = entry.getValue();
			series.add(emp.getSalary());
		}
		System.out.println("Employe salaries " + series);

		Collections.sort(series);

		if (series.size() >= 2) {
			long salaryy = series.get(series.size() - 2);
			System.out.println("Employe Second highest salary " + salaryy);
		} else {
			System.out.println("Insufficient employee salaries to determine the second highest.");
		}

	}

}
