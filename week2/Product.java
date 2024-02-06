package week2;

import java.math.BigDecimal;

public class Product implements Promotion {
    protected String name;
    protected BigDecimal price;
    protected double weight;

    Product(String name, BigDecimal price, double weight) {
        this.name  = name;
        this.price = price;
        this.weight = weight;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public double getWeight() {
        return this.weight;
    }


    @Override
    public BigDecimal getDiscountAmount() {
        return BigDecimal.ZERO;
    }
}
