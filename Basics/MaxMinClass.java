import java.util.Scanner;

public class MaxMinClass
{
    //Implement printMaxMin()
static void printMaxMin(int[] numb)
    {  int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<numb.length;i++){
            if(numb[i]>max){
                max=numb[i];
            }
            if(numb[i]<min){
                min=numb[i];
            }
        }
        System.out.print(max+" and "+min);
    }

public static void main(String[] args) 
    {
            Scanner scanner = new Scanner(System.in);
            // Read the size of the array
            int size = scanner.nextInt();

            // Read the input array elements
            int[] inputArray = new int[size];
            for (int index = 0; index < size; index++) 
            {

                inputArray[index] = scanner.nextInt();
            }
            scanner.close();
            // Call the printMaxMin method
            printMaxMin(inputArray);       
    }
}