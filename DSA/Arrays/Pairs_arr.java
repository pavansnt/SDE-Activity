public class Pairs_arr {
    public static void paring(int[] elements)
    {   int tp = 0;
        for(int i = 0; i < elements.length;i++)
        {
            int current = elements[i];
            for(int j = i+1; j < elements.length;j++ )
            {   
                System.out.print("\t("+current+","+elements[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs: " +tp);
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7};
        paring(numbers);

    }
}
