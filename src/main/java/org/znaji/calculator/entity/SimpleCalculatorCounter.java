package org.znaji.calculator.entity;

import java.util.concurrent.atomic.AtomicInteger;

public class SimpleCalculatorCounter implements CalculatorCounter{
    public final AtomicInteger atomicInteger = new AtomicInteger(0);
    @Override
    public void increaseCount() {
        atomicInteger.incrementAndGet();
    }

    @Override
    public int getCount() {
        return atomicInteger.get();
    }
}
