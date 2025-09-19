# 📘 HashMap in Java – With Map.Entry and Iteration Notes

---

## 🔹 1. Introduction  
- A **HashMap** stores elements in **key–value pairs**.  
- Belongs to `java.util` package.  
- Based on **hashing** for **O(1) average time complexity**.  

---

## 🔹 2. Why Use Map.Entry?  
- Directly iterating a HashMap using `for-each` loop only gives keys or values.  
- To access **both key and value together**, we use `Map.Entry<K,V>`.  

`Map.Entry` represents one **key–value pair** inside a Map.  

---

## 🔹 3. Iteration Using Map.Entry  

### ✅ Example Code

```java
import java.util.*;

public class HashMapIterationDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 91);
        map.put("USA", 1);
        map.put("China", 86);

        // Iterating using Map.Entry
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
```

### ✅ Output
```
Key: USA, Value: 1
Key: China, Value: 86
Key: India, Value: 91
```

*(Order may vary because HashMap is unordered)*  

---

## 🔹 4. Methods in Map.Entry  
- `getKey()` → returns key.  
- `getValue()` → returns value.  
- `setValue(V value)` → updates value.  

Example:
```java
for (Map.Entry<String, Integer> entry : map.entrySet()) {
    if (entry.getKey().equals("India")) {
        entry.setValue(100); // update value
    }
}
```

---

## 🔹 5. Other Iteration Techniques

1. **Iterating Keys only**  
```java
for (String key : map.keySet()) {
    System.out.println("Key: " + key);
}
```

2. **Iterating Values only**  
```java
for (Integer value : map.values()) {
    System.out.println("Value: " + value);
}
```

3. **Using forEach with Lambda (Java 8+)**  
```java
map.forEach((key, value) -> {
    System.out.println("Key: " + key + ", Value: " + value);
});
```

---

## 🔹 6. Summary (Quick Notes)  
- `Map.Entry` is used for iterating over **key–value pairs** in HashMap.  
- `entrySet()` gives a Set of all entries.  
- Common methods: `getKey()`, `getValue()`, `setValue()`.  
- Iteration can also be done with `keySet()`, `values()`, or `forEach()`.  

👉 Best way when both key & value needed = **Map.Entry with entrySet()**.  
