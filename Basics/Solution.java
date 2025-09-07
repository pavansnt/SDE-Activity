import java.util.*;

class Solution {
    /**
     * Finds the length of the longest sequence of consecutive 1s in an array.
     */
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;     // Stores the longest streak of 1s found so far.
        int currentCount = 0; // Stores the current streak of 1s.

        // Loop through each number in the array.
        // Use '<' instead of '<=' to avoid going out of bounds.
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                // If we see a 1, increment the current streak count.
                currentCount++;
            } else {
                // If we see a 0, the streak is broken.
                // Check if the just-ended streak is the new maximum.
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                }
                // Reset the current streak counter to 0.
                currentCount = 0;
            }
        }
        
        // Final check: This is important for cases where the array ends with 1s (e.g., [1,0,1,1]).
        // The loop would finish with currentCount=2, but it wouldn't have been compared to maxCount yet.
        if (currentCount > maxCount) {
            maxCount = currentCount;
        }
        
        return maxCount;
    }

    /**
     * The main method to test our code.
     */
    public static void main(String[] args) {
        // 1. You must create an object of the Solution class to call its methods.
        Solution sol = new Solution();

        // 2. We need an array to test, not a single number.
        int[] testArray = {1, 1, 0, 1, 1, 1, 0, 1, 1};
        
        System.out.println("Testing with array: " + Arrays.toString(testArray));

        // 3. Call the method on the object and pass the array.
        int result = sol.findMaxConsecutiveOnes(testArray);

        System.out.println("The maximum number of consecutive ones is: " + result); // Should be 3
    }
}