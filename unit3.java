// Save this file as Main.java

class Animal {

    String name;

    // Parent Constructor
    Animal(String name) {
        this.name = name;
        System.out.println("Animal Constructor Called");
    }

    void eat() {
        System.out.println(name + " is eating");
    }

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    String breed;

    // Child Constructor
    Dog(String name, String breed) {
        super(name);  // Calling Parent Constructor
        this.breed = breed;
        System.out.println("Dog Constructor Called");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
    }

    // Method Overriding
    @Override
    void sound() {
        System.out.println(name + " barks");
    }
}

public class unit3 {

    public static void main(String[] args) {

        System.out.println("----- Creating Dog Object -----");
        Dog d1 = new Dog("Buddy", "Labrador");

        System.out.println("\n----- Calling Methods -----");
        d1.display();
        d1.eat();      // Inherited method
        d1.sound();    // Overridden method

        System.out.println("\n----- Polymorphism Example -----");
        Animal a1 = new Dog("Rocky", "German Shepherd");
        a1.sound();    // Runtime Polymorphism
        a1.eat();
    }
}