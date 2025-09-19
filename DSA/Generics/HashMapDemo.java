package Generics;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    
    public static void main(String[] args) {
        //demoHashMap();
        wordsCount();
    }

    public static void demoHashMap(){
        Map<Integer,String> students = new HashMap<>();
        //Map<String, String> books = new HashMap<>();

        students.put(1,"Pavan");
        students.put(2,"Anil");
        students.put(1,"Shivu");
        students.put(3,"Thilak");
        students.put(4,"Karthik");
        students.put(5,"Mahesh");
        students.put(6,"Vihana");
        students.put(7,"Ahana");
        System.out.println(students);

        //remove
        String removedValue = students.remove(4);
        System.out.println("Removed Value = " + removedValue);
        
        for (String  student : students.values()) {
            System.out.println(student);
        }

        Integer searchId = 9;
        if(students.containsKey(searchId)){
            System.out.println("Students list has this student : "+searchId);
        }
        else
        {
            System.out.println("Student not found in the list!!");
        }

        for (Map.Entry<Integer, String> student : students.entrySet()){
            System.out.println( student.getKey() + " --> " + student.getValue());
        }
    }

    public static void wordsCount() {
        String[] words = {"Pavan", "Namskara", "Bottle", "Laptop", "NoteBook", "Editor", "Namskara" ,"Namskara"};

        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            int value = wordCountMap.getOrDefault(word,0);
            value++;
            wordCountMap.put(word, value);
        }

        for (Map.Entry<String,Integer> wordCount : wordCountMap.entrySet()) {
            System.out.println(" \"" + wordCount.getKey() + "\" count --> " + wordCount.getValue());
        }
    }
}
