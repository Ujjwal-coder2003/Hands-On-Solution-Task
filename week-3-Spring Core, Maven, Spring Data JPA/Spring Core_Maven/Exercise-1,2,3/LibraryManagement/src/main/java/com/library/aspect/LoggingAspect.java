package com.library.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;

public class LoggingAspect {

    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();

        Object returnValue = joinPoint.proceed();
        long end = System.currentTimeMillis();
        System.out.println("Method " + joinPoint.getSignature() +
                " executed in " + (end - start) + " ms");

        return returnValue;
    }
}
