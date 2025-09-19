package Generics;
// import java.util.Map;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

    public static void main(String[] args) {
        DemoHashSet();
    }

    public static void DemoHashSet() {
        Set<String> fruits = new HashSet<>();

        //add elements
        fruits.add("Apple");
        fruits.add("apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        //print elements
        System.out.println(fruits);

        //print each element of fruits through iteration
        for( String fruit : fruits) {
            System.out.println(fruit);
        }

        //check presence
        if(fruits.contains("Apple"))
            System.out.println("Apple is there in list ");
        else
            System.out.println("Apple is not there in List");

        //remove
        fruits.remove("Banana");
        System.out.println(fruits);

        //clear all elements
        fruits.clear();
        System.out.println("List : "+fruits);
        
    }
}
