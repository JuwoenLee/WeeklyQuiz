package week2;

public class Product {
    protected String name;
    protected double price;
    protected double weight;

    Product(String name, double price, double weight) {
        this.name  = name;
        this. price = price;
        this.weight = weight;
    }

    public double getPrice() {
        return this.price;
    }

    public double getWeight() {
        return this.weight;
    }
}
