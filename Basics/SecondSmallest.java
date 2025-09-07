
public class SecondSmallest {
    public static int getSecondSmallest(int[] numbers){
        if(numbers==null || numbers.length<2){
            System.out.println("Invalid Input!!!");
            return Integer.MIN_VALUE;
        }

        int Smallest=Integer.MAX_VALUE;
        int SecondSmallest = Integer.MAX_VALUE;


        for(int number:numbers){
            if(number<Smallest){
                SecondSmallest=Smallest;
                Smallest=number;
        }
            else if (number<SecondSmallest && number!=Smallest){
                SecondSmallest=number;
            }
        }

        if(SecondSmallest==Integer.MAX_VALUE){
            System.out.println("No distinct second largest found");
        }
        return SecondSmallest;
    }
    

    public static void main(String[] args) {
        int[] arr1 = {12, 35, 1, 10, 34, 1}; // Standard case
        int[] arr2 = {10, 5, 10, 8, 12};       // Contains duplicates and is unsorted
        int[] arr3 = {1, 2, 3, 4, 5};         // Sorted array
        int[] arr4 = {5, 5, 5, 5, 5};         // All elements are the same
        int[] arr5 = {10, 20};                // Array with only two elements
        int[] arr6 = {7};                     // Single-element array (edge case)
        int[] arr7 = {};                      // Empty array (edge case)
        int[] arr8 = null;                    // Null array (edge case)

        System.out.println("Second Smallest in arr1: " + getSecondSmallest(arr1)); // Expected: 34
        System.out.println("Second Smallest in arr2: " + getSecondSmallest(arr2)); // Expected: 10
        System.out.println("Second Smallest in arr3: " + getSecondSmallest(arr3)); // Expected: 4
        System.out.println("Second Smallest in arr4: " + getSecondSmallest(arr4)); // Expected: Integer.MIN_VALUE
        System.out.println("Second Smallest in arr5: " + getSecondSmallest(arr5)); // Expected: 10
        System.out.println("Second Smallest in arr6: " + getSecondSmallest(arr6)); // Expected: Integer.MIN_VALUE
        System.out.println("Second Smallest in arr7: " + getSecondSmallest(arr7)); // Expected: Integer.MIN_VALUE
        System.out.println("Second Smallest in arr8: " + getSecondSmallest(arr8)); // Expected: Integer.MIN_VALUE
    }
}
