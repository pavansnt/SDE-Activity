package LinearSearch;


// if int[] number = { 1, 5, 2, 9, 6, 8, 3} in this if we need to search for 2 in range of index [1,4]
public class searchInRange {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 9, 6, 8, 3};
        int target = 8, start = 4, end = 6;
        
        if(search(arr,target,start,end) == -1){
            System.out.println("target key : " + target + " not found!!");
            return;
        }
        System.out.println("Target key " + target + " found at : " + search(arr,target,start,end));
    }

    public static int search(int[] arr, int target, int start, int end) {
        if(arr.length == 0) {
            return -1;
        }

        for (int i =start; i <= end; i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
