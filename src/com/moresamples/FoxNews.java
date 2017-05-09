package com.moresamples;

import java.util.Observable;
import java.util.Observer;

public class FoxNews extends SuperObserver implements Observer {

	public FoxNews(YesNoVoteSubject sub) {
		this.subject = sub;
		this.subject.addObserver(this);
//		this.printSummary();
	}
	
	@Override
	public void update(Observable o, Object arg) {
		System.out.println("Fox News update: got new vote '" + arg + "' arrived!");
		this.printSummary();
	}

}
