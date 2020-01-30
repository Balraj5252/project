package com.audintel.project.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AspectMethods {
	
	private Logger log= LoggerFactory.getLogger(this.getClass());
	
	@Before("execution(* com.audintel.project.controller.*.*(..))")
	public void logBefore(JoinPoint jp){
		log.info("in beforelog {} "+jp);
		System.out.println("before log "+jp.getClass());
	}
	@AfterReturning("execution(* com.audintel.project.controller.*.*(..))")
	public void logAfter(JoinPoint jp){
		log.info("sucussfully completed {} "+jp);
		System.out.println("before log "+jp.getClass());
	}
	@AfterThrowing("execution(* com.audintel.project.controller.*.*(..))")
	public void logAfterError(JoinPoint jp){
		log.error("error in executing  method {} "+jp);
		System.out.println("before log "+jp.getClass());
	}
}
