package BinarySearch;

public class FloorOfNumber {
     public static int binary_Search(int[] elements, int key)
    {
        int start = 0;
        int end = elements.length-1;
        
        //if target  value is greater than greatest value of array
        if(key > elements[elements.length-1]){
            return -1;
        }
        
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
        return elements[end];
    }

    public static void main(String[] args) {
        int[] arr = { 1,2,3,5,6,9};
        int key = 15;
        if(binary_Search(arr, key)==-1)
        {
            System.out.println("Not found becuase Target value is greater than greatest value of array");
            return;
        }
        System.out.println("Floor number of  " + key + " found is " + (binary_Search(arr, key)));
    }
}
