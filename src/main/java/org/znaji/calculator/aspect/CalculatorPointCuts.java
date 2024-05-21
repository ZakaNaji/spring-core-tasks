package org.znaji.calculator.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CalculatorPointCuts {
    @Pointcut("execution(* org.znaji.calculator.entity.ArithmeticCalculator.*(..))")
    public void arithmeticOperation() {
    }
}
