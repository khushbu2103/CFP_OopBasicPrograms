package OopsBasicPrograms;

public class Dog {
    private String breed;
    private int age;
    private double weight;

    public Dog(String breed, int age, double weight) {
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    public int getAgeInHumanYears() {
        if (age <= 2) {
            return age * 11;
        } else {
            return 22 + ((age - 2) * 5);
        }
    }

    public void printDogDetails() {
        System.out.println("Breed: " + breed);
        System.out.println("Age: " + age + " years");
        System.out.println("Weight: " + weight + " pounds");
    }
}
class Dod2 {
    public static void main(String[] args) {
        Dog myDog = new Dog("Golden Retriever", 3, 70.5);
        myDog.printDogDetails();
        System.out.println("Age in human years: " + myDog.getAgeInHumanYears());
    }
}
