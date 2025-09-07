import java.util.Arrays;

public class ShuffleArray {
    public static int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2*n];
        int x = 0;
        for(int i=0; i<n;i++){
            arr[x]=nums[i];
            x+=2;
        }

        int y = 1;
        for(int i=n;i<2*n;i++){
            arr[y]=nums[i];
            y += 2;
        }
    
            
        return arr;
    }

    public static void main(String[] args) {
        int n = 3;
        int[] nums = {2,5,1,3,4,7};
        shuffle(nums,n);
        System.out.println(Arrays.toString(shuffle(nums,n)));
    }
    
}
