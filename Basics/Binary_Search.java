import java.util.Arrays;

public class Binary_Search {

    public static int binarySearch(int[] num, int key) {
        int leftIndex = 0;
        int rightIndex = num.length - 1;

        while (leftIndex <= rightIndex) {
            int midIndex = leftIndex + (rightIndex - leftIndex) / 2;

            // Check if key is present at mid
            if (key == num[midIndex]) {
                // Change 1: Instead of returning true, return the index.
                return midIndex;
            }

            // If key is smaller, ignore the right half
            if (key < num[midIndex]) {
                rightIndex = midIndex - 1;
            }
            // If key is greater, ignore the left half
            else {
                leftIndex = midIndex + 1;
            }
        }

        // Change 2: If the loop finishes, the element was not present. Return -1.
        return -1;
    }

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7};
        int keyToSearch = 6;
        
        System.out.println("Searching in array: " + Arrays.toString(num));
        System.out.println("Key to search for: " + keyToSearch);

        // Change 3: Call the new method and store the returned index.
        int resultIndex = binarySearch(num, keyToSearch);

        // Change 4: Check the result to see if the element was found.
        if (resultIndex != -1) {
            System.out.println("Element found at index: " + resultIndex);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}