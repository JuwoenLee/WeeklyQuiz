package week2;

public class LargeAppliance extends Product implements DeliveryChargeCalculator{

    double deliveryPrice;
    LargeAppliance(String name, double price, double weight) {
        super(name, price, weight);
    }

    @Override
    public double getDeliveryCharge(double weight, double price) {
        if(getDiscountPrice(price) != -1) {
            deliveryPrice = getDefaultPrice(weight) - getDiscountPrice(price);
        } else {
            deliveryPrice = 0;
        }
        return deliveryPrice;
    }

    @Override
    public double getDefaultPrice(double weight) {
        if(weight < 3) {
            return 1000;
        }
        else if(weight >= 3 && weight < 10) {
            return 5000;
        }
        return 10000;
    }

    @Override
    public double getDiscountPrice(double price) {
        if(price < 30000) {
            return 0;
        }
        else if(price >= 3000 && price < 100000) {
            return 1000;
        }
        return -1;
    }
}
