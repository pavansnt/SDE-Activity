public class LinearSearch {
    public static int LSearch(int[] arr, int key){
        if(arr.length == 0)
            return -1;
        
            for(int i=0; i < arr.length; i++){
                if(arr[i]==key){
                    return i;
                }
            }
            return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,23,4,5,6,7,8,4,34,67};
        int key = 34;
        if(LSearch(arr,key)==-1){
            System.out.println("Key not found in given array");
        }
        else{
            System.out.println("Key "+key+" found at "+LSearch(arr,key)+"th index");
        }
    }
}
