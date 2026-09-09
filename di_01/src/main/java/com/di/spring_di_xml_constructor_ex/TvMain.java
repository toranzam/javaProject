package com.di.spring_di_xml_constructor_ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TvMain {

	public static void main(String[] args) {

		AbstractApplicationContext context = new GenericXmlApplicationContext("application-context1_1.xml");

		Tv tv = context.getBean("tv", Tv.class);
		tv.volumeUp();
		tv.volumeDown();
	}

}
