package com.before;

public class DivOperation {
	private int div;
	
	public DivOperation(int div) {
		this.div = div;
	}
	
	public void calculate(int val) {
		System.out.println(val + " div " + this.div + " = " + val/this.div);
	}
}
