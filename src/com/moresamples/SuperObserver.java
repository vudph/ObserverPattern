package com.moresamples;

import java.util.Observable;
import java.util.Observer;

public class SuperObserver {
	
	protected YesNoVoteSubject subject;
	
	protected void printSummary() {
		System.out.println("===============");
		System.out.println("Yes total: " + this.subject.yesVotes());
        System.out.println("No total: " + this.subject.noVotes());
        System.out.println();
	}
	
}
