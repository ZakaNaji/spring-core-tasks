package org.znaji.calculator.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class CalculatorLoginAspect {

    @Around("execution(* org.znaji.calculator.entity.ArithmeticCalculator.*(..))")
    public Object logAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        var name = proceedingJoinPoint.getSignature().getName();
        var args = proceedingJoinPoint.getArgs();
        log.info("The method {}() begins with {}", name, args);
        try {
            var result = proceedingJoinPoint.proceed();
            log.info("The method {}() ends with {}", name, result);
            return result;
        } catch (IllegalArgumentException e) {
            log.error("Illegal argument {} in {}()", args, name);
            throw e;
        }
    }
}
