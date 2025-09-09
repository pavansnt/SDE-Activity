package DSA.LinkedList.Stack;

import java.util.Arrays;

public class StackArray {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public StackArray(int size)
    {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value)
    {
        if (top == maxSize -1)
        {
            System.out.println("Stack is Full");
            return;
        }
        stackArray[++top] = value;
    }

    public int pop()
    {
        if( isEmpty())
        {
            System.out.println("Stack is empty");
            return -1;

        }
        return stackArray[top--];
    }

    public int size()
    {
        return top + 1;
    }

    public int peek()
    {   if(top == -1)
        {
            System.out.println("Stack is Empty");
            return -1;
        }
            return stackArray[top];
    }

    public boolean isEmpty()
    {
        return top == -1;
    }

    public void printStack(){
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        int[] validStack = Arrays.copyOfRange(stackArray, 0 ,top +1);
        System.out.println(Arrays.toString(validStack));
    }

    
}

