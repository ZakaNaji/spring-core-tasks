package org.znaji.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.znaji.entity.Battery;
import org.znaji.entity.Product;
import org.znaji.entity.Disc;

@Configuration
@PropertySource("classpath:discounts.properties")
public class ShopConfig {

    @Value("${endofyear.discount:0}")
    private double specialEndOfYearDiscountField;

    @Bean
    public Product aaa() {
        return new Battery("AAA", 2.5, true);
    }

    @Bean
    public Product cdrw() {
        return new Disc("CD-RW", 1.5, 700);
    }

    @Bean
    public Product dvdrw() {
        return new Disc("DVD-RW", 4000- specialEndOfYearDiscountField, 4000);
    }
}
