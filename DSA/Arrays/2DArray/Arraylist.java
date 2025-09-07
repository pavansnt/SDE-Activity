import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<>();

        list.add("Pavan");
        list.add("Jeevan");
        list.add("Abhishek");
        list.add("Basvaraj");
        list.add("Thilak");

        System.out.println("Initial list: " + list);
        System.out.println("Size of list :"+ list.size());

        list.set(1,"Kiran");
        //System.out.println(list.contains("Kiran")); OutPut : true
        list.remove(2); // "Abhishek" is removed from list
        Scanner in = new Scanner(System.in);
        
        for(int i = 5; i<11; i++)
        {
            list.add(in.nextLine());
        }
        in.close();
        System.out.println("-----------------");
        for(String name : list){
            System.out.print(name+"\t");
        }
        System.out.println("\nFinal Size of list :"+ list.size());

    }
}
