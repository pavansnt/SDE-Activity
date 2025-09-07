public class SecondLargest {
    public static int getSecondLargest(int[] numbers){
        if(numbers==null || numbers.length<2){
            System.out.println("Invalid Input!!!");
            return Integer.MIN_VALUE;
        }

        int Largest=Integer.MIN_VALUE;
        int SecondLargest = Integer.MIN_VALUE;


        for(int number:numbers){
            if(number>Largest){
                SecondLargest=Largest;
                Largest=number;
        }
            else if (number>SecondLargest && number!=Largest){
                SecondLargest=number;
            }
        }

        if(SecondLargest==Integer.MIN_VALUE){
            System.out.println("No distinct second largest found");
        }
        return SecondLargest;
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

        System.out.println("Second largest in arr1: " + getSecondLargest(arr1)); // Expected: 34
        System.out.println("Second largest in arr2: " + getSecondLargest(arr2)); // Expected: 10
        System.out.println("Second largest in arr3: " + getSecondLargest(arr3)); // Expected: 4
        System.out.println("Second largest in arr4: " + getSecondLargest(arr4)); // Expected: Integer.MIN_VALUE
        System.out.println("Second largest in arr5: " + getSecondLargest(arr5)); // Expected: 10
        System.out.println("Second largest in arr6: " + getSecondLargest(arr6)); // Expected: Integer.MIN_VALUE
        System.out.println("Second largest in arr7: " + getSecondLargest(arr7)); // Expected: Integer.MIN_VALUE
        System.out.println("Second largest in arr8: " + getSecondLargest(arr8)); // Expected: Integer.MIN_VALUE
    }
}
