package com.di.spring_di_xml_constructor_ex;

public class Tv {
	private Speaker speaker;

	public Tv(Speaker speaker) {
		this.speaker = speaker;
	}

	public void volumeUp() {
		speaker.volumeUp();
	}

	public void volumeDown() {
		speaker.volumeDown();
	}

}
