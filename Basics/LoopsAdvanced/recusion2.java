package LoopsAdvanced;

public class recusion2 {

    // Print numbers from n to 1
    public static void Example1(int n) {
        if (n == 0) 
            return;   // base case
        System.out.println(n);
        Example1(n - 1);     // recursive case
    }


    public static void Example2(int size) {
        //Termination Block
        if ( size == 0)
            return;
        
        //work-block
        size--;
        System.out.println("Before the recursive call : " + size);

        //recursive-call
        Example2(size);
        System.out.println("After the recursive call : "+ size);
    }


    //----indirect recursion----
    static void funA(int n) {
        if (n > 0) {
            System.out.print(n + " ");
            funB(n - 1);
        }
    }

    static void funB(int n) {
        if (n > 0) {
            System.out.print(n + " ");
            funA(n / 2);
        }
    }

    //--Tree Recursion--
    static void treeRec(int n) {
        if (n == 0) 
            return;
        System.out.println(n);
        treeRec(n - 1);
        treeRec(n - 1);
    }

    static int fact(int n) {
        if (n == 0) 
            return 1;
        return n * fact(n - 1);
    }

    static int fib(int n) {
        if (n <= 1) 
            return n;
        return fib(n-1) + fib(n-2);
    }



    
    //---Main method-----
    public static void main(String[] args) {
        //Example1(6);
        //Example2(6); 
        //funA(6);
        treeRec(4);
        fib(3);
    }
}
