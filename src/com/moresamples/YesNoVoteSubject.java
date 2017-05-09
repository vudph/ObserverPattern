package com.moresamples;

import java.util.Observable;

public class YesNoVoteSubject extends Observable {
	private String question;
    private int yesCount = 0;
    private int noCount = 0;

    public YesNoVoteSubject(String question) {
        this.question = question;
    }

    public void vote(String vote) {
        if ("yes".equalsIgnoreCase(vote)) {
            yesCount++;
            setChanged();
        }
        else if ("no".equalsIgnoreCase(vote)) {
            noCount++;
            setChanged();
        }

        // Observers are only notified if the vote caused
        // a change to the current tally.
        notifyObservers(vote);
    }

    public int yesVotes() {
        return yesCount;
    }

    public int noVotes() {
        return noCount;
    }
}
