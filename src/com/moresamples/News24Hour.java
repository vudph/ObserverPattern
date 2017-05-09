package com.moresamples;

import java.util.Observable;
import java.util.Observer;

public class News24Hour extends SuperObserver implements Observer {

	public News24Hour(YesNoVoteSubject vt) {
		this.subject = vt;
        vt.addObserver(this);
//        this.printSummary();
    }

   // Note, in this example the changed data is pushed to the observers.
    // To convert to the pull method:
    // 1. ignore the arg parameter.
    // 2. cast the parameter subject to a reference to an instance of a YesNoVoteTally
    // 3. query the subject for updates
    // A variation on step #2 is to keep a reference to the YesNoVoteTally object
    // being observer.
	@Override
    public void update(Observable subject, Object arg) {
        System.out.println("News24H update: New vote of '" + arg + "' just arrived.");        
        this.printSummary();
    }

	
}
