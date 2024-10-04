public class Animal {
    // Fields
    public int age;
    public String gender;

    // Constructor
    public Animal(int age, String gender) {
        this.age = age;
        this.gender = gender;
    }

    // Methods
    public boolean isMammal() {
        System.out.println("This is the isMammal method from Animal class");
        return true;  // Assuming all Animals are mammals for now
    }

    public void mate() {
        System.out.println("This is the mate method from Animal class");
    }

    // Main method to test the classes
    public static void main(String[] args) {
        // Creating objects for each class
        Animal myAnimal = new Animal(5, "Female");
        Fish myFish = new Fish(2, "Male", 3);
        Zebra myZebra = new Zebra(7, "Male", true);

        // Calling methods from Animal class
        myAnimal.isMammal();
        myAnimal.mate();

        // Calling methods from Zebra class
        myZebra.run();
        System.out.println("Is Zebra wild? " + myZebra.is_wild);
    }
}

// Fish class as a subclass of Animal
class Fish extends Animal {
    // Fields
    private int sizeInFeet;

    // Constructor
    public Fish(int age, String gender, int sizeInFeet) {
        super(age, gender);
        this.sizeInFeet = sizeInFeet;
    }

    // Private method
    private void canEat() {
        System.out.println("This is a private method canEat() from class Fish");
    }

    // You can add additional public methods if needed
}

// Zebra class as a subclass of Animal
class Zebra extends Animal {
    // Fields
    public boolean is_wild;

    // Constructor
    public Zebra(int age, String gender, boolean is_wild) {
        super(age, gender);
        this.is_wild = is_wild;
    }

    // Methods
    public void run() {
        System.out.println("This is the run method from Zebra class");
    }
}
