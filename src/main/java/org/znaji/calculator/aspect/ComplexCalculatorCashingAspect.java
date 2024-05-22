package org.znaji.calculator.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.znaji.calculator.entity.Complex;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
@Aspect
public class ComplexCalculatorCashingAspect {

    private final Map<String, Complex> cash = new ConcurrentHashMap<>();

    @Around(value = "call(public org.znaji.calculator.entity.Complex.new(int, int)) && args(a, b)", argNames = "pjp,a,b")
    public Object cashAround(ProceedingJoinPoint pjp, int a, int b) throws Throwable {
        var key = a + "," + b;
        return cash.compute(key, (k, v) -> checkIfExist(k, v, pjp));
    }

    private Complex checkIfExist(String k, Complex v, ProceedingJoinPoint pjp) {
        if (v == null) {
            try {
            System.out.println("add (" + k + ") to cash");
                return (Complex) pjp.proceed();
            } catch (Throwable e) {
                throw new IllegalStateException(e);
            }
        } else {
            System.out.println("From cash: " + k);
            return v;
        }
    }
}
