# Day 12 – Final & Enum in Java 🚀

Welcome to Day 12 of my #30DaysOfJava journey!  
Today, I explored two key concepts in Java that improve **code safety** and **readability**:

---

## 🔐 The `final` Keyword

The `final` keyword in Java is used to restrict:

### ✅ Final Variable
- A `final` variable’s value **cannot be changed** once assigned.
- Often used to declare constants.

### ✅ Final Method
- Prevents **method overriding** in subclasses.
- Useful for creating fixed behavior in parent classes.

### ✅ Final Class
- A class marked as `final` **cannot be inherited**.
- Often used for security and to avoid modification of core logic.

> 🧠 **Note:** Final methods **can be overloaded** but **not overridden**.  
> ❌ Abstract and final can’t be used together — they contradict each other.

---

## 📦 The `enum` Type

Enums in Java define a fixed set of constants. They're type-safe and often cleaner than using static final variables.

### 🔍 Key Points:
- Enums are **implicitly final and static**.
- You **can’t instantiate** enums using `new`.
- Useful when working with **predefined values** (like days, directions, or states).

---

## 📂 Files Included

- `FinalClasses.java`: Demonstrates final class, variable, and method behavior.
- `EnumExample.java`: Shows how to define and use enums in Java.

---

## 👩‍💻 Output Snapshot

```bash
hello  
2424  
