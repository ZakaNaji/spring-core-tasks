package org.znaji.calculator.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;
import org.znaji.calculator.entity.CalculatorCounter;
import org.znaji.calculator.entity.MaxCalculator;
import org.znaji.calculator.entity.SimpleCalculatorCounter;
import org.znaji.calculator.entity.SimpleMaxCalculator;

@Component
@Aspect
public class CalculatorIntroductionAspect {

    @DeclareParents(
            value = "org.znaji.calculator.entity.StandardArithmeticCalculator",
            defaultImpl = SimpleMaxCalculator.class
    )
    public MaxCalculator maxCalculator;

    @DeclareParents(
            value = "org.znaji.calculator.entity.StandardArithmeticCalculator",
            defaultImpl = SimpleCalculatorCounter.class
    )
    public CalculatorCounter calculatorCounter;
}
