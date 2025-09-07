public class Bubble_sort {

    public static void sorting(int[] array)
    {
        boolean isSwapped = false;
        int n = array.length;
        for(int turn =0; turn < n-1; turn++)
        {
            for(int j=0; j < n-1-turn; j++)
            {
                if(array[j] > array [j+1])
                {
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                    isSwapped = true;
                }
            }

            if(!isSwapped) break;
        }
    }

    public static void printArr(int[] array)
    {
        for(int i = 0; i<array.length; i++)
        {
            System.out.print(" " + array[i]);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 7, 4, 2, 9, 5};
        printArr(array);
        System.out.print("\n-----------------------------\n");
        sorting(array);
        printArr(array);
    }
}