package org.znaji.shop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.znaji.shop.config.ShopConfig;
import org.znaji.shop.entity.Cashier;
import org.znaji.shop.entity.Product;
import org.znaji.shop.entity.ShoppingCart;

import java.time.LocalDateTime;
import java.util.Locale;

public class Main {
    public static final String MSG = "The I18N message for %s is: %s%n";
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext("org.znaji.shop")) {
           var alertCheckout = context.getMessage("alert.checkout", null, Locale.FRANCE);
           var alertInventoryCheck = context.getMessage("alert.inventory.checkout", new Object[] {"[DVD-RW 3.0]", LocalDateTime.now()}, Locale.FRANCE);
            System.out.printf(MSG, "alert.checkout", alertCheckout);
            System.out.printf(MSG, "alert.inventory.checkout", alertInventoryCheck);

            Cashier cashier = context.getBean(Cashier.class);
            cashier.checkout();
        }
    }
}