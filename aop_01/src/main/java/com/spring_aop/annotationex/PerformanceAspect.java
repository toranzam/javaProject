package com.spring_aop.annotationex;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PerformanceAspect {

	@Pointcut("within(com.spring_aop.annotationex.*)")
	private void pointcutMethod() { // annotation을 부착하고 이름을 사용하기위한 용도 -> 빈메소드 구성

	}

	@Around("pointcutMethod()")
	public Object trace(ProceedingJoinPoint joinPoint) throws Throwable {

		Signature s = joinPoint.getSignature();
		String methodName = s.getName();

		System.out.println("--------------------------------");
		System.out.println("[LOG]Before:" + methodName + "() :실행 시작");
		System.out.println("--------------------------------");

		long startTime = System.nanoTime();
		Object result = null;

		try {
			result = joinPoint.proceed(); // 핵심기능 수행
		} catch (Exception e) {
			System.out.println("[LOG]Exception:" + methodName);
		}

		long endTime = System.nanoTime();

		System.out.println("--------------------------------");
		System.out.println("[LOG]After:" + methodName + "() :실행 종료");
		System.out.println("[LOG]:" + methodName + "() 실행시간:" + (endTime - startTime) + "ns");
		System.out.println("--------------------------------");

		return result;
	}
}
