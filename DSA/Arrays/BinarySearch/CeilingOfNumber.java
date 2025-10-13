package BinarySearch;

public class CeilingOfNumber {
    public static int binary_Search(int[] elements, int key)
    {
        int start = 0;
        int end = elements.length-1;
        
        //if target value is smaller than smallest value of array
        if (key < elements[0]) return -1;
        while(start <= end)
        {
            int midIndex = (start + (end - start)/2);
            if(elements[midIndex]==key)
            {
                return midIndex;
            }
            else if(elements[midIndex] < key)
            {
                start = midIndex + 1;  
            }
            else if(elements[midIndex] > key)
            {   
                end = midIndex -1;
            }
           
        }
        return elements[start];
    }

    public static void main(String[] args) {
        int[] arr = { 2,3,5,6,9};
        int key = 1;
        if(binary_Search(arr, key)==-1)
        {
             System.out.println("Not found becuase target value is smaller than smallest value of array");
            return ;
            }
        System.out.println("Ceiling number of  " + key + " found is " + (binary_Search(arr, key)));
    }
}
