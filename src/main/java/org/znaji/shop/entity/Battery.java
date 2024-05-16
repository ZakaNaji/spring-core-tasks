package org.znaji.shop.entity;

public class Battery extends Product{

    private final boolean rechargeable;

    public Battery(String name, double price, boolean rechargeable) {
        super(name, price);
        this.rechargeable = rechargeable;
    }

    public boolean isRechargeable() {
        return rechargeable;
    }

    @Override
    public String toString() {
        var msg = super.toString();
        return msg + " Battery{" +
                "rechargeable=" + rechargeable +
                '}';
    }
}
