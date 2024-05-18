package org.znaji.shop.config;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import org.znaji.shop.entity.Product;

@Component
public class BeanCheckPostProcess implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        if (bean instanceof Product product) {
            System.out.println("Before init procss - Product name: " + product.getName());
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) {
        if (bean instanceof Product product) {
            System.out.println("After init procss - Product name: " + product.getName());
        }
        return bean;
    }
}
