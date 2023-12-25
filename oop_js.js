// Object-Oriented Programming (OOP) Cheatsheet in JavaScript

// Define a class
class Animal {
    // Constructor
    constructor(name, age) {
        this.name = name;
        this.age = age;
    }

    // Method
    makeSound() {
        console.log("Animal makes a sound");
    }

    // Getter and Setter methods
    getName() {
        return this.name;
    }

    setName(name) {
        this.name = name;
    }

    getAge() {
        return this.age;
    }

    setAge(age) {
        this.age = age;
    }

    // Method overloading
    printDetails(additionalInfo) {
        if (additionalInfo) {
            console.log(`Name: ${this.name}, Age: ${this.age}, ${additionalInfo}`);
        } else {
            console.log(`Name: ${this.name}, Age: ${this.age}`);
        }
    }
}

// Inheritance
class Dog extends Animal {
    // Constructor for Dog
    constructor(name, age, breed) {
        super(name, age); // Call the constructor of the superclass (Animal)
        this.breed = breed;
    }

    // Method overriding
    makeSound() {
        console.log("Dog barks");
    }

    // Additional method specific to Dog
    wagTail() {
        console.log("Dog wags tail");
    }

    // Overloaded method
    printDetails() {
        super.printDetails(); // Call the superclass method
        console.log(`Breed: ${this.breed}`);
    }
}

// Encapsulation
class Person {
    // Constructor
    constructor(name, age) {
        this._name = name; // Convention for private attribute
        this._age = age;
    }

    // Getter and Setter methods
    getName() {
        return this._name;
    }

    setName(name) {
        this._name = name;
    }

    getAge() {
        return this._age;
    }

    setAge(age) {
        this._age = age;
    }
}

// Abstract class (simulated using a function)
function Shape() {
    if (this.constructor === Shape) {
        throw new Error("Cannot instantiate abstract class");
    }
}

// Abstract method
Shape.prototype.calculateArea = function () {
    throw new Error("Abstract method not implemented");
};

// Concrete subclasses
class Circle extends Shape {
    // Constructor
    constructor(radius) {
        super();
        this.radius = radius;
    }

    // Implementation of abstract method
    calculateArea() {
        return Math.PI * this.radius * this.radius;
    }
}

class Rectangle extends Shape {
    // Constructor
    constructor(length, width) {
        super();
        this.length = length;
        this.width = width;
    }

    // Implementation of abstract method
    calculateArea() {
        return this.length * this.width;
    }
}

// Static method and Exception handling
class MathUtils {
    // Static method
    static add(a, b) {
        return a + b;
    }

    // Exception handling
    static divide(a, b) {
        try {
            return a / b;
        } catch (error) {
            console.error(`Error: ${error.message}`);
            return 0;
        }
    }
}

// Main function
function main() {
    // Creating objects
    const myAnimal = new Animal("Lion", 5);
    const myDog = new Dog("Buddy", 3, "Golden Retriever");

    // Accessing fields and methods
    console.log(`Animal name: ${myAnimal.getName()}`);
    myAnimal.makeSound();

    console.log(`Dog name: ${myDog.getName()}`);
    myDog.makeSound();
    myDog.wagTail();

    // Method overloading
    myAnimal.printDetails();
    myAnimal.printDetails("Wild animal");

    myDog.printDetails();

    // Encapsulation
    const person = new Person("John", 25);
    console.log(`Person name: ${person.getName()}`);

    // Polymorphism
    const circle = new Circle(3.0);
    const rectangle = new Rectangle(4.0, 5.0);

    printArea(circle);
    printArea(rectangle);

    // Static method and Exception handling
    console.log(`Sum: ${MathUtils.add(10, 5)}`);
    console.log(`Division: ${MathUtils.divide(10, 2)}`);
    console.log(`Division: ${MathUtils.divide(10, 0)}`);
}

// Polymorphism example
function printArea(shape) {
    console.log(`Area: ${shape.calculateArea()}`);
}

// Call the main function
main();
