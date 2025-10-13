package BinarySearch;

// MidIndex  = left + (right - left) / 2 ?? why
// Here the calculation is done differently:
// (right - left) is computed first.
// This is the distance between the two indexes, not their absolute values.
// Even if left and right are huge, the difference will always be within the array size.
// For example: right = 2,000,000,010, left = 2,000,000,000 → right - left = 10.
// This is small and safe.
// (right - left) / 2 is then added to left.
// Now you’re only adding a small number (half the distance) to left.
// 2,000,000,000 + 5 = 2,000,000,005 → perfectly safe, no overflow.


//order - agnostic binary search
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {9, 7, 6,4,3,2,1};
        int key = 7;
        int n = arr.length;
        if (arr[0] < arr[n-1]){
            if (searchAssending(arr, key) == -1) {
            System.out.println("Not found!!");
        }
        System.out.println("Key " + key + " found at index : " + searchAssending(arr, key));
        return;
        }

        if (searchDessending(arr, key) == -1) {
            System.out.println("Not found!!");
        }
        System.out.println("Key " + key + " found at index : " + searchDessending(arr, key));
    }

    public static int searchAssending(int[] arr,int key){
        int leftIndex = 0;
        int rightIndex = arr.length -1;
        while(leftIndex <= rightIndex){
           int midIndex = leftIndex + (rightIndex - leftIndex)/2;
           if (arr[midIndex] == key){
            return midIndex;
           }
           else if (arr[midIndex] > key )
               rightIndex = midIndex - 1;
           else if (arr[midIndex] < key)
                leftIndex = midIndex + 1;
        }
        return -1;
    }

    public static int searchDessending(int[] arr,int key){
        int leftIndex = 0;
        int rightIndex = arr.length -1;
        while(leftIndex <= rightIndex){
           int midIndex = leftIndex + (rightIndex - leftIndex)/2;
           if (arr[midIndex] == key){
            return midIndex;
           }
           else if (arr[midIndex] > key )
               leftIndex = midIndex + 1;
           else if (arr[midIndex] < key)
                rightIndex = midIndex - 1;
        }
        return -1;
    }
}
