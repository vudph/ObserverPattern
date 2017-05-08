package com.after;

public class ModObserver extends MathOperation {

	public ModObserver(int mod, Subject s) {
		this.x = mod;
		s.addObserver(this);
	}
	
	@Override
	public void calculate(int value) {
		System.out.println(value + " mod " + this.x + " = " + value % this.x);
	}

}
