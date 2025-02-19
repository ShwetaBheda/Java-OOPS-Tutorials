package Abstraction;

// Abstract class
abstract class Animal {
    // Abstract method (does not have a body)
    abstract void makeSound();

    // Concrete method (has a body)
    void sleep() {
        System.out.println("Sleeping...");
    }
}

// Subclass (inherits from Animal)
class Dog extends Animal {
    // Providing implementation for the abstract method
    @Override
    void makeSound() {
        System.out.println("Dog barks: Woof! Woof!");
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        // Animal animal = new Animal(); // Error! Cannot instantiate an abstract class
        Animal myDog = new Dog(); // Creating an object of Dog using Animal reference
        myDog.makeSound(); // Calls Dog's makeSound() method
        myDog.sleep(); // Calls Animal's sleep() method

        // Creating an object of Dog directly
        Dog myDog2 = new Dog();
        myDog2.makeSound(); // Calls Dog's makeSound() method
        myDog2.sleep(); // Calls Dog's sleep() method
    }
}


