package com.demo.Adapter;

public class PenAdapter implements  Pen{

	PilotPen pp=new PilotPen();
	@Override
	public void write(String str) {
		pp.status(str);
	}

}
