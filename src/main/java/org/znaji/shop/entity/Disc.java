package org.znaji.shop.entity;

public class Disc extends Product{

    private final int capacity;

    public Disc(String name, double price, int capacity) {
        super(name, price);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        var msg = super.toString();
        return msg + " Disc{" +
                "capacity=" + capacity +
                '}';
    }
}
