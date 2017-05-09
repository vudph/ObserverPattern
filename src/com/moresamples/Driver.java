package com.moresamples;

public class Driver {

	public static void main(String[] args) {
		YesNoVoteSubject vt = new YesNoVoteSubject("Should drivers " +
	             "be allowed to talk on cell phones?");
		vt.vote("yes");
		vt.vote("no");
		vt.vote("yes");
		
		News24Hour news = new News24Hour(vt);
		FoxNews fox = new FoxNews(vt);
		vt.vote("no");
		vt.vote("depends");
		vt.vote("yes");
	}

}
