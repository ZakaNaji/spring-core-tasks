package org.znaji.sequence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SequenceConfig {

    @Bean
    public DatePrefixGenerator datePrefixGenerator() {
        var dpg = new DatePrefixGenerator();
        dpg.setPattern("yyyyMMdd");
        return dpg;
    }


}
