package com.after;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	private List<MathOperation> observers = new ArrayList<MathOperation>();
	private int value;
	
	public void addObserver(MathOperation oper) {
		observers.add(oper);
	}
	
	public void removeObserver(MathOperation oper) {
		for (MathOperation mathOperation : observers) {
			if (mathOperation.equals(oper)) {
				observers.remove(oper);
			}
		}
	}
	
	public void setValue(int val) {
		this.value = val;
		this.notifyToCalculate();
	}
	
	private void notifyToCalculate() {
		for (MathOperation mathOperation : observers) {
			mathOperation.calculate(this.value);
		}
	}
}
