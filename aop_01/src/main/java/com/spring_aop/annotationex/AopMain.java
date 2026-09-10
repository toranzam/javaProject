package com.spring_aop.annotationex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AopMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = new GenericXmlApplicationContext("application-config2-2.xml");

		// 핵심기능 1: 원의 면적과 둘레
		Circle circle = context.getBean("circle", Circle.class);
		circle.showResult();

		// 핵심기능 2: 성적 총점과 평균
		Evaluation evaluation = context.getBean("evaluation", Evaluation.class);
		evaluation.showResult();

		context.close();
	}
}
