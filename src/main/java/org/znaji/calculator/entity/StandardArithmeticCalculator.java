package org.znaji.calculator.entity;

import org.springframework.stereotype.Component;

@Component
public class StandardArithmeticCalculator implements ArithmeticCalculator{
    @Override
    public double add(double a, double b) {
        var result = a + b;
        System.out.printf("%.2f + %.2f = %.2f\n", a, b, result);
        return result;
    }

    @Override
    public double sub(double a, double b) {
        var result = a - b;
        System.out.printf("%.2f - %.2f = %.2f\n", a, b, result);
        return result;
    }

    @Override
    public double mul(double a, double b) {
        var result = a * b;
        System.out.printf("%.2f * %.2f = %.2f\n", a, b, result);
        return result;
    }

    @Override
    public double div(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisor cannot be 0");
        }
        var result = a / b;
        System.out.printf("%.2f / %.2f = %.2f\n", a, b, result);
        return result;
    }
}
