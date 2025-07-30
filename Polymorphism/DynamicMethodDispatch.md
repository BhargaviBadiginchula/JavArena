# 🔄 Dynamic Method Dispatch in Java (Runtime Polymorphism)

## 📌 What is Dynamic Method Dispatch?
Dynamic Method Dispatch is the mechanism by which a **call to an overridden method is resolved at runtime** rather than compile time. This is the foundation of **runtime polymorphism** in Java.

---

## ✅ Key Concepts:
- Achieved through **method overriding**.
- **Reference type** can be parent class, but **object type** decides which method to execute.
- Only **instance methods** are polymorphic.
- **Static methods and instance variables** are resolved by reference type, not object type.

---

Static methods are not overridden — they are hidden based on reference type.

Instance variables follow reference type rules — not polymorphic.

Overridden methods are dynamically dispatched — true polymorphism.

💡 Real-World Use Case
You often use dynamic dispatch in real-world applications like:

Handling UI components with common base classes.

Processing different data sources with a unified API.

Creating flexible plugin-based systems.

