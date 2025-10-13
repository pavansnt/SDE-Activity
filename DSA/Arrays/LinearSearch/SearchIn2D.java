package LinearSearch;

import java.util.Arrays;

public class SearchIn2D {
    
    public static void main(String[] args) {
        int[][] arr = { {1,4,5}, {42,13,50}, {3,8,89,} }; 
        int[] ans = search(arr, 56);
        System.out.println(Arrays.toString(ans));

        //Find Maximum and Minimum value in 2D
        maxMin(arr);
    }

    public static int[] search(int arr[][], int target) {
        for (int row = 0; row < arr.length; row++) {
            for( int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target)
                    return new int[] {row,col};
            }
        }
        return new int[] {-1,-1};
    }

    public static void maxMin(int arr[][]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int row = 0; row < arr.length; row++) {
            for( int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] > max){
                    max = arr[row][col];
                }
                if(arr[row][col] < min)
                    min = arr[row][col];
            }
        }
        System.out.println("Maximum Value in 2D array is : " + max);
        System.out.println("Minimum Value in 2D array is : " + min);

        
    }

    
}
