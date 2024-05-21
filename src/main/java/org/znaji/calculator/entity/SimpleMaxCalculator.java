package org.znaji.calculator.entity;

public class SimpleMaxCalculator implements MaxCalculator{
    @Override
    public double max(double a, double b) {
        return Math.max(a, b);
    }
}
