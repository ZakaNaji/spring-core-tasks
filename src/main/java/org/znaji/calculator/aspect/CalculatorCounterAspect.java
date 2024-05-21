package org.znaji.calculator.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.znaji.calculator.entity.CalculatorCounter;

@Component
@Aspect
public class CalculatorCounterAspect {
    @After("execution(* org.znaji.calculator.entity.ArithmeticCalculator.*(..)) && this(counter)")
    public void count(CalculatorCounter counter) {
        counter.increaseCount();
    }
}
