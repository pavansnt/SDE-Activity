// When to Use Which?
// Use a 2D Array when:
// 	• You know the exact dimensions (rows and columns) of your data beforehand.
// 	• Performance is your absolute top priority.
// 	• You are working with a static grid, like a game board, an image, or for mathematical matrix operations.

// Use a 2D ArrayList when:
// 	• You don't know the size of your data in advance.
// 	• The number of rows or the number of items in each row needs to change frequently.
// 	• You need more flexibility.
// 	• Example: Grouping students by their grade. You don't know how many grades there will be or how many students are in each grade.


import java.util.ArrayList;
import java.util.Scanner;
public class MultiAL {
    public static void main(String[] args) {
        
        //declaration
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        //initialisation of inner lists(rows)
        for(int i=0; i<n; i++)
        {
            list.add(new ArrayList<>());
        }

        System.out.println("Enter No of Cols : ");
        int col = in.nextInt();

        //take input for array
        for(int i=0; i<n; i++)
        { 
            for(int j=0; j<col; j++){
                list.get(i).add(in.nextInt());
            }
        }
        in.close();

        System.out.println(list);


    }
}

