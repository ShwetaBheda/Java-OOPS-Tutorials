package Polymorphism;

public class CompileTimePolymorphism {

    public static void main(String[] args) {
        // Compile-time polymorphism using method overloading
        Calculator calculator = new Calculator();
        int result1 = calculator.multiply(2, 3);
        double result2 = calculator.multiply(2.5, 3.7);
        
        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
    }
}
class Calculator {
    int multiply(int a, int b) {
        return a * b;
    }
    
    double multiply(double a, double b) {
        return a * b;
    }
}
