package Encapsulation;
public class EncapsulationDemo {
    public static void main(String[] args) {
        // Creating a Student object
        Student student = new Student();
        
        // Setting values using setter methods
        student.setName("John Doe");
        student.setAge(20);
        student.setRollNo("S12345");
        
        // Getting values using getter methods
        System.out.println("Student Details:");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Roll Number: " + student.getRollNo());
    }   
}

class Student {
    // Private fields (encapsulation)
    private String name;
    private int age;
    private String rollNo;

    // Getter and Setter methods for encapsulation
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0) { // Adding validation to set age
            this.age = age;
        } else {
            System.out.println("Age cannot be negative or zero.");
        }
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }
}
