package com.before;

public class ModOperation {
	private int mod;
	
	public ModOperation(int mod) {
		this.mod = mod;
	}
	
	public void calculate(int val) {
		System.out.println(val + " mod " + this.mod + " = " + val % this.mod);
	}
}
