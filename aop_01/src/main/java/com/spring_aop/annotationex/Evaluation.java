package com.spring_aop.annotationex;

public class Evaluation {
	private int korean;
	private int english;
	private int math;

	public int getKorean() {
		return korean;
	}

	public void setKorean(int korean) {
		this.korean = korean;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int showTotal() {
		return korean + english + math;
	}

	public int showAvg() {
		return (korean + english + math) / 3;
	}

	public void showResult() {
		System.out.println("총점 : " + showTotal());
		System.out.println("평균 : " + showAvg());
	}
}
