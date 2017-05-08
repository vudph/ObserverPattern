package com.after;

public class DivObserver extends MathOperation {

	public DivObserver(int div, Subject s) {
		this.x = div;
		s.addObserver(this);
	}
	
	@Override
	public void calculate(int value) {
		System.out.println(value + " div " + this.x + " = " + value/this.x);
	}

}
