package org.znaji.shop.entity;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class Cashier {
    private final MessageSource messageSource;

    public Cashier(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public void checkout() {
        String message = messageSource.getMessage("alert.inventory.checkout", new Object[]{"[DVD-RW 3.0]", "3"}, Locale.US);
        System.out.println(message);
    }
}
