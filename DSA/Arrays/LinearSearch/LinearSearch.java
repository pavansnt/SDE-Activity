package LinearSearch;
public class LinearSearch {
    public static int search(String[] arr, String target)
    {   
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == target)
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        String arr[] = { "Bengaluru", "Yadagiri", "Hubballi", "Kalaburagi" };
        String target = "Yadagiri";
        int index = search(arr,target);
        if(index == -1)
        {
            System.out.println("Element is not present in array");
        }
        else{
            System.out.println("Element " + target + " is present at index "+ index);
        }
        
    }
}
