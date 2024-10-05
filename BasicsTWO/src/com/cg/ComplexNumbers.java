package com.cg;

public class ComplexNumbers {
	double real;
    double imag;
	 public ComplexNumbers(double real, double imag) {
		 this.real = real;
	        this.imag = imag;
	}

	public static ComplexNumbers add(ComplexNumbers n1, ComplexNumbers n2)
	    {
		 ComplexNumbers temp = new ComplexNumbers(0.0, 0.0);

	        temp.real = n1.real + n2.real;
	        temp.imag = n1.imag + n2.imag;

	        return(temp);
	    }

	public static void main(String[] args) {
		ComplexNumbers n1=new ComplexNumbers(2.3, 4.5);
		ComplexNumbers n2=new ComplexNumbers(3.4, 5.0);
		ComplexNumbers temp=add(n1,n2);
		System.out.println("Real Value "+temp.real+"  Imagenary value "+temp.imag);

	}

}
