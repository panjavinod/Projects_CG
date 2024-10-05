package com.cg;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//Using newInstance() Method of Constructor class
class Market{
	private String name="MainBajar";
	private String place="Rjy";
	
	
	public Market() {
		super();
	}
	
	public Market(String name, String place) {
		super();
		this.name = name;
		this.place = place;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	@Override
	public String toString() {
		return "Market [name=" + name + ", place=" + place + "]";
	}
	
	
}
public class NewInstace_Constructor {

	public static void main(String[] args) {
		
        try {
        	Constructor < Market > constructor = Market.class.getConstructor();
            Market student = constructor.newInstance();
            System.out.println(student.getName());
            System.out.println(student.getPlace());
            
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException |
            NoSuchMethodException | SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    
		
	}

}
