public class printBinary{
    public static void printWithMasking(int number) {
        System.out.println("\nBinary form of number: " + number);
        
        for (int i = 31; i >= 0; i--) {
            
            int mask = 1 << i;
            if ((number & mask) == 0) {
                System.out.print(0);
            } else {
                System.out.print(1);
            }           
        }
    }
    public static void main(String[] args) {
        printWithMasking(150);
        printWithMasking(-150);
        printWithMasking(0);
    }
}