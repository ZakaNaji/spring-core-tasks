package org.znaji.shop.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.znaji.shop.entity.*;

import java.util.Map;

@Configuration
@PropertySource("classpath:discounts.properties")
public class ShopConfig {


    @Bean
    public ReloadableResourceBundleMessageSource messageSource() {
        var messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("classpath:messages");
        messageSource.setCacheSeconds(1);
        return messageSource;
    }

    @Bean
    public ProductGenerator productGenerator() {
        var products = Map.of(
                "aaa", new Battery("AAA", 2.5, true),
                "cdrw", new Disc("CD-RW", 1.5, 700),
                "dvdrw", new Disc("DVD-RW", 3.0, 4700));
        return new ProductGenerator(products);
    }

        @Bean
    public Product aaa(ProductGenerator productGenerator) {
        return productGenerator.generateProduct("aaa");
    }

    @Bean
    public Product cdrw(ProductGenerator productGenerator) {
        return productGenerator.generateProduct("cdrw");
    }

    @Bean
    public Product dvdrw(ProductGenerator productGenerator) {
        return productGenerator.generateProduct("dvdrw");
    }

    @Bean(name = "theCashier")
    public Cashier cashier() {
        String tempFolder = System.getProperty("java.io.tmpdir") + "/cashier";
        return new Cashier("checkout", tempFolder);
    }
}
