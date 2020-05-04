package com.project.bitirmeprojesi.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
public class MyAnnotationAspect {

	@Around("@annotation(myAnnotation)")
	public Object execute(ProceedingJoinPoint point, MyAnnotation myAnnotation) throws Throwable {
		
		if (!myAnnotation.durum()) {
			return point.proceed();
		}
		
		String classname = point.getSignature().getDeclaringType().getSimpleName();
		String methodname = point.getSignature().getName();
		
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		Object result = point.proceed();
		stopWatch.stop();
		
		System.out.println("ClassName " +classname + " MethodName " + methodname + " " + stopWatch.getTotalTimeMillis() + " ms"+ " running");
		return result;
	}
}
