// 📘 Java Abstraction – Full Conceptual Guide



/\*

============================================================

🔹 1. What is Abstraction in Java?

============================================================

Abstraction is one of the core concepts of Object-Oriented Programming (OOP). It refers to hiding internal details and showing only essential features.

In Java, abstraction is implemented using:

&nbsp; - Abstract classes

&nbsp; - Interfaces



============================================================

🔹 2. Abstract Classes

============================================================

An abstract class:

\- Is declared with the `abstract` keyword.

\- Cannot be instantiated directly.

\- Can have abstract methods (without body) and concrete methods (with body).

\- Can include constructors, instance and static variables, and static methods.



✅ Rules:

\- Must be extended by a subclass.

\- Subclass must implement all abstract methods unless it's also declared abstract.

\- Can contain access modifiers (private, protected, public).



✅ Use Cases:

\- When you want to share common code across related classes.

\- When you want partial abstraction (both abstract and concrete methods).



============================================================

🔹 3. Interface in Java

============================================================

An interface:

\- Is declared using the `interface` keyword.

\- Cannot contain constructors or instance variables.

\- Can be implemented by classes using `implements` keyword.

\- Supports multiple inheritance.



✅ Methods in Interfaces:

\- \*\*Abstract methods\*\*: public and abstract by default.

\- \*\*Default methods\*\*: non-static, have a body; used for backward compatibility.

\- \*\*Static methods\*\*: belong to interface, called using interface name.

\- \*\*Private methods\*\*: help to share code among default/static methods inside interface.



✅ Variables:

\- All variables in an interface are implicitly `public static final`.



✅ Rules:

\- A class must implement all abstract methods of an interface.

\- A class can implement multiple interfaces.



============================================================

🔹 4. Differences: Abstract Class vs Interface

============================================================

| Feature                 | Abstract Class                      | Interface                            |

|-------------------------|-------------------------------------|---------------------------------------|

| Inheritance            | Single (extends)                   | Multiple (implements)                |

| Constructors           | Yes                                | No                                    |

| Method Types           | Abstract, Concrete, Static         | Abstract, Default, Static, Private   |

| Variables              | Instance \& Static                  | `public static final` only           |

| Access Modifiers       | Allowed (public, private, etc.)    | Only `public` allowed                |

| Partial Abstraction    | Yes                                | No (fully abstract pre-Java 8)       |



============================================================

🔹 5. Implements Keyword

============================================================

\- Used by classes to inherit from interfaces.

\- Syntax: `class MyClass implements InterfaceName {}`

\- A class can implement multiple interfaces separated by commas.

\- All unimplemented abstract methods must be overridden in the class.



============================================================

🔹 6. Summary

============================================================

\- Use \*\*abstract class\*\* when you want to provide base functionality.

\- Use \*\*interface\*\* when you want to define a contract for classes to follow.

\- Java allows default, static, and private methods in interfaces (since Java 8+).

\- Abstract classes can hold both logic and declarations.

\- Interfaces enable multiple inheritance.

\*/



