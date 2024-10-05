package com.cemo.singletone2;

public class Lazy 
{
  private static Lazy instance;
  private Lazy() {
	  
  }
  public static Lazy check() {
	  if(instance==null) {
		  instance=new Lazy();
	  }
	return instance;
  }
}
