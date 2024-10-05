package com.cg;
//create a class called "Dog" with a name and breed attribute.
//Create two instances of the "Dog" class, set their attributes using the constructor
//and modify the attributes using the setter methods and print the updated values.
class Dog{
	private String name;
	private String breed;
	public Dog(String name, String breed) {
		super();
		this.name = name;
		this.breed = breed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	@Override
	public String toString() {
		return "Dog [name=" + name + ", breed=" + breed + "]";
	}
	
}
public class Modify_Attributes_usingStters_Gtters {

	public static void main(String[] args) {
		Dog d=new Dog("duddu","goldenretriver");
		Dog d1=new Dog("tommy","lab");
		System.out.println("Before change "+d.toString());
		System.out.println("Before change "+d1.toString());
		d.setName("loosi");
		System.out.println("After change "+d.toString());

	}

}
