package org.znaji.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.znaji.entity.Battery;
import org.znaji.entity.Product;
import org.znaji.entity.Disc;

@Configuration
public class ShopConfig {

    @Bean
    public Product aaa() {
        return new Battery("AAA", 2.5, true);
    }

    @Bean
    public Product cdrw() {
        return new Disc("CD-RW", 1.5, 700);
    }
}
