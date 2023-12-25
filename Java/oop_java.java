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

//----------------------------------------------------------------------------
// Method overloading
//Calculator Class
class Calculator {

  // Add funtions with two parameters
  int add(int num1, int num2) {
    return num1 + num2;
  }

  // Add funtions with three parameters
  int add(int num1, int num2, int num3 ) {
    return num1 + num2 + num3;
  }

  // Add funtions with four parameters
  int add(int num1, int num2, int num3, int num4 ) {
    return num1 + num2 + num3 + num4;
  }

  public static void main(String args[]) {
    Calculator cal = new Calculator();

    System.out.println("10 + 20 =  " + cal.add(10, 20));
    System.out.println("10 + 20 + 30 =  " + cal.add(10, 20, 30));
    System.out.println("10 + 20 + 30 + 40 =  " + cal.add(10, 20, 30, 40));
  }
  
}
//----------------------------------------------------------------------------

// Method overriding
// Shape Class
class Shape {
  
  public double getArea() {
    return 0;
  }
  
}

// A Rectangle is a Shape
class Rectangle extends Shape {  // extended form the Shape class

  private double length;
  private double width;
  
  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  public double getArea() {
    return this.width * this.length;
  }
  
}

// A Circle is a Shape
class Circle extends Shape {

  private double radius;
  
  public Circle(double radius) {
    this.radius = radius;
  }

  public double getArea() {
    return 3.13 * this.radius * this.radius;
  }


  public static void main(String args[]) {
    Shape[] shape = new Shape[2]; // Creating the shape array of size 2

    shape[0] = new Circle(3); // creating the circle object at index 0
    shape[1] = new Rectangle(2, 3); // creating the rectangle object at index 1

    System.out.println("Area of Circle: " + shape[0].getArea());
    System.out.println("Area of Rectangle: " + shape[1].getArea());
  }

}
