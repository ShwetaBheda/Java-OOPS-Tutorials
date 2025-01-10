public class App {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.speed = 120;
        car1.drive();
    }
}

class Car {
    String brand;
    int speed;

    void drive() {
        System.out.println("Driving the car with brand " + brand + " at speed " + speed);
    }
}
