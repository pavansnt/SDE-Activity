import java.util.Arrays;

public class Reverse_Array{

    /**
     * Reverses the given array in-place without creating a new array.
     */
    public static void reverseInPlace(int[] array) {
        int first = 0;
        int last = array.length - 1;

        while (first < last) {
            // This is the swap logic
            int temp = array[last];
            array[last] = array[first];
            array[first] = temp;

            // Move the pointers towards the middle
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int[] originalArray = {1, 4, 6, 8, 3};
        
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        
        // Call the in-place method. Note that it doesn't return anything.
        reverseInPlace(originalArray);
        
        // The original array itself has now been changed.
        System.out.println("Reversed Array: " + Arrays.toString(originalArray));
    }
}