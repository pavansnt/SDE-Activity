public class printSubarray {
    public static void paring(int[] elements)
    {  
        int total_subArray = 0;
        int Max =  Integer.MIN_VALUE;
        int Min = Integer.MAX_VALUE;
        for(int i = 0; i < elements.length; i++)
        {   
            int start = i;
            for(int j = i; j < elements.length;  j++ )
            {   
                int end = j;
                int sum = 0;
                for(int k= start; k<= end; k++)
                {
                    System.out.print(" " + elements[k]);
                    total_subArray++;
                    sum += elements[k];
                }
                System.out.print(" = " + sum);
                if(sum > Max)
                        Max = sum;
                if(sum < Min)
                        Min = sum;
                System.out.print("  ");
            }
            System.out.println();  
        }
        System.out.println(" Max: " + Max + " Min: "+ Min);
        System.out.println("Total pairs: " + total_subArray);
    }

    public static void main(String[] args) {
        int[] numbers = {1,-2,3,4,5,-5,7};
        paring(numbers);
    }
}
