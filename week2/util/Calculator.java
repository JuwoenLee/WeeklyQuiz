package week2.util;

import java.math.BigDecimal;

public class Calculator {

    public static final BigDecimal LOWER_PRICE = BigDecimal.valueOf(30000);
    public static final BigDecimal HIGHER_PRICE = BigDecimal.valueOf(100000);

    public static final double LOWER_WEIGHT = 3.0;
    public static final double HIGHER_WEIGHT = 10.0;

    public static BigDecimal getDeliveryCharge(double weight, BigDecimal price) {

        BigDecimal defaultPrice = getDefaultPrice(weight);

        if(price.compareTo(LOWER_PRICE) < 0) {
           return defaultPrice;
        } else if(price.compareTo(HIGHER_PRICE) <= 0){
            return defaultPrice.subtract(BigDecimal.valueOf(1000));
        }
        return BigDecimal.ZERO;
    }

    public static BigDecimal getDefaultPrice(double weight) {
        if(weight < LOWER_WEIGHT) {
            return BigDecimal.valueOf(1000);
        }
        else if(weight < HIGHER_WEIGHT) {
            return BigDecimal.valueOf(5000);
        }
        return BigDecimal.valueOf(10000);
    }
}
