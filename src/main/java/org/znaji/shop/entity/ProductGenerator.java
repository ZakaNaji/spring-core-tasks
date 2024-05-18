package org.znaji.shop.entity;

public class ProductGenerator {
    public static Product generateProduct(final String productId) {

        return switch (productId) {
            case "aaa" -> new Battery("AAA", 2.5, true);
            case "cdrw" -> new Disc("CD-RW", 1.5, 700);
            case "dvdrw" -> new Disc("DVD-RW", 4000, 4000);
            default -> throw new IllegalArgumentException("Unknown product");
        };
    }
}
