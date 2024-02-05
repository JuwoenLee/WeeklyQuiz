package week2;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Beauty beauty = new Beauty("beauty", BigDecimal.valueOf(30000), 2);
        Grocery grocery = new Grocery("grocery", BigDecimal.valueOf(20000), 3);
        LargeAppliance largeAppliance = new LargeAppliance("largeAppliance", BigDecimal.valueOf(50000),5);

        Cart cart = new Cart(new Product[] {beauty, grocery, largeAppliance});
        BigDecimal totalDeliveryCharge = cart.calculateDeliveryCharge();
        System.out.println(totalDeliveryCharge);
    }
}
