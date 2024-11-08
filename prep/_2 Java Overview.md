### Java Overview

Java is a high-level, object-oriented programming language known for its "write once, run anywhere" capability, thanks to the Java Virtual Machine (JVM). Developed in the mid-1990s by Sun Microsystems (now owned by Oracle), Java is widely used in web applications, enterprise-level software, mobile apps (especially Android), and backend services. It’s designed for platform independence, robustness, and high performance, making it a staple in software development.

Key Features:
- **Platform Independence:** Java programs run on any device with a JVM, making them versatile across platforms.
- **Object-Oriented:** Java is based on object-oriented programming (OOP) principles, emphasizing concepts like encapsulation, inheritance, and polymorphism.
- **Memory Management:** Java uses automatic garbage collection, reducing manual memory management needs.
- **Strong Typing and Security:** With its strong, static typing and built-in security features, Java promotes safer and more predictable code.
- **Standard Libraries:** Java includes extensive libraries and frameworks for networking, database access, and UI development.

### Introduction to Java for a JavaScript Developer

#### Lesson 1: Basics of Java Syntax and Structure

Java syntax shares some similarities with JavaScript but also differs significantly in structure, typing, and OOP principles.

1. **Hello, World in Java:**
   - The Java "Hello, World" program is similar in concept but has more structure than in JavaScript.

   ```java
   public class HelloWorld {
       public static void main(String[] args) {
           System.out.println("Hello, World!");
       }
   }
   ```
   - **Key Elements**:
     - `public class HelloWorld`: Java is strictly object-oriented, so all code must be in a class.
     - `public static void main(String[] args)`: The `main` method is the entry point for any Java application.
     - `System.out.println()`: This prints text to the console, similar to `console.log()` in JavaScript.

2. **Types and Variables:**
   - Java is statically typed, so variable types are defined when declared:
     ```java
     int count = 5;      // Integer
     double price = 9.99; // Double (floating-point number)
     String name = "Java"; // String
     boolean isActive = true; // Boolean
     ```
   - Java has a fixed set of primitive types (e.g., `int`, `double`, `boolean`, `char`), as well as classes (e.g., `String`) and other complex objects.

3. **Functions (Methods) in Java:**
   - Functions in Java are called "methods" and must be defined within classes:
     ```java
     public class Calculator {
         public int add(int a, int b) {
             return a + b;
         }
     }
     ```
   - In JavaScript, you can create functions anywhere, but in Java, every function must belong to a class.

4. **Control Flow:**
   - Java shares similar control flow structures with JavaScript, including `if-else`, `for`, and `while` loops. However, the syntax is more strict in Java:
     ```java
     for (int i = 0; i < 5; i++) {
         System.out.println(i);
     }
     ```

5. **Objects and Classes:**
   - In Java, everything is based on classes and objects. Here's a simple example to show how to create an object:
     ```java
     public class Car {
         String model;
         int year;
     
         public Car(String model, int year) {
             this.model = model;
             this.year = year;
         }
     
         public void displayInfo() {
             System.out.println("Model: " + model + ", Year: " + year);
         }
     }
     
     public class Main {
         public static void main(String[] args) {
             Car car1 = new Car("Toyota", 2022);
             car1.displayInfo();
         }
     }
     ```

   - **Class Structure**:
     - Constructor: Similar to the `constructor` function in JavaScript classes.
     - `this`: Refers to the current object instance, like in JavaScript.

### Key Takeaways for a JavaScript Developer

- **Static Typing**: Java requires variable types to be declared, unlike JavaScript's dynamic typing.
- **Class-based Structure**: In Java, every function or variable belongs to a class, reinforcing the OOP paradigm.
- **Compilation**: Java is compiled into bytecode, then run on the JVM, rather than interpreted directly in a browser or node environment.

### Hands-On Practice

1. **Exercise**: Write a Java program that takes two numbers, adds them, and prints the result.
2. **Challenge**: Create a class named `Book` with properties `title`, `author`, and `yearPublished`. Write methods to set and retrieve these properties, then print them in the console.

This introduction sets a foundation for moving into Java's unique features, like inheritance, interfaces, exception handling, and more robust data structures.