package com.demo.factory;
//------------------------------ Interface --------------------------------------------

interface Os{
	void spec();
}

// --------------------- Implementation classes ------------------------------------------
class Android implements Os{
	
	public void spec() {
		System.out.println("Most Power Full Os");	
	}	
}
class Ios implements Os{

	@Override
	public void spec() {
		System.out.println("Most Secured Os");	
	}
}
class Windows implements Os{

	@Override
	public void spec() {
		System.out.println("About to die ");	
	}
}
// ------------------------Hinding the creation of objects-------------------------------
class AndroidFactory{
	public Os getInstance(String str) {
		if(str.equals("Open"))
		    return new Android();
		else if(str.equals("Closed"))
		    return new Ios();
		else
			return new Windows();
	}
}

public class Factory_design_pattern {

	public static void main(String[] args) {
		AndroidFactory androidFactory =new AndroidFactory();
		Os obj=androidFactory.getInstance("Open");
		obj.spec();
	}

}
