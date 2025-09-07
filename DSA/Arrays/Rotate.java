import java.util.Arrays;

public class Rotate {
    public static void main(String[] args){
        int arr1[] = {1,2,3,4,5};
        System.out.println(Arrays.toString(rotateArray(arr1, 5, 2)));

        int arr2[] = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(rotateArray(arr2, 7, 3)));
    }

    public static int[]  rotateArray(int[] arr, int n,int k){
        int tempArr[] = new int[n];
        
        int x = 0;
        for (int i = k; i < n; i++){
            tempArr[x] = arr[i];
            x++;
        }

        int  y = x;
        for (int i = 0; i < k; i++){
            tempArr[y] = arr[i];
            y++;
        }

        return tempArr;

    }
}
