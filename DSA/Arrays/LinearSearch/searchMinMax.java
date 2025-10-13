package LinearSearch;

public class searchMinMax {
   public static void main(String[] args) {
    int[] arr = { 8, 17, 6, -3, -2, 9, 26, -9, 89};
    findMinMax(arr);
   }

   public static void findMinMax(int[] arr) {
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;

    for (int i = 0; i<arr.length; i++) {
        if(arr[i] > max)
            max = arr[i];
        if(arr[i] < min)
            min = arr[i];
    }
    System.out.println("Maximum Value : " + max);
    System.out.println("Minimum Value : " + min);

   }
}
