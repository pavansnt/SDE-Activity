package LinkedList.CircularLinkedList;

public class Dsa_App {
    public static void main(String[] args) {
        //testinsertAtBeginning();
        //testSearch();
        //testDeleteAtBeginning();
        testDeleteAtEnd();
    }
    public static void testinsertAtBeginning(){
        CircluarLinkedList CLL = new CircluarLinkedList();
        CLL.printList();
        CLL.insertAtBeginning(2);
        CLL.printList();
        CLL.insertAtBeginning(1);
        CLL.printList();
        CLL.insertAtEnd(3);
        CLL.printList();
    }
    public static void testDeleteAtBeginning()
    {
        CircluarLinkedList CLL = new CircluarLinkedList();
        CLL.printList();
        CLL.insertAtBeginning(2);
        CLL.printList();
        //CLL.insertAtBeginning(1);
        //CLL.printList();
        CLL.deleteAtBeginning();
        CLL.printList();
    }

    public static void testDeleteAtEnd()
    {
        CircluarLinkedList CLL = new CircluarLinkedList();
        CLL.printList();
        CLL.insertAtBeginning(2);
        CLL.printList();
        CLL.insertAtBeginning(1);
        CLL.printList();
        CLL.deleteAtEnd();
        CLL.printList();
    }

    public static void testSearch(){
        CircluarLinkedList CLL = new CircluarLinkedList();
        CLL.insertAtBeginning(2);
        CLL.insertAtBeginning(1);
        CLL.insertAtEnd(3);
        CLL.printList();
        CLL.search(3);
        CLL.search(9);
    }
}
