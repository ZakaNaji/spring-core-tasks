package org.znaji.calculator;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.znaji.calculator.entity.ArithmeticCalculator;
import org.znaji.calculator.entity.MaxCalculator;

public class Main {
    public static void main(String[] args) {
        try (var ctx = new AnnotationConfigApplicationContext("org.znaji.calculator")) {
            var calculator = ctx.getBean(ArithmeticCalculator.class);
            System.out.println(((MaxCalculator)calculator).max(1, 2));;
        }
    }
}
