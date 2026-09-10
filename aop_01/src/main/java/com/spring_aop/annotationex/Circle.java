package com.spring_aop.annotationex;

public class Circle {

	private double radius;

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}

	public double getCircumference() {
		return 2 * Math.PI * radius;
	}

	public void showResult() {
		System.out.println("면적 : " + getArea());
		System.out.println("둘레 : " + getCircumference());
	}
}
