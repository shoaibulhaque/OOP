# Object-Oriented Programming (OOP) Cheatsheet in Python

# Define a class
class Animal:
    # Constructor
    def __init__(self, name, age):
        self.name = name
        self.age = age

    # Method
    def make_sound(self):
        print("Animal makes a sound")

    # Getter and Setter methods
    def get_name(self):
        return self.name

    def set_name(self, name):
        self.name = name

    def get_age(self):
        return self.age

    def set_age(self, age):
        self.age = age

    # Method overloading
    def print_details(self, additional_info=None):
        if additional_info:
            print(f"Name: {self.name}, Age: {self.age}, {additional_info}")
        else:
            print(f"Name: {self.name}, Age: {self.age}")


# Inheritance
class Dog(Animal):
    # Constructor for Dog
    def __init__(self, name, age, breed):
        super().__init__(name, age)  # Call the constructor of the superclass (Animal)
        self.breed = breed

    # Method overriding
    def make_sound(self):
        print("Dog barks")

    # Additional method specific to Dog
    def wag_tail(self):
        print("Dog wags tail")

    # Overloaded method
    def print_details(self):
        super().print_details()  # Call the superclass method
        print(f"Breed: {self.breed}")


# Encapsulation
class Person:
    # Constructor
    def __init__(self, name, age):
        self._name = name  # Private attribute convention (_name)
        self._age = age

    # Getter and Setter methods
    def get_name(self):
        return self._name

    def set_name(self, name):
        self._name = name

    def get_age(self):
        return self._age

    def set_age(self, age):
        self._age = age


# Abstract class
from abc import ABC, abstractmethod


class Shape(ABC):
    # Abstract method (to be implemented by subclasses)
    @abstractmethod
    def calculate_area(self):
        pass


class Circle(Shape):
    # Constructor
    def __init__(self, radius):
        self.radius = radius

    # Implementation of abstract method
    def calculate_area(self):
        return 3.14 * self.radius * self.radius


class Rectangle(Shape):
    # Constructor
    def __init__(self, length, width):
        self.length = length
        self.width = width

    # Implementation of abstract method
    def calculate_area(self):
        return self.length * self.width


# Static method and Exception handling
class MathUtils:
    # Static method
    @staticmethod
    def add(a, b):
        return a + b

    # Exception handling
    @staticmethod
    def divide(a, b):
        try:
            return a / b
        except ZeroDivisionError as e:
            print(f"Error: {e}")
            return 0


# Main function
def main():
    # Creating objects
    my_animal = Animal("Lion", 5)
    my_dog = Dog("Buddy", 3, "Golden Retriever")

    # Accessing fields and methods
    print(f"Animal name: {my_animal.get_name()}")
    my_animal.make_sound()

    print(f"Dog name: {my_dog.get_name()}")
    my_dog.make_sound()
    my_dog.wag_tail()

    # Method overloading
    my_animal.print_details()
    my_animal.print_details("Wild animal")

    my_dog.print_details()

    # Encapsulation
    person = Person("John", 25)
    print(f"Person name: {person.get_name()}")

    # Polymorphism
    circle = Circle(3.0)
    rectangle = Rectangle(4.0, 5.0)

    print_area(circle)
    print_area(rectangle)

    # Static method and Exception handling
    print(f"Sum: {MathUtils.add(10, 5)}")
    print(f"Division: {MathUtils.divide(10, 2)}")
    print(f"Division: {MathUtils.divide(10, 0)}")


# Polymorphism example
def print_area(shape):
    print(f"Area: {shape.calculate_area()}")


if __name__ == "__main__":
    main()
