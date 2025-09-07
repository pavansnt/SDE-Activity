public class Selection_sort {

    public static void sort(int[] arr) {
        int n = arr.length;

        // One by one, move the boundary of the sorted subarray
        // Find the minimum element in the unsorted array
        // Swap the found minimum element with the first element
        // of the unsorted section.
          //64, 25, 12, 22, 11  
        for(int i = 0; i <  n-1; i++)
        {
            int minIndex = i;

            for(int j = i+1; j < n; j++)
            {
                if(arr[j] < arr[minIndex])
                {
                    minIndex = j;
                }
            }
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
        }
    }

     public static void printArr(int[] arr)
    {
        for(int i = 0; i<arr.length; i++)
        {
            System.out.print(" " + arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] data = { 64, 25, 12, 22, 11 };
        sort(data);
        printArr(data);
    }

}
