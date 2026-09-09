package com.di.spring_di_annotation_ex3;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TvMain {

	public static void main(String[] args) {

		AbstractApplicationContext context = new GenericXmlApplicationContext("application-context3_1.xml");
		Tv tv = context.getBean("tv", Tv.class); 
		tv.volumeUp();
		tv.volumeDown();
	}

}
