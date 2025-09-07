import java.util.Arrays;

public class MaxMinArray {
    public static void main(String[] args) {
        int[] arr = { 1,3,5,7,3,7,8,9};
        System.out.println(Arrays.toString(arr));
        MaxMin(arr);
    }

    public static void MaxMin(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int n= arr.length;

        for(int i=0; i<n; i++)
        {
            if(arr[i] > max)
                max = arr[i];
            if(arr[i] < min)
                min = arr[i];
        }

        System.out.println("Minimum Value : "+min);
        System.out.println("Max Value : " + max);
    }
}
