import java.util.Scanner;

public class Palindrome
{
    static boolean isPalindrome(String input)
    {
       boolean result=true;
       char[] inputArray=input.toCharArray();
       int left=0;
       int right=input.length()-1;

       while(left<right){
        if(inputArray[left]!=inputArray[right]){
            result=false;
            break;
        }
        left++;
        right--;
        
       }
    return result;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Input reading part
        String input = scanner.nextLine();
        scanner.close();

        // Call the isPalindrome method and print the result
        System.out.print(isPalindrome(input));
    }
}
