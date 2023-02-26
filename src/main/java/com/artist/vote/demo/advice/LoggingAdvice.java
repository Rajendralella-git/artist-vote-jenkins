package com.artist.vote.demo.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

@Aspect
@Component
public class LoggingAdvice {
	Logger log = LoggerFactory.getLogger(LoggingAdvice.class);
	
	@Pointcut(value="execution(* com.artist.vote.demo.*.*.*(..) )")
	public void pointCut() {
		
	}
	@Around("pointCut()")
	public Object applicationLogger(ProceedingJoinPoint joinPoint) throws Throwable {
		ObjectMapper mapper = new ObjectMapper();
		String methodName = joinPoint.getSignature().getName();
		String className = joinPoint.getTarget().getClass().toString();
		Object[] methodArguments = joinPoint.getArgs();
		log.info("--------------------------------------------------------");
		log.info("\nThe class name is-" + className + "\n Method Name-" + methodName + "\n the arguments are-"
				+ mapper.writeValueAsString(methodArguments));
		Object response = joinPoint.proceed();
		log.info("\nThe class name is-" + className + "\n Method Name-" + methodName + "\n the response is-"
				+ mapper.writeValueAsString(response));
		log.info("--------------------------------------------------------");
		return response;
	}
}
