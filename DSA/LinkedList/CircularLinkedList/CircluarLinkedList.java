package DSA.LinkedList.CircularLinkedList;

public class CircluarLinkedList {
    Node tail;
    

    public CircluarLinkedList(){
        this.tail = null;
    }

    public void insertAtBeginning(int data){
        Node newNode = new Node(data); 
        if(this.tail == null){
            newNode.next = newNode;
            this.tail = newNode;
            return;
        }
        
        newNode.next = this.tail.next;
        this.tail.next =  newNode;
        this.tail = newNode;
    }

    public void insertAtEnd(int data){
        
    }
}
