
public class TrapWater{
    public static void trap_water(int[] height){
        int n = height.length;
        //LeftMax - Array 
        int[] LeftMax = new int[n];
        LeftMax[0] = height[0];
        for(int i=1; i < n; i++)
        {
            LeftMax[i] = Math.max(height[i],LeftMax[i-1]);
        }

        //rightMax - Array
        int[]  rightMax = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i >= 0;i--)
        {
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }

        //loop
        //calculate water_level
        //calculate trapped water
        int width =1 ;
        int total_trap = 0;
        for(int i=0; i<n;i++)
        {
            int water_level = Math.min(rightMax[i], LeftMax[i]);
            int trapped_water = (water_level - height[i])* width;
            if(trapped_water < 0)
                trapped_water = 0;
            total_trap += trapped_water;

        }
        System.out.println(total_trap);
    }

    public static void main(String[] args) {
        int[] height = {4, 2, 0, 6, 3, 2, 5};
        trap_water(height);
    }
}