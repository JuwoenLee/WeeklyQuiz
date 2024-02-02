package week2;

public class Main {
    public static void main(String[] args) {
        Beauty beauty = new Beauty("화장품", 1000, 1);
        Grocery grocery = new Grocery("식료품", 30000, 3);
        LargeAppliance largeAppliance = new LargeAppliance("대형가전", 100000, 10);

        System.out.println("립스틱 : " + beauty.getDeliveryCharge(beauty.getWeight(), beauty.getPrice()));
        System.out.println("식료품 : " + grocery.getDeliveryCharge(grocery.getWeight(), grocery.getPrice()));
        System.out.println("대형가전 : " + largeAppliance.getDeliveryCharge(largeAppliance.getWeight(), largeAppliance.getPrice()));
    }
}
