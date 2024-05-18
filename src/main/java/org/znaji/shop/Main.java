package org.znaji.shop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.znaji.shop.config.ShopConfig;
import org.znaji.shop.entity.Cashier;
import org.znaji.shop.entity.Product;
import org.znaji.shop.entity.ShoppingCart;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Locale;

public class Main {
    public static final String MSG = "The I18N message for %s is: %s%n";
    public static void main(String[] args) throws IOException {
        try (var context = new AnnotationConfigApplicationContext("org.znaji.shop")) {
            ShoppingCart cart = context.getBean(ShoppingCart.class);
            cart.addItem(context.getBean("aaa", Product.class));
            cart.addItem(context.getBean("cdrw", Product.class));

            Cashier cashier = context.getBean("theCashier" ,Cashier.class);
            cashier.checkout(cart);
        }
    }
}