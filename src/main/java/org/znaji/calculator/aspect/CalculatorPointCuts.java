package org.znaji.calculator.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CalculatorPointCuts {
    @Pointcut("@annotation(org.znaji.calculator.aspect.LoggingRequired)")
    public void arithmeticOperation() {
    }
}
