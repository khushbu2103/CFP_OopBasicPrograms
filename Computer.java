package OopsBasicPrograms;

public class Computer {
    private String processor;
    private int RAM;
    private int storage;

    public Computer(String processor, int RAM, int storage) {
        this.processor = processor;
        this.RAM = RAM;
        this.storage = storage;
    }

    public void calculatePrice() {
        double price = 0.0;
        if (processor.equals("i3")) {
            price += 300.0;
        } else if (processor.equals("i5")) {
            price += 500.0;
        } else if (processor.equals("i7")) {
            price += 700.0;
        }
        price += RAM * 10.0;
        price += storage * 0.5;
        System.out.println("price: " + price);
    }

    public void printSpecs() {
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + RAM + " GB");
        System.out.println("Storage: " + storage + " GB");
    }
}
class Computer2
{
    public static void main(String[] args) {
        Computer co = new Computer("i3", 5, 128);
        co.printSpecs();
        co.calculatePrice();
    }
}
