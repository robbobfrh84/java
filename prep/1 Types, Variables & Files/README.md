# Types and Variables

#### Primitive Types:

Java has a fixed set of **primitive types**: These primitive types are the simplest data types in Java and are not objects. They are stored directly in memory, making them more efficient than objects for representing simple values.

```java
byte age = 40; // 8-bit signed integer (-128 to 127)
short temperature = 300; // 16-bit signed integer (-32,768 to 32,767)
int number = 5; // 32-bit signed integer (-2,147,483,648 to 2,147,483,647)
long population = 7800000000L; // 64-bit signed integer(+/- 9+ quintillion)
float pi = 3.14f; //  32-bit (7 decimal digits)
double floatNum = 4.5; // 64-bit floating-point (15 decimal digits)
boolean isOn = false; // Size: 1 bit (although size may vary by JVM)
char grade = "A"; // 16-bit Unicode character
```

#### Strings:

In Java, `String` is **not** a primitive data type. Instead, it’s a class in the `java.lang` package and is considered a **reference type**. Unlike primitive types, `String` is an object that represents a sequence of characters.

```java
String name = "Bobby!";
```

Define:

- Java file / OOP
  - **class**: for any OOP language. It's like a **Blueprint** / **Template** for creating objects.
    -  It defines the properties(**attributes**) and behaviors(**methods**)
  - **public**: allows it to be an open method to Java Runtime. The 'main' method must be public as it is the "entry point" of application.
  - **static**: Means you don't need to create an instance to call it. AND, is shared across ALL instances.
  - **void**: A method that does not return any value. 
  - **fields** or **member variables**: vars that represent the attributes or state of the objects created from the class. Sometimes referred to as **instance variables** (if each object has its own copy) or **class variables** (if they are shared across all instances using the `static` keyword).
  - **main(method name)**: must be used and only method to call from terminal. Which is implied when you call the` java filename.java` command. 
  - **Contractor**: Method with the same name as class that handles arguments. 
- ? What is `javac` command the builds a `.javac` file for? 
