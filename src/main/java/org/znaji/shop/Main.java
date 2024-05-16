package org.znaji.shop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.znaji.shop.entity.Product;
import org.znaji.shop.entity.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext("org.znaji")) {
            var aaa = context.getBean("aaa", Product.class);
            var cdrw = context.getBean("cdrw", Product.class);
            var dvdrw = context.getBean("dvdrw", Product.class);

            var shopCart1 = context.getBean(ShoppingCart.class);
            shopCart1.addItem(aaa);
            shopCart1.addItem(cdrw);

            var shopCart2 = context.getBean(ShoppingCart.class);
            shopCart2.addItem(dvdrw);

            System.out.println("Shopping cart 1:" + shopCart1.getItems());
            System.out.println("Shopping cart 2:" + shopCart2.getItems());
        }
    }
}