package com.di.spring_di_xml_setter_ex1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TvMain {

	public static void main(String[] args) {

		AbstractApplicationContext context = new GenericXmlApplicationContext("application-context2_1.xml");
		Tv tv = context.getBean("tv", Tv.class); // Speaker 객체가 setter 통해서 주입됨
		tv.volumeUp();
		tv.volumeDown();
	}

}
