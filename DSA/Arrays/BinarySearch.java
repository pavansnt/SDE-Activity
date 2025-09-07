public class BinarySearch {
    public static int binary_Search(int[] elements, int key)
    {
        int leftIndex = 0;
        int rightIndex = elements.length-1;
        
        while(leftIndex <= rightIndex)
        {
            int midIndex = (leftIndex + (rightIndex - leftIndex))/2;
            if(elements[midIndex]==key)
            {
                return midIndex;
            }
            else if(elements[midIndex] < key)
            {
                leftIndex = midIndex + 1;
            }
            else if(elements[midIndex] > key)
            {
                rightIndex = midIndex -1;
            }
           
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5,6,7,8,9};
        int key = 6;
        if(binary_Search(arr, key)==-1)
        {
            System.out.println("Not found enter an appropriate value");
        }
        System.out.println("Element " + key + "found at " + (binary_Search(arr, key)));
    }
}
