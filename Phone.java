package OopsBasicPrograms;

public class Phone {
    String make;
    String model;
    int storage;

    public Phone(String make, String model, int storage) {
        this.make = make;
        this.model = model;
        this.storage = storage;
    }

    public void calculatePrice() {
        double price = 0.0;
        if (make.equals("Apple")) {
            if (model.equals("iPhone 13")) {
                price = 999.99;
            } else if (model.equals("iPhone 13 Pro")) {
                price = 1199.99;
            } else if (model.equals("iPhone 13 Pro Max")) {
                price = 1299.99;
            }
        } else if (make.equals("Samsung")) {
            if (model.equals("Galaxy S21")) {
                price = 799.99;
            } else if (model.equals("Galaxy S21+")) {
                price = 999.99;
            } else if (model.equals("Galaxy S21 Ultra")) {
                price = 1199.99;
            }
        }
        if (storage == 128) {
            price += 50.0;
        } else if (storage == 256) {
            price += 100.0;
        } else if (storage == 512) {
            price += 200.0;
        }
        System.out.println("Price: " + price);
    }

    public void printPhone() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Storage: " + storage + "GB");
    }
}
class Phone2
{
    public static void main(String[] args) {
        Phone ph = new Phone("Apple", "iPhone 13", 128);
        ph.printPhone();
        ph.calculatePrice();
    }
}
