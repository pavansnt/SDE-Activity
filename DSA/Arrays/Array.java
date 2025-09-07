public class Array{

    public static void main(String[] args){
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Number of elements in the array : " + numbers.length + "\n");
        System.out.println("Values in the Number array: ");
        printElements(numbers);


        int[] Ages = new int[3];
        Ages[0] = 10;
        Ages[1] = 20;
        Ages[2] = 30;
        System.out.println("\nValues in the Ages array: ");
        printElements12(Ages);

        int[][] matrix = { {1, 2, 3}, {4, 5, 6,}};
        System.out.println("\nValues in the matrix: ");
         //System.out.print(" " + matrix[0][0]);
        // System.out.print(" " + matrix[0][1]);
         //System.out.print(" " + matrix[0][2]);
        printMatrix(matrix);

    }

    public static void printElements(int[] elements)
    {
        for(int i = 0; i < elements.length; i++){
            System.out.print(" " + elements[i]);
        }
        System.out.println("\n------------------------");
    }
    
    public static void printElements12(int[] elements)
    {
        for(int element : elements){
            System.out.print(" " + element);
        }
        System.out.println("\n------------------------");
    }


    public static void printMatrix(int[][] matrix)
    {
        for(int i = 0; i < matrix.length;i++){
            for(int j = 0; j < matrix.length; j++ ){
                System.out.print(" " + matrix[i][j]);
            }
        }
    }
}