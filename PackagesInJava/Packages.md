# Java Packages: A Practical Introduction

This project is part of the #30DaysOfJava challenge, focusing on Day 14: Introduction to Packages. It demonstrates how to use built-in packages in Java to perform common tasks.

## What are Packages?

In Java, a **package** is a mechanism for organizing Java classes into namespaces or groups, similar to modules in other languages. Think of them as folders on your computer that store related files. Packages are essential for managing the complexity of large applications.

The primary purposes of packages are:
* **Organization:** To group related classes, interfaces, and enums.
* **Naming Conflict Prevention:** To avoid situations where two different developers create classes with the same name. For example, you can use both `java.util.List` and a custom `com.myproject.List` in the same project without conflict.
* **Access Control:** To control the visibility of classes and their members.

---

## Types of Packages

There are two main types of packages in Java.

### 1. Built-in Packages
These packages are part of the Java API (Application Programming Interface) and come with the Java Development Kit (JDK). They provide a rich library of pre-written classes to perform common tasks.

Examples include:
* `java.lang`: Contains fundamental classes like `String`, `System`, `Object`, and `Math`. This package is automatically imported into every Java program.
* `java.util`: Provides a collection framework, utility classes like `Scanner`, `Random`, and `Arrays`.
* `java.io`: Includes classes for input and output operations.
* `java.time`: Offers a modern and comprehensive API for handling dates and times.
* `java.net`: Provides classes for networking applications.

### 2. User-Defined Packages
These are packages created by developers to organize their own project code. You can create a package using the `package` keyword at the beginning of your source file.
`package com.mycompany.myapp;`

---

## The `import` Keyword

To use a class from a specific package, you need to import it using the `import` keyword. This tells the compiler where to find the class.

You can import:
1.  **A specific class:** `import java.util.Scanner;`
2.  **All classes in a package:** `import java.util.*;` (The asterisk `*` is a wildcard).

---

## Code Explanation: `JavaBuiltInPackagesDemo.java`

This program demonstrates the use of classes from three different built-in packages.

* **`import` Statements:**
    * `java.util.*`: Imports all classes from the `util` package, including `Scanner` and `Arrays`.
    * `java.time.*`: Imports all classes from the `time` package, including `LocalDateTime`, `LocalDate`, and `LocalTime`.

* **`java.util.Scanner`:** The `Scanner` class is used to get user input from the console.
    ```java
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your name");
    String name = sc.nextLine();
    ```

* **`java.util.Arrays`:** The `Arrays` class provides static methods for manipulating arrays, such as `sort()` and `toString()`.
    ```java
    int arr[] = {343, 65, 78, 345, 987};
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
    ```

* **`java.time.*`:** The `java.time` package provides modern classes for working with dates and times.
    * `LocalDateTime`: Represents both date and time.
    * `LocalDate`: Represents a date without time.
    * `LocalTime`: Represents a time without a date.

* **`java.lang.Math`:** The `Math` class contains methods for performing basic numeric operations. Since `java.lang` is imported by default, you don't need an explicit `import` statement for it.
    ```java
    double ex = Math.pow(4, 3); // Calculates 4 to the power of 3
    double randomVal = Math.random() * 50; // Generates a random double between 0.0 and 50.0
    ```
