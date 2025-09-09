public class SinglyLinkedList {
    Node head;

    public SinglyLinkedList()
    {
    //A linked list starts as empty,So when you first create it, you don’t need any input.
    //That’s why it has a no-argument constructor → it just sets head = null.
        this.head = null;
    }

    //it does not matter  whether there are any nodes or not
    //we  can set next to current head
    //and make newNode as current head
    public void insertAtBeginnning(int data)
    {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        
    }

    public void insertAtEnd(int data)
    {   Node newNode = new Node(data);
        if(this.head ==  null){
            this.head = newNode;
            System.out.println("List was empty so newNode assigned to head");
            return;
        }

        Node currentNode = this.head;
        while(currentNode.next != null)
        {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
        
        System.out.println("inserted at end " + newNode.data);

    }

    public void insertAtPosition(int data, int targetPosition)
    {
        if(targetPosition <= 0){
            System.err.println("invalid position");
            return;
        }

        if(targetPosition == 1){
            this.insertAtBeginnning(data);
            return;
        }

        Node currentNode = this.head;
        int currentPosition = 1;

        while (currentPosition < targetPosition - 1 && currentNode != null) {
            currentNode = currentNode.next;
            currentPosition++;
        }
        
        if (currentNode == null) {
            System.err.println("Invalid position! Out of range.");
            return;
        }

        Node newNode = new Node(data);
        newNode.next = currentNode.next;
        currentNode.next = newNode;     
    }

    public void deleteAtBeginning(){
        //list is empty
        if(head == null){
            System.out.println("Nothing to delete since list empty");
            return;
        }

        //if list has  one or more  node
        head = head.next;
        System.out.println("First node deleted");

    }

    public void deleteAtEnd(){
        //if list is empty
        if(head == null){
            System.out.println("Nothing to delete since list empty");
            return;
        }

        //if list has only one node
        if(head.next == null){
            head = null;
            System.out.println("Delted that only one node which is in the list");
            return;
        } 

        Node currentNode = this.head;
       // while(currentNode != null)  --> ❌ here we will reach end of the list till null
       // while(currentNode.next != null) --> ❌ here we reach tp last node which we need to delete
        while(currentNode.next.next != null){ // ---> ✅ here we reach the one node of  before the last node
            currentNode = currentNode.next;
        }
        currentNode.next = null;
        System.out.println("Deleted node at End of List");
    }

    public void SearchNode(int data){

        if(this.head == null){
            System.out.println("Not found since List is Empty");
            return;
        }

        if(data <= 0){
            System.out.println("Invalid Search!!");
            return;
        }

        Node currentNode = this.head;
        int currentPosition = 1;
        while(currentNode.next != null){
            if(currentNode.data == data){
                System.out.println("given Node = "+ data +" found at position : " + currentPosition);
                return;
            }
            currentNode = currentNode.next;
            currentPosition++;
        }
        System.out.println(" Node = " +data+ " Not found!!"); 
    }

    public void deleteAtPosition(int deletePosition){
        if(this.head == null){
            System.out.println("List is empty");
            return;
        }

        if(deletePosition <= 0){
            System.out.println("Invalid Position");
            return;
        }

        // ✅ Special case: delete the head (position 1)
        if(deletePosition == 1){
            head = head.next;
            System.out.println("Deleted node at position 1");
            return;
        }

        Node currentNode = this.head;
        int currentPosition = 1;

        while(currentPosition < deletePosition - 1 && currentNode != null){
            currentNode = currentNode.next; 
            currentPosition++;
        }

        if(currentNode == null || currentNode.next == null){
            System.out.println("Invalid Position, Out of range!!!");
            return;
        }

        currentNode.next = currentNode.next.next;
        System.out.println("Deleted node at position " + deletePosition);
    }


    public void testInsertOperation(){
        insertAtBeginnning(1);// List: 1
        insertAtBeginnning(2);  // List: 2 -> 1
        insertAtPosition(3, 3);
        //insertAtPosition(4, 5); this wont work it will print "invalid postion! Out of range"
        printAllOperations();
    }

    

    public void testDeleteOperation(){
        System.out.println("-------After deletion------");
        deleteAtBeginning();
        deleteAtEnd();
        printAllOperations();
    }

    public void testDeleteAtPosition(){
        System.out.println("-------After deletion------");
        this.deleteAtPosition(1);
        this.deleteAtPosition(-1);
        this.deleteAtPosition(8);
    }

    public void printAllOperations()
    {
        if(this.head ==  null){
            System.out.println("List is empty");
            return;
        }

        Node currentNode =  this.head;
        while(currentNode != null){
            System.out.print(" " + currentNode.data + " -->");
            currentNode = currentNode.next;

        }
        System.out.println("null");

    }

}
