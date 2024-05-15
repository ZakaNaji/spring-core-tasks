package org.znaji;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.znaji.entity.Product;

public class Main {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext("org.znaji.config")) {
            var aaa = context.getBean("aaa", Product.class);
            var cdrw = context.getBean("cdrw", Product.class);

            System.out.println(aaa);
            System.out.println(cdrw);
        }
    }
}