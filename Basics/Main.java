import java.util.Scanner;

public class Main
{
    public static boolean isPalindrome (String input){
        boolean res=true;
        int left=0; int right=input.length()-1;
        while(left<right){
            if(input.charAt(left)!=input.charAt(right)){
                res=false;
                break;
            }
            left++;
            right--;
        }
        return res;
    }
    
	public static void main(String[] args) {
       

    Scanner reader=new Scanner(System.in);
        String string;
        string=reader.nextLine();
        reader.close(); 
        
        if(isPalindrome(string)){
            System.out.println("The string is a palindrome");
        }
        else{
            System.out.println("The string is not a palindrome");
        }

	}
}