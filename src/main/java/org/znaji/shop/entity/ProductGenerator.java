package org.znaji.shop.entity;

import java.util.Map;

public class ProductGenerator {
    private final Map<String, Product> products;

    public ProductGenerator(Map<String, Product> products) {
        this.products = products;
    }

    public Product generateProduct(String name) {
        if (products.containsKey(name)) {
            return products.get(name);
        }
        throw new IllegalArgumentException("Unknown product: " + name);
    }
}
