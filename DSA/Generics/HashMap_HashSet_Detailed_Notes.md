# 📘 HashMap & HashSet in Java – Complete Notes

---

# 🔹 Part 1: HashMap in Java

## 1. Introduction
- `HashMap` is a data structure in Java used to store data in **key–value pairs**.
- Belongs to the `java.util` package.
- Based on **hashing** for **O(1) average time complexity**.

**Why it came into existence?**
- Searching in arrays/lists is O(n), which is slow for large data.
- Searching in trees is O(log n).
- With hashing, we achieve O(1) average lookup, making it ideal for fast access.

---

## 2. Characteristics
- Stores **key–value pairs**.
- Keys must be unique, values can be duplicate.
- Allows **one null key** and multiple null values.
- Not ordered (use `LinkedHashMap` for insertion order).
- Not thread-safe (use `ConcurrentHashMap` for multi-threading).

---

## 3. Internal Structure
- HashMap = Array of Buckets.
- Each bucket holds a linked list or a Red-Black Tree (after Java 8).

```java
static class Node<K, V> {
    final int hash;
    final K key;
    V value;
    Node<K, V> next;
}
```

---

## 4. Working of HashMap

### a) put(K key, V value)
1. Compute `hashCode()` of the key.
2. Convert to index → `index = hash % capacity`.
3. If bucket empty → add node.
4. If key exists → update value.
5. If collision → add to chain/tree.

### b) get(Object key)
1. Compute hash index.
2. Traverse bucket chain/tree.
3. Match using `equals()`.
4. Return value.

### c) remove(Object key)
1. Find index using hash.
2. Remove node from bucket.

---

## 5. Collision Handling
- Two keys may map to the same index.
- Before Java 8: **LinkedList chaining**.
- After Java 8: If bucket length > 8 → converted to **Red-Black Tree** (O(log n)).

---

## 6. Load Factor & Rehashing
- Default capacity = 16.
- Default load factor = 0.75.
- When 75% filled, HashMap **doubles capacity** (rehash).

---

## 7. Time Complexity
- Best/Average: O(1)
- Worst (many collisions): O(log n)

---

## 8. Example Usage

```java
HashMap<String, Integer> map = new HashMap<>();
map.put("India", 91);
map.put("USA", 1);
map.put("China", 86);

System.out.println(map.get("India")); // 91
map.remove("China");
System.out.println(map); // {India=91, USA=1}
```

---

## 9. Iteration using Map.Entry

```java
for (Map.Entry<String, Integer> entry : map.entrySet()) {
    System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
}
```

---

## 10. Common Problems Using HashMap

### Problem 1: Count frequency of words in a string
```java
String text = "apple banana apple mango banana apple";
HashMap<String, Integer> freq = new HashMap<>();

for (String word : text.split(" ")) {
    freq.put(word, freq.getOrDefault(word, 0) + 1);
}

System.out.println(freq);
// {apple=3, banana=2, mango=1}
```

### Problem 2: Find first non-repeating character
```java
String s = "swiss";
HashMap<Character, Integer> freq = new HashMap<>();

for (char c : s.toCharArray())
    freq.put(c, freq.getOrDefault(c, 0) + 1);

for (char c : s.toCharArray()) {
    if (freq.get(c) == 1) {
        System.out.println("First non-repeating: " + c);
        break;
    }
}
```

---

# 🔹 Part 2: HashSet in Java

## 1. Introduction
- `HashSet` is a part of the `java.util` package.
- Implements the Set interface.
- Stores **unique elements only**.
- Internally uses a **HashMap** (only stores keys).

**Why it came into existence?**
- Needed a collection with **unique elements**.
- ArrayList/LinkedList allow duplicates, but sets in mathematics require uniqueness.
- HashSet solves this with O(1) average lookup.

---

## 2. Characteristics
- No duplicates allowed.
- No order maintained (use `LinkedHashSet` for order).
- Allows one null element.
- Not thread-safe.
- Fast operations: add, remove, contains = O(1).

---

## 3. Internal Working
- `HashSet.add(x)` → internally `hashMap.put(x, PRESENT)`.
- `PRESENT` is a dummy object as value.

---

## 4. Example Usage

```java
HashSet<String> set = new HashSet<>();
set.add("India");
set.add("USA");
set.add("China");
set.add("India"); // duplicate, ignored

System.out.println(set); 
// Output: [China, USA, India] (unordered)
```

---

## 5. Iteration in HashSet

```java
// Using Iterator
Iterator<String> it = set.iterator();
while (it.hasNext()) {
    System.out.println(it.next());
}

// Using for-each
for (String country : set) {
    System.out.println(country);
}
```

---

## 6. Common Problems Using HashSet

### Problem 1: Remove duplicates from an array
```java
int[] arr = {1, 2, 2, 3, 4, 4, 5};
HashSet<Integer> set = new HashSet<>();

for (int num : arr) set.add(num);

System.out.println(set); // [1, 2, 3, 4, 5]
```

### Problem 2: Check if two arrays have common elements
```java
int[] a = {1, 2, 3};
int[] b = {4, 5, 3};
HashSet<Integer> set = new HashSet<>();

for (int num : a) set.add(num);

boolean common = false;
for (int num : b) {
    if (set.contains(num)) {
        common = true;
        break;
    }
}
System.out.println("Common element exists: " + common);
```

---

# 🔹 Summary (HashMap vs HashSet)

| Feature         | HashMap                         | HashSet                     |
|-----------------|---------------------------------|-----------------------------|
| Stores          | Key–Value pairs                 | Only keys (unique elements) |
| Allows null     | 1 null key, many null values    | 1 null element              |
| Order           | Not maintained                  | Not maintained              |
| Duplicates      | Keys unique, values can repeat  | No duplicates allowed       |
| Internally uses | Array + LinkedList/Tree (Node)  | HashMap (keys only)         |
| Time Complexity | O(1) average for put/get/remove | O(1) average for add/remove |

👉 Use **HashMap** when key-value mapping is needed.  
👉 Use **HashSet** when only unique values are required.

---
