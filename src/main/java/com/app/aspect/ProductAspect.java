package com.app.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.After;
//import org.aspectj.lang.annotation.AfterReturning;
//import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ProductAspect {

//	@Before("execution(* com.app.bean.Product.displayMessage(..))")
//	public void displayBefore() {
//		System.out.println("Hello Mallikarjun @Before");
//	}
//	
//	@After("execution(* com.app.bean.Product.displayMessage(..))")
//	public void displayAfter() {
//		System.out.println("Hello Sudhkar bro @After");
//	}
//	
//	@AfterReturning("execution(* com.app.bean.Product.displayMessage(..))")
//	public void displayAfterreturn() {
//		System.out.println("Hello Sudhkar bro @Afterreturning");
//	}
//	
//	@AfterThrowing("execution(* com.app.bean.Product.displayMessage(..))")
//	public void displayAfterthrow() {
//		System.out.println("Hello  @Afterthrowing");
//	}
//	
	@Around("execution(* com.app.bean.Product.displayMessage(..))")
	public Object displayAround(ProceedingJoinPoint joinPoint) {
		System.out.println("Intruder exexuted");
		return "I am Intruder";
	}
	
}
