package org.znaji.calculator.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class CalculatorLoginAspect {

    @Before("execution(* org.znaji.calculator.entity.*.*(..))")
    public void logBeforeStandardCalculatorAddMethod(JoinPoint joinPoint) {
        var methodName = joinPoint.getSignature().getName();
        var args = joinPoint.getArgs();
        log.info("The method {} is called with args {}", methodName, args);
    }

    @After("execution(* org.znaji.calculator.entity.*.*(..))")
    public void logAfterStandardCalculatorAddMethod(JoinPoint joinPoint) {
        var methodName = joinPoint.getSignature().getName();
        log.info("The method {} is finished", methodName);
    }

    @AfterReturning(pointcut = "execution(* org.znaji.calculator.entity.*.*(..))", returning = "result")
    public void logAfterReturningStandardCalculatorAddMethod(JoinPoint joinPoint, Object result) {
        var methodName = joinPoint.getSignature().getName();
        log.info("The method {} returns {}", methodName, result);
    }


    @AfterThrowing(pointcut = "execution(* org.znaji.calculator.entity.*.*(..))", throwing = "e")
    public void logAfterThrowingStandardCalculatorAddMethod(JoinPoint joinPoint, Exception e) {
        var methodName = joinPoint.getSignature().getName();
        log.error("The method {} throws exception {}", methodName, e);
    }
}
