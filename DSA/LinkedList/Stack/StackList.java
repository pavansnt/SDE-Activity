package DSA.LinkedList.Stack;

public class StackList {
    private class Node{
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    Node top;
    int count;

    public StackList()
    {
        this.top = null;
        count = 0;
    }

    public void push(int data){
       Node newNode = new Node(data);

       newNode.next = top;
       top = newNode;
       count++;
    }

    public int pop()
    {
        if (top == null)
        {
            System.out.println("Stack is Empty");
            return -1;
        }
        int data = top.data;
        top = top.next;
        count--;
        return data;
    }

    public int peek()
    {
        if(top == null){
            //System.out.println("Stack is Empty");
            return -1;
        }
        return top.data;
    }
    public int getCount()
    {
        return count; 
    }

    public void print()
    {
        if (top == null)
        {
            System.out.println("Stack is Empty");
            return;
        }

        Node currNode = top;
        System.out.print("[");

        while(currNode != null){
            System.out.print(" "+currNode.data+" --> ");
            currNode = currNode.next;
        }
        System.out.print("null ]");

    }
}
