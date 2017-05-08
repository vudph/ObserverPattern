package com.before;

public class SubjectNoObserver {
	private int val;
	private DivOperation divOp;
	private ModOperation modOp;
	
	public SubjectNoObserver() {
		this.divOp = new DivOperation(4);
		this.modOp = new ModOperation(3);
	}
	
	public void setValue(int val) {
		this.val = val;
		this.calculate();
	}
	
	private void calculate() {
		this.divOp.calculate(this.val);
		this.modOp.calculate(this.val);
	}
}
