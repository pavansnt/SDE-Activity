public class MaxSubarraySum{
    public static void kadanes(int[] array)
    {
        int curr_sum = 0;
        int max_sum = Integer.MIN_VALUE;

        for( int i=0; i<array.length; i++)
        {   curr_sum += array[i];
            max_sum = Math.max(max_sum, curr_sum);
            if (curr_sum < 0)
                curr_sum = 0;  
        }

        System.out.println(max_sum);
    }
     public static void main(String[] args) {
        int[] numbers = {1,-2,3,4,5,-5,7};
        kadanes(numbers);
    }
}