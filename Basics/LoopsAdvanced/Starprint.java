package LoopsAdvanced;
public class Starprint{

    public static void printstar1(){
        for(int i = 0; i<=100; i++)
        {
                System.out.print(" *");

                // output :  * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
        }
    }
    //first Method
    public static void printstar2(){
        for(int i = 0; i<10; i++){
            for(int j = 0; j<10; j++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
        //output:
            // * * * * * * * * * *
            // * * * * * * * * * *
            // * * * * * * * * * *
            // * * * * * * * * * *
            // * * * * * * * * * *
            // * * * * * * * * * *
            // * * * * * * * * * *
            // * * * * * * * * * *
            // * * * * * * * * * *
            // * * * * * * * * * *
    }

//Performance: If gridSize is huge (say 10,000), the first method makes 
//10000 × 10000 = 100 million print calls, while the second makes only 10000 print calls
// Flexibility: With the built string, you can store, modify, or reuse it before printing.
// Clean output: Easier to format lines, e.g., insert spaces, tabs, or patterns.
    //second Method
    public static void printStarGridConcatApproch(int gridSize)
    {
        for (int count = 0; count < gridSize ; count++)
        {
            StringBuilder line = new StringBuilder();
            for(int row = 0; row < gridSize ; row++)
            {
                line.append("*");
            }
            System.out.println(line.toString());
        }
        
    }

    public static void printstar3(){
        for(int i = 0; i<10; i++){
            for(int j = 0; j<i+1; j++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
            // output:
            // *
            // * *
            // * * *
            // * * * *
            // * * * * *
            // * * * * * *
            // * * * * * * *
            // * * * * * * * *
            // * * * * * * * * *
            // * * * * * * * * * *
    }

    public static void printstar4(){
        for(int i = 0; i<10; i++){
            for(int j = i+1; j<10; j++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
            // output:
            // * * * * * * * * * *
            // * * * * * * * * *
            // * * * * * * * *
            // * * * * * * *
            // * * * * * *
            // * * * * *
            // * * * *
            // * * *
            // * *
            // *
    }

    public static void printStarForArray(int[] arr)
    {
        for (int index  = 0; index < arr.length; index++)
        {
            for (int count = 0; count < arr[index]; count++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    //input : int[] numbers = { 1, 2, 3, 4, 3, 2, 1};
    //output :
    // *
    // * *
    // * * *
    // * * * *
    // * * *
    // * *
    // *
    
    public static void printstarOdd(){
        for (int i = 0; i<10; i++)
        {
            StringBuilder line = new StringBuilder();
            for(int j = 0; j<10; j++)
            {   
                line.append( j%2 == 0 ? "*" : " " );
            }
            System.out.println(line.toString());
        }
        //output:
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
    }

    public static  void starPrintBorder(int size) //static - it can be called without creating an instance of the class
    {
        for (int row = 0; row < size; row++)
        {
            StringBuilder line = new StringBuilder();
            for (int col = 0; col < size; col++)
            {
                if (row == 0 || row == size -1 || col == 0 || col == size -1)
                {
                    line.append(" *");
                }
                
                else
                {
                    line.append("  ");
                }

            }
            System.out.println(line);
        }
        //output :
        // * * * * *
        // *       *
        // *       *
        // *       *
        // * * * * *
    }

    public static void printStarPyramid(int Height)
    {   //1. calculate count of space and create space
        //2.calculate count of stars and create stars
        //3.print the each line of pyramid with newLine

        int countOfStars = 1;
        for (int level = 1; level <= Height; level++)
        {
            StringBuilder line = new StringBuilder();
            int countOfSpace = Height - level;
            
            //printing spaces
            for ( int count = 1; count <= countOfSpace; count++)
            {
                line.append(" ");
            }

            //printing stars
            for ( int count = 1; count <= countOfStars; count++)
            {
                line.append("*");
            }
            System.out.println(line);
            countOfStars += 2;
        }
        //output:
        //      *
        //     ***
        //    *****
        
    }

    public static void invertedPyramid(int height)
    {
        int countOfStars = (height * 2) -1;
        int countOfSpaces = 0;
        for ( int level = 1; level <= height; level++)
        {
            StringBuilder line = new StringBuilder();
            for( int count = 1; count <= countOfSpaces; count++)
            {
                line.append(" ");
            }

            for( int count = 1; count <= countOfStars; count++)
            {
                line.append("*");
            }
            System.out.println(line);
            countOfSpaces++;
            countOfStars -= 2;
        }
        //output:
        //    *****
        //     ***
        //      *
    }

    public static void main(String[] args) {
        //printstar1();
        //printstar2();
        //printStarGridConcatApproch(25);
        // printstar3();

        //int[] numbers = { 1, 2, 3, 4, 3, 2, 1};
        // printStarForArray(numbers);
        //printstarOdd();
        //starPrint5();
        //starPrintBorder(25);
        printStarPyramid(5);
        invertedPyramid(5);
        
    }



    
}
