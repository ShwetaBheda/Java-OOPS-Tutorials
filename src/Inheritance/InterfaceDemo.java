package Inheritance;

public class InterfaceDemo {
    public static void main(String[] args) {
        // Create a Dog object and call its methods
        Dog myDog = new Dog();
        myDog.sound();  // Output: Dog barks
        myDog.play();   // Output: Dog plays fetch

        // Create a Cat object and call its method
        Cat myCat = new Cat();
        myCat.sound();  // Output: Cat meows

        // Using interfaces as reference types
        Animal animalDog = new Dog();
        animalDog.sound();  // Output: Dog barks

        Animal animalCat = new Cat();
        animalCat.sound();  // Output: Cat meows
    }
}
// Define an interface for basic animal behavior
interface Animal {
    void sound();  // Abstract method
}

// Define another interface for pet-specific behavior
interface Pet {
    void play();
}

// Implement both interfaces in a class
class Dog implements Animal, Pet {
    // Implement the sound method from Animal interface
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    // Implement the play method from Pet interface
    @Override
    public void play() {
        System.out.println("Dog plays fetch");
    }
}

// Define another class implementing the Animal interface
class Cat implements Animal {
    // Implement the sound method from Animal interface
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}
