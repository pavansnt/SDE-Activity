package Generics;

public class BoxDemo {
    //generic Method
    public static <T> void printOnTerminal(T values) {
        System.out.println("Value is : " + values);
    }

    //Note : 1.we cant do operations like addition, substraction in generic methods
    //       2.generics wont work on primitive data type
    
    public static void main(String[] args) {
        Box<Integer> intbox = new Box<>();
        //generics wont work on primitive data type

        intbox.setValue(10);
        intbox.printValue();
        System.out.println("Printing Value is getValue() : " + intbox.getValue());
        
        Box<String> stringBox = new Box<>();
        stringBox.setValue("Ten - 10");
        stringBox.printValue();
        System.out.println("Printing Value is getValue() : " + stringBox.getValue());

        printOnTerminal("Algo365");
        printOnTerminal(123);
        printOnTerminal(true);
    }
}
