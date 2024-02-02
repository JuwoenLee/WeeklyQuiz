package week2;

public interface DeliveryChargeCalculator {
    public abstract double getDeliveryCharge(double weight, double price);
    public abstract double getDefaultPrice(double weight);
    public abstract double getDiscountPrice(double price);
}
