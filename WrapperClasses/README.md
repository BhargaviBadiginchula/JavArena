# 🧊 Wrapper Classes in Java
**Day 13 of #30DaysOfJava**

---

## 📌 Introduction

In Java, data types are broadly categorized into:
- **Primitive types** – like `int`, `char`, `boolean`, etc.
- **Reference types** – like objects and arrays.

Java being an object-oriented language, sometimes we need to treat primitive types as **objects** — especially when working with **collections, generics**, or any APIs that require objects. That’s where **Wrapper Classes** come into play!

---

## 🎯 What are Wrapper Classes?

Wrapper classes are **object representations** of Java primitive data types.  
They allow primitive values to be wrapped as objects.

| Primitive | Wrapper Class |
|-----------|----------------|
| `byte`    | `Byte`         |
| `short`   | `Short`        |
| `int`     | `Integer`      |
| `long`    | `Long`         |
| `float`   | `Float`        |
| `double`  | `Double`       |
| `char`    | `Character`    |
| `boolean` | `Boolean`      |

---

## 💡 Why Use Wrapper Classes?

✔ Needed for **collections** like `ArrayList`, `HashMap`, etc.  
✔ Enable use of **null values** for "no data" scenarios  
✔ Provide **utility methods** (e.g., `parseInt()`, `valueOf()`)  
✔ Enable **autoboxing/unboxing** – automatic conversion between primitive and wrapper  
✔ Useful in **generic programming** (as generics don't support primitives)

---

## 🔃 Auto-boxing & Unboxing

### ✅ Auto-boxing
Java automatically converts a primitive type into its corresponding wrapper class.

```java
int x = 10;
Integer y = x;  // Auto-boxing: primitive to object
