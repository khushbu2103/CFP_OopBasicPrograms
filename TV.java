package OopsBasicPrograms;

public class TV {
    String brand;
    int size;
    double price;

    public TV(String brand, int size, double price) {
        this.brand = brand;
        this.size = size;
        this.price = price;
    }
    public double calculateDiscount() {
        double discount = 0.0;
        if (size < 32) {
            discount = 0.05;
        } else if (size >= 32 && size < 50) {
            discount = 0.10;
        } else if (size >= 50) {
            discount = 0.15;
        }
        return price - (price * discount);
    }

    public void printTV() {
        System.out.println("Brand: " + brand);
        System.out.println("Size: " + size + " inches");
        System.out.println("Discounted Price: " + calculateDiscount());
    }
}
class TV2 {
    public static void main(String[] args) {
        TV tv = new TV("Samsung", 55, 1000.0);
        tv.printTV();
    }
}
