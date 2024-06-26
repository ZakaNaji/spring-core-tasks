package org.znaji.calculator.entity;

import org.springframework.stereotype.Component;

@Component
public class StandardComplexCalculator implements ComplexCalculator {
    @Override
    public Complex add(Complex a, Complex b) {
        var result = new Complex(a.real() + b.real(), a.imaginary() + b.imaginary());
        System.out.printf("Add: %s + %s = %s%n", a, b, result);
        return result;
    }

    @Override
    public Complex sub(Complex a, Complex b) {
        var result = new Complex(a.real() - b.real(), a.imaginary() - b.imaginary());
        System.out.printf("Sub: %s - %s = %s%n", a, b, result);
        return result;
    }
}
