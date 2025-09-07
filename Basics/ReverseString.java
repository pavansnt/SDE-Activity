import java.util.Scanner;

// NOTE : Test cases are already added to this program. Tests cases have predefined input data and also expected result data. 
// You are not required to enter any input data when you run the program. 
// When you run the program, all test cases will run and Pass if your program is correct. Please fix your program if any of the test case fails.

public class ReverseString
{
    
    static String reveseString(String input) 
    {   if(input==null||input.length()==0){
        System.out.println("Enter a valid Sttring");
    }   //char[] inputArray=input.toCharArray();
        StringBuilder sb= new StringBuilder(input);
        sb.reverse();
        return sb.toString();
        /*int left=0;
        int right=input.length()-1;
        while(left<right){
                char temp=inputArray[left];
                inputArray[left]=inputArray[right];
                inputArray[right]=temp;

                left++;
                right--;
        }
        return new String(inputArray);*/
        //Write your code here
    }
    
    public static void main(String[] args) 
    {
        // Input reading part
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine().trim(); // Read input string
        scanner.close();

        // Call the reveseString function
        String result = reveseString(string);

        // Print the reversed string
        System.out.print(result);
    }
}
