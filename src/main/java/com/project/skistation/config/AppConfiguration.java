package com.project.skistation.config;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;



@Component
@Aspect
public class AppConfiguration {
    private Logger logger = Logger.getLogger(AppConfiguration.class.getName());
    // @Before("repositoryMethods()")
    // @Before("execution(* com.project.skistation.services.*.*(..))")
    // public void logMethodCall(JoinPoint jp) {
    //     String methodName = jp.getSignature().getName();
    //     logger.info("Before " + methodName);
    // }
    // @Before("String * *(..)")      
    // public void logMethodCall(JoinPoint jp) {
    //     String methodName = jp.getSignature().getName();
    //     logger.info("Before " + methodName);
    // }
    // @Before("execution(* set*(..))")   
    // public void logMethodCallSetters(JoinPoint jp) {
    //     String methodName = jp.getSignature().getName();
    //     logger.info("Before " + methodName);
    // }
    @After("execution(* com.project.skistation..*.*(..))")
    public void logMethodCallEverything(JoinPoint jp) {
        String methodName = jp.getSignature().getName();
        logger.info("After logMethodCallEverything" + methodName);
    }
}
