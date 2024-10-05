package com.cg;

class TraficLight{
	private String color;
	  private int duration;
	public TraficLight(String color, int duration) {
		super();
		this.color = color;
		this.duration = duration;
	}
	  public void changeColor(String newColor) {
		  color=newColor;
	  }
	  public boolean isRed() {
		return color.equals("Red");
		  
	  }
	  public boolean isGreen() {
		  return color.equals("Green");
	  }
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	  
}

public class Trafic_Light {

	public static void main(String[] args) {
		TraficLight light = new TraficLight("Red", 30);
		System.out.println(light.isRed());
		System.out.println(light.isGreen());
		light.changeColor("Green");

	     System.out.println("The light is now green: " + light.isGreen());
	     System.out.println("The light duration is: " + light.getDuration());
	     light.setDuration(20);
	     System.out.println("The light duration is now: " + light.getDuration());
	}

}
