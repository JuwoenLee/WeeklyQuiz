package week2;

import java.math.BigDecimal;

public class LargeAppliance extends Product {

    LargeAppliance(String name, BigDecimal price, double weight) {
        super(name, price, weight);
    }

    public BigDecimal getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }
}
