package com.cg;

public class Clone implements Cloneable {
	private String name;
    private String college;
    
	public Clone(String name, String college) {
		super();
		this.name = name;
		this.college = college;
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCollege() {
		return college;
	}


	public void setCollege(String college) {
		this.college = college;
	}


	@Override
	public String toString() {
		return "Clone [name=" + name + ", college=" + college + "]";
	}


	public static void main(String[] args) {
		Clone student1 = new Clone("Ramesh", "ABC");
		try {
			Clone student2=(Clone) student1.clone();
			System.out.println(student2.toString());
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		
	}
	

}
