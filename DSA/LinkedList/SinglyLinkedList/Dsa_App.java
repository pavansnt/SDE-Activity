public class Dsa_App {
    public static void main(String[] args) {
        
        SinglyLinkedList SLL = new SinglyLinkedList();
        SLL.deleteAtPosition(1);
        SLL.deleteAtPosition(-1);
        SLL.insertAtBeginnning(1);
        SLL.deleteAtPosition(-1);
        SLL.insertAtPosition(1, 1);
        SLL.insertAtPosition(2, 2);
        SLL.insertAtPosition(3, 3);
        SLL.insertAtPosition(4, 3);
        SLL.deleteAtPosition(5);
        SLL.deleteAtPosition(10);
        SLL.printAllOperations();
        SLL.SearchNode(4);
    }
}
