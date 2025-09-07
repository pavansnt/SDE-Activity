import java.util.Scanner;
import java.util.ArrayList;

public class ArrayList1{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        //Declaration
        ArrayList<Integer> list = new ArrayList<>();
        int n = in.nextInt();

        //initialisation
        for(int i=0; i<n; i++)
        {
            list.add(in.nextInt());
        }
        in.close();
        System.out.println("Total size of  list :"+list.size());//size() used to get the size of array

        System.out.println(list.contains(4));// it gives true or false if it contains mentioned value then it gives true else it give output as false

        list.add(1,1);// it adds value to existance array at specified index
        System.out.println(list);

        list.remove(0);//it removes the specified value from the exact index of array
        System.out.println(list);

        // for(int i=0; i<n; i++)
        // {
        //     System.out.println(i);
        // }

        

    }


}