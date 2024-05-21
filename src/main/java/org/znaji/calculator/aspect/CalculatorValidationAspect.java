package org.znaji.calculator.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class CalculatorValidationAspect {
    @Before("org.znaji.calculator.aspect.CalculatorPointCuts.arithmeticOperation()")
    public void validateBefore(JoinPoint jp) {
        var args = jp.getArgs();
        for (var arg : args) {
            if (arg instanceof Double) {
                if ((Double) arg < 0) {
                    throw new IllegalArgumentException("Positive numbers only");
                }
            }
        }
    }
}
