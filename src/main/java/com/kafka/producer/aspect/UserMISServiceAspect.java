package com.kafka.producer.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UserMISServiceAspect {

    @Before(value = "execution(* com.kafka.producer.controller.*.* (..))")
    public void beforeAdvice(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        String className = joinPoint.getTarget().getClass().toString();
        System.out.println("Before method: Method name " + methodName + " ClassName name" + className);
    }

    @AfterThrowing(value = "execution(* com.kafka.producer.controller.UserMISController.* (..))")
    public void afterThrowingExceptionAdvice(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        String className = joinPoint.getTarget().getClass().toString();
        Object[] args = joinPoint.getArgs();
        System.out.println("After Throwing " + methodName + " ClassName name" + className);
        System.out.println("value " + args[0].toString());
    }
}
