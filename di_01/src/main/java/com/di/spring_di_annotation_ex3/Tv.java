package com.di.spring_di_annotation_ex3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Tv {
	
	
	private Speaker speaker;
	
	@Autowired
	public Tv(Speaker speaker) {
		super();
		this.speaker = speaker;
	}

	public void volumeUp() {
		speaker.volumeUp();
	}

	public void volumeDown() {
		speaker.volumeDown();
	}

}
