package OopsBasicPrograms;

public class Furniture {
    String type;
    String material;
    double price;

    public Furniture(String type, String material, double price) {
        this.type = type;
        this.material = material;
        this.price = price;
    }
    double discount;
    double discountedPrice;
    public void calculateDiscount() {

        if (material.equals("wood")) {
            discount = 0.1;
        } else if (material.equals("plastic")) {
            discount = 0.05;
        } else if (material.equals("metal")) {
            discount = 0.15;
        }
        System.out.println("discount: " + discount);
        discountedPrice = price - (price * discount);
        System.out.println("discounted price: " + discountedPrice);
    }

    public void printDetails() {
        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        //System.out.println("Discount: " + discount);
    }
}
class Furniture2
{
    public static void main(String[] args) {
        Furniture fu = new Furniture("sofa", "wood", 5000);
        fu.printDetails();
        fu.calculateDiscount();
    }
}
