package org.znaji.entity;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@Scope("prototype")
public class ShoppingCart {

    private final List<Product> items = new ArrayList<>();

    public void addItem(Product item) {
        items.add(item);
    }

    public List<Product> getItems() {
        return Collections.unmodifiableList(items);
    }
}
