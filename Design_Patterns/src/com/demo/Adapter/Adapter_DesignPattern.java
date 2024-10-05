package com.demo.Adapter;

public class Adapter_DesignPattern {

	public static void main(String[] args) {
		Pen p=new PenAdapter();
		AssignmentWork aw=new AssignmentWork();
		aw.setP(p);
		aw.writeAssignment("I'm littele bit tired to write assignment");
	}

}
