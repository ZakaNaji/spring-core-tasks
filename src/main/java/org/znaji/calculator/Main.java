package org.znaji.calculator;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.znaji.calculator.entity.ArithmeticCalculator;

public class Main {
    public static void main(String[] args) {
        try (var ctx = new AnnotationConfigApplicationContext("org.znaji.calculator")) {
            var calculator = ctx.getBean(ArithmeticCalculator.class);
            calculator.mul(-1, 2);
        }
    }
}
