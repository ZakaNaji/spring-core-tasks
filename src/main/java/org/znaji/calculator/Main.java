package org.znaji.calculator;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.znaji.calculator.entity.*;

public class Main {
    public static void main(String[] args) {

        try (var ctx = new AnnotationConfigApplicationContext("org.znaji.calculator")) {
            var complexCalculator = ctx.getBean( ComplexCalculator.class);
            complexCalculator.add(new Complex(1, 2), new Complex(2, 3));
            complexCalculator.sub(new Complex(5, 8), new Complex(2, 3));
        }
    }
}
