package org.znaji.calculator.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
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
}
