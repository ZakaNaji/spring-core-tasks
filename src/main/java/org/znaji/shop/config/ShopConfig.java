package org.znaji.shop.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.znaji.shop.entity.*;

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
    public Product aaa() {
        return ProductGenerator.generateProduct("aaa");
    }

    @Bean
    public Product cdrw() {
        return ProductGenerator.generateProduct("cdrw");
    }

    @Bean
    public Product dvdrw() {
        return ProductGenerator.generateProduct("dvdrw");
    }

    @Bean(name = "theCashier")
    public Cashier cashier() {
        String tempFolder = System.getProperty("java.io.tmpdir") + "/cashier";
        return new Cashier("checkout", tempFolder);
    }
}
