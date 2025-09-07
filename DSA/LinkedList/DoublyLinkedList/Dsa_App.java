package DSA.LinkedList.DoublyLinkedList;
public class Dsa_App {
    public static void main(String[] args) {
        System.out.println("=== Running DLL Tests ===");

        //testInsertAtBeginning();
        //testInsertAtEnd();
        //testInsertAtPosition();
        //testSearch();
        //testReverse();
        //testDeleteAtBeginning();
        //testdeleteAtEnd();
        testdeleteAtPosition();

        System.out.println("\n=== End of Tests ===");
    }

    // Test Insert at Beginning
    public static void testInsertAtBeginning() {
        System.out.println("\n--- Test Insert At Beginning ---");
        DoublyLinkedList DLL = new DoublyLinkedList();

        DLL.insertAtBeginning(10);
        DLL.printOperation(); // Expected: 10

        DLL.insertAtBeginning(5);
        DLL.printOperation(); // Expected: 5 <-> 10

        DLL.insertAtBeginning(1);
        DLL.printOperation(); // Expected: 1 <-> 5 <-> 10
    }

    // Test Insert at End
    public static void testInsertAtEnd() {
        System.out.println("\n--- Test Insert At End ---");
        DoublyLinkedList DLL = new DoublyLinkedList();

        DLL.insertAtEnd(10);
        DLL.printOperation(); // Expected: 10

        DLL.insertAtEnd(20);
        DLL.printOperation(); // Expected: 10 <-> 20

        DLL.insertAtEnd(30);
        DLL.printOperation(); // Expected: 10 <-> 20 <-> 30
    }

    // Test Insert at Given Position
    public static void testInsertAtPosition() {
        System.out.println("\n--- Test Insert At Position ---");
        DoublyLinkedList DLL = new DoublyLinkedList();

        DLL.insertAtPosition(10, 1);
        DLL.printOperation(); // Expected: 10

        DLL.insertAtPosition(5, 1);
        DLL.printOperation(); // Expected: 5 <-> 10

        DLL.insertAtPosition(20, 3);
        DLL.printOperation(); // Expected: 5 <-> 10 <-> 20

        DLL.insertAtPosition(15, 3);
        DLL.printOperation(); // Expected: 5 <-> 10 <-> 15 <-> 20

        DLL.insertAtPosition(100, 10); // Invalid
        DLL.printOperation(); // Should print error message
    }
    public static void testSearch() {
        System.out.println("\n--- Test Search ---");
        DoublyLinkedList DLL = new DoublyLinkedList();

        DLL.insertAtEnd(10);
        DLL.insertAtEnd(20);
        DLL.insertAtEnd(30);
        DLL.insertAtEnd(40);

        DLL.printOperation(); // Expected: 10 <-> 20 <-> 30 <-> 40

        DLL.search(10);  // Expected: Found at position 1
        DLL.search(30);  // Expected: Found at position 3
        DLL.search(40);  // Expected: Found at position 4
        DLL.search(99);  // Expected: Not found
    }
    public static void testDeleteAtBeginning(){
        DoublyLinkedList DLL = new DoublyLinkedList();
        DLL.insertAtBeginning(1);
        DLL.deleteAtBeginning();
        DLL.printOperation();
    }
    public static void testdeleteAtEnd(){
        DoublyLinkedList DLL = new DoublyLinkedList();
        DLL.insertAtBeginning(2);
        DLL.insertAtBeginning(1);
        DLL.printOperation();
        DLL.deleteAtEnd();
        DLL.printOperation();
    }

    public static void testdeleteAtPosition(){
        DoublyLinkedList DLL = new DoublyLinkedList();
        DLL.insertAtEnd(10);
        DLL.insertAtEnd(20);
        DLL.insertAtEnd(30);
        DLL.printOperation();
        // Output: 10 <-> 20 <-> 30 <-> null

        DLL.deleteAtPosition(20, 2);
        DLL.printOperation();  
        // Output: 10 <-> 30 <-> null

        // Invalid delete beyond list length
        DLL.deleteAtPosition(99, 3);  
        // This is where currentNode != null (points to last node 30),
        // but currentNode.next == null
    }

    public static void testReverse() {
    System.out.println("\n--- Test Reverse ---");
    DoublyLinkedList DLL = new DoublyLinkedList();

    DLL.insertAtEnd(1);
    DLL.insertAtEnd(2);
    DLL.insertAtEnd(3);
    DLL.insertAtEnd(4);

    DLL.printOperation();  // Expected: 1 <-> 2 <-> 3 <-> 4 <-> null
    DLL.printReverse();    // Expected: 4 <-> 3 <-> 2 <-> 1 <-> null
}

}
