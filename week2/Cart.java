package week2;

import week2.util.Calculator;

import java.math.BigDecimal;

public class Cart {
    private Product[] products;

    public Cart(Product[] products) {
        this.products = products;
    }

    public BigDecimal getPriceIncludeDiscount() {
        BigDecimal totalDiscountPrice = BigDecimal.ZERO;
        for(Product product : products) {
            BigDecimal price = product.price.subtract(product.getDiscountAmount());
            totalDiscountPrice = totalDiscountPrice.add(price);
        }
        return totalDiscountPrice;
    }

    public double getTotalWeight() {
        double weight = 0;
        for(Product product : products) {
            weight += product.getWeight();
        }
        return weight;
    }

    public BigDecimal calculateDeliveryCharge() {

        return Calculator.getDeliveryCharge(getTotalWeight(), getPriceIncludeDiscount());
    }
}
