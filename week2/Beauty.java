package week2;

import week2.util.Calculator;

import java.math.BigDecimal;

public class Beauty extends Product {
    Beauty(String name, BigDecimal price, double weight) {
        super(name, price, weight);
    }

    public BigDecimal getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

}
