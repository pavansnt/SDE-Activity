public class Laregst {
    public static int findLargest(int[] numbers)
    {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i< numbers.length; i++)
        {
            if(numbers[i] > max)
            {
                max = numbers[i];
            }
            if(numbers[i] < min)
            {
                min = numbers[i];
            }

        }
        System.out.println("Smallest value is : " + min);


        return max;
    }

    public static void main(String[] args)
    {
        int[] numbers = {1,4,6,7,11,67};
        System.out.println("Largest value is : " + findLargest(numbers));
       
    
        
    }
}
