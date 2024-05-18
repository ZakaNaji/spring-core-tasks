package org.znaji.shop.config;

import org.springframework.beans.factory.config.AbstractFactoryBean;
import org.znaji.shop.entity.Product;

public class DiscountBeanFactory extends AbstractFactoryBean<Product> {

    private Product product;
    private double discount;

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public Class<?> getObjectType() {
        return Product.class;
    }

    @Override
    protected Product createInstance() throws Exception {
        product.setPrice(product.getPrice() * (1 - discount));
        return product;
    }
}
