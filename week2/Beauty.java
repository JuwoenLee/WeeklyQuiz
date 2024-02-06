package week2;

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

    @Override
    public BigDecimal getDiscountAmount() {
        return BigDecimal.valueOf(10000);
    }

}
