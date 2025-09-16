package Arrays.Generics;
import java.util.ArrayList;
import java.util.LinkedList;

public class Arraylist {

    public static void main(String[] args){
        WithoutGenerics();
        WithGenerics();

        System.out.println(getNames());
        ArrayList<String> members = getNames();
        for ( String member : members){
            System.out.println(String.valueOf(member));
        }

        demoListMethods(members);
    }

    public static void WithoutGenerics() {
        //without using generics
        System.out.println("-----Without using Generics------");
        ArrayList numbers = new ArrayList();
        numbers.add(50);
        numbers.add(0,"Pavan");

        System.out.println(numbers);
        System.out.println("Size of list : " + numbers.size());
        System.out.println(numbers.get(0));

        //int num = numbers.get(0);  it gives type mismatch error since numbers are set in object
        int num = (int) numbers.get(1); //this resolves the above problem by typecasting
        System.out.println(num);

    }

    public static void WithGenerics() {
        //using generics
        System.out.println("-----Using Generics------");
        ArrayList<Integer> Gnumbers = new ArrayList<>();
        Gnumbers.add(78);
        Gnumbers.add(0,45);
        int numG = Gnumbers.get(0);
        System.out.println(numG);
        
        ArrayList<String> list = new ArrayList<>();
        list.add("Ambadevi");
        list.add("Mini");
        System.out.println(list);  
    }

    public static ArrayList<String> getNames() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Nagaraj");
        names.add("Bhavani");
        names.add("Ahana");
        names.add("Vihana");
        names.add("Bhagya");
        return names;
    }

    public static void demoListMethods(ArrayList<String> names) {
        names.add("Ninganna");
        names.add("Last Name");
        if(names.contains("Ninganna")) {
            System.out.println("List contains Ninganna");
        }
        else{
            System.out.println("List does not contain Ninganna");
        }

        ArrayList<String> findNames = new ArrayList<>();
        findNames.add("Bhavani");
        findNames.add("Ahana");

        if(names.containsAll(findNames)){
            System.out.println("Bhavani and Ahana are present in list");
        }
        System.out.println(names);
        
    }
    

}
