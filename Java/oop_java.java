// Object-Oriented Programming (OOP) Cheatsheet in Java

// Define a class
class Animal {
    // Fields (attributes)
    String name;
    int age;

    // Constructors
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Methods
    void makeSound() {
        System.out.println("Animal makes a sound");
    }

    // Getter and Setter methods
    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }

    // Method overloading
    void printDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    void printDetails(String additionalInfo) {
        System.out.println("Name: " + name + ", Age: " + age + ", " + additionalInfo);
    }
}

// Inheritance
class Dog extends Animal {
    // Additional fields specific to Dog
    String breed;

    // Constructor for Dog
    public Dog(String name, int age, String breed) {
        super(name, age); // Call the constructor of the superclass (Animal)
        this.breed = breed;
    }

    // Overriding a method from the superclass
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }

    // Additional method specific to Dog
    void wagTail() {
        System.out.println("Dog wags tail");
    }

    // Overloaded method
    void printDetails() {
        super.printDetails(); // Call the superclass method
        System.out.println("Breed: " + breed);
    }
}

// Encapsulation
class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter and Setter methods
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
        this.age = age;
    }
}

// Abstract class
abstract class Shape {
    // Abstract method (to be implemented by subclasses)
    abstract double calculateArea();
}

class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}

// Static method and Exception handling
class MathUtils {
    // Static method
    static int add(int a, int b) {
        return a + b;
    }

    // Exception handling
    static int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
            return 0;
        }
    }
}

// Main class
public class OOPCheatsheet {
    public static void main(String[] args) {
        // Creating objects
        Animal myAnimal = new Animal("Lion", 5);
        Dog myDog = new Dog("Buddy", 3, "Golden Retriever");

        // Accessing fields and methods
        System.out.println("Animal name: " + myAnimal.getName());
        myAnimal.makeSound();

        System.out.println("Dog name: " + myDog.getName());
        myDog.makeSound();
        myDog.wagTail();

        // Method overloading
        myAnimal.printDetails();
        myAnimal.printDetails("Wild animal");

        myDog.printDetails();

        // Encapsulation
        Person person = new Person("John", 25);
        System.out.println("Person name: " + person.getName());

        // Polymorphism
        Circle circle = new Circle(3.0);
        Rectangle rectangle = new Rectangle(4.0, 5.0);

        printArea(circle);
        printArea(rectangle);

        // Static method and Exception handling
        System.out.println("Sum: " + MathUtils.add(10, 5));
        System.out.println("Division: " + MathUtils.divide(10, 2));
        System.out.println("Division: " + MathUtils.divide(10, 0));
    }

    // Polymorphism example
    static void printArea(Shape shape) {
        System.out.println("Area: " + shape.calculateArea());
    }
}
