package Stack;

public class Stack_Application {
    public static void main(String[] args) {
        testStackArray();
        testStackList();
    }

    public static void testStackArray()
    {
        StackArray st = new StackArray(4);
        st.pop();
        System.out.println(st.peek());
        st.push(1);
        st.push(2);
        st.printStack();
        System.out.println(st.pop());
        st.printStack();
        System.out.println(st.size());
    }

    public static void testStackList()
    {
        StackList sl = new StackList();
        sl.print();
        //System.out.println("last element = "+ sl.peek());
        sl.push(4);
        System.out.println("last element = "+ sl.peek());
        sl.push(3);
        System.out.println("Number of elements in the stack = "+ sl.getCount());
        sl.print();

    }
}
