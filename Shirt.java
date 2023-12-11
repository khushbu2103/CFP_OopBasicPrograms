package OopsBasicPrograms;

public class Shirt {
    private String size;
    private String color;
    private double price;

    public Shirt(String size, String color, double price) {
        this.size = size;
        this.color = color;
        this.price = price;
    }

    public double calculateDiscount() {
        double discount = 0.0;
        if (this.size.equals("S")) {
            discount = 0.1;
        } else if (this.size.equals("M")) {
            discount = 0.15;
        } else if (this.size.equals("L")) {
            discount = 0.2;
        }
        return this.price * discount;
    }

    public double calculateDiscount(String size) {
        double discount = 0.0;
        if (size.equals("S")) {
            discount = 0.1;
        } else if (size.equals("M")) {
            discount = 0.15;
        } else if (size.equals("L")) {
            discount = 0.2;
        }
        return this.price * discount;
    }

    public void printShirtDetails() {
        double discountedPrice = this.price - calculateDiscount();
        System.out.println("Size: " + this.size);
        System.out.println("Color: " + this.color);
        System.out.println("Discounted Price: " + discountedPrice);
    }
}
class Shirt2 {
    public static void main(String[] args) {
        Shirt shirt = new Shirt("M", "Blue", 50.0);
        double discount = shirt.calculateDiscount();
        System.out.println("Discount: " + discount);
        shirt.printShirtDetails();
    }
}
