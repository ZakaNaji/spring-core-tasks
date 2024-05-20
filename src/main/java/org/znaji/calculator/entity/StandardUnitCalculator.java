package org.znaji.calculator.entity;

import org.springframework.stereotype.Component;

@Component
public class StandardUnitCalculator implements UnitCalculator{
    @Override
    public double kilogramToPound(double kilogram) {
        var pound = kilogram * 2.20462;
        System.out.printf("%.2f kg is %.2f pound\n", kilogram, pound);
        return pound;
    }

    @Override
    public double kilometerToMile(double kilometer) {
        var mile = kilometer * 0.621371;
        System.out.printf("%.2f km is %.2f mile\n", kilometer, mile);
        return mile;
    }
}
