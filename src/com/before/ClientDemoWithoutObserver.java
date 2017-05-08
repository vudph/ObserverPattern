package com.before;

public class ClientDemoWithoutObserver {

	public static void main(String[] args) {
		SubjectNoObserver s = new SubjectNoObserver();
		s.setValue(14);
	}

}
