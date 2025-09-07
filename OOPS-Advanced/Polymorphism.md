The remote control type = **parent class (LibraryItem)**

The actual TV connected = **child object (Book, Ebook, Magazine)**

When you press “Power On” (method call), the right TV turns on depending on which one is connected.

So → **one remote (parent reference), many devices (child objects).**

---

### 1. What is **Polymorphism**?

👉 It simply means **“same name, different forms/behaviour”**.
Java gives us two ways to achieve it:

* **Method Overloading** → decided at **compile time**.
* **Method Overriding** → decided at **runtime**.

---

### 2. What is **Overloading**? (Compile-time polymorphism)

When you **write multiple methods with the same name but different parameters**, Java decides which one to run **while compiling**.

Example:

```java
class Calculator {
    int add(int a, int b) { return a+b; }
    double add(double a, double b) { return a+b; }
}
```

👉 Here, `add(2,3)` calls the **int version** and `add(2.5,3.5)` calls the **double version**.
Java already knows at **compile time** which one to use.

---

### 3. What is **Overriding**? (Runtime polymorphism)

When a **child class writes the same method as parent class** (same name + same parameters), then the **child’s method replaces the parent’s method at runtime**.

Example from your code:

```java
class LibraryItem {
    public void displayInfo() {
        System.out.println("Library Item info");
    }
}

class Ebook extends LibraryItem {
    @Override
    public void displayInfo() {
        System.out.println("Ebook Info");
    }
}
```

Now:

```java
LibraryItem li = new Ebook("E1", "DSA.pdf", "Abhishek", 200, "pdf");
li.displayInfo();  
```

👉 Even though the variable is of type `LibraryItem`,
the **object** is `Ebook`.
At **runtime**, Java runs the child version → prints `"Ebook Info"`.

This is **runtime polymorphism** (achieved through overriding).

---

### 4. Relation between Polymorphism and Overloading

* **Polymorphism** = big concept ("same name, different forms").
* **Overloading** = one type of polymorphism (compile-time).
* **Overriding** = another type of polymorphism (runtime).

---

### 🔎 In your code:

* If you had two methods in `Book` like:

  ```java
  void checkOut() {}
  void checkOut(String userName) {}
  ```

  👉 This would be **Overloading (compile-time polymorphism)**.

* But in `Ebook`, you wrote:

  ```java
  @Override
  public void displayInfo() { ... }
  ```

  👉 This is **Overriding (runtime polymorphism)**.

---

✅ So in short:

* **Overloading** = many methods, same name, different inputs. (decided before running → compile-time)
* **Overriding** = child replaces parent method. (decided while running → runtime)

---

Would you like me to **rewrite your LibraryItem–Book–Ebook code** in a way that clearly shows **both overloading and overriding together** so you see the difference in one place?
