package org.znaji.calculator.entity;

public record Complex(int real, int imaginary) {
    @Override
    public String toString() {
        return "Complex{" +
                "real=" + real +
                ", imaginary=" + imaginary +
                '}';
    }
}
