package com.after;

public class ClientDemoWithObserver {

	public static void main(String[] args) {
		Subject s = new Subject();
		MathOperation mod = new ModObserver(3, s);
		MathOperation div = new DivObserver(4, s);
		s.setValue(14);
	}

}
