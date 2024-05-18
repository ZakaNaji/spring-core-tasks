package org.znaji.shop.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.znaji.shop.entity.Battery;
import org.znaji.shop.entity.Cashier;
import org.znaji.shop.entity.Product;
import org.znaji.shop.entity.Disc;

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
        return new Battery("AAA", 2.5, true);
    }

    @Bean
    public Product cdrw() {
        return new Disc("CD-RW", 1.5, 700);
    }

    @Bean
    public Product dvdrw() {
        return new Disc("DVD-RW", 4000, 4000);
    }

    @Bean(name = "theCashier")
    public Cashier cashier() {
        String tempFolder = System.getProperty("java.io.tmpdir") + "/cashier";
        return new Cashier("checkout", tempFolder);
    }
}
