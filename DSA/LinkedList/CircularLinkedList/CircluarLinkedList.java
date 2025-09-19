package LinkedList.CircularLinkedList;

public class CircluarLinkedList {
    Node tail;
    

    public CircluarLinkedList()
    {
        this.tail = null;
    }

    public void insertAtBeginning(int data)
    {
        Node newNode = new Node(data); 
        if (this.tail == null)
        {
            newNode.next = newNode;
            this.tail = newNode;
            return;
        }
        
        newNode.next = this.tail.next;
        this.tail.next =  newNode;
    }

    public void insertAtEnd(int data)
    {
        Node newNode = new Node(data);
        if (this.tail == null){
            newNode.next = newNode;
            tail.next = newNode;
            tail = newNode;
            return;
        }
        newNode.next = tail.next;
        tail.next = newNode;
        this.tail = newNode;
    }

    public void printList()
    {
        if (this.tail == null)
        {
            System.out.println("List is Empty");
            return;
        }
        Node currentNode = this.tail.next;
        while (true)
        {
            System.out.print(""+currentNode.data+ " <--> ");
            currentNode = currentNode.next;
            if(currentNode == tail.next){
                break;
            }
            
        }
        System.out.println("tail");
    }

    public void deleteAtBeginning(){
        //if list is empty
         if (this.tail == null)
        {
            System.out.println("Deletion at beginning not possible! since list is Empty!!!");
            return;
        }

        //if there is only one node
        if ( this.tail == this.tail.next ){
            //tail.next = null; no need of this line because in next line we made tail as null
            tail = null;
            System.out.println("Node at head successfully deleted");
            return;
        }
        //if there are more than one node 
        this.tail.next = tail.next.next;
        System.out.println("Node at head successfully deleted");
    }

    public void deleteAtEnd(){
        if (this.tail == null)
        {
            System.out.println("Deletion at end not possible! since list is Empty!!!");
            return;
        }

        if (this.tail == tail.next)
        {
            tail = null;
            System.out.println("Node at End Deleted successfully");
            return;
        }

        Node currentNode = this.tail.next;
        while (currentNode.next != tail)
        {
            currentNode = currentNode.next;
            break;
        }
        currentNode.next = tail.next;
        tail = currentNode;
    }

    public void search(int data)
    {
        boolean isFound = false;

        if (this.tail == null){
            System.out.println("List is Empty");
            return;
        }

        Node currentNode = this.tail.next;
        int CurrentPosition = 1;

        while (true){
            if (currentNode.data == data)
            {
                isFound = true;
                break;  // stop searching when node found
            }
            CurrentPosition++;
            currentNode = currentNode.next;
            if (currentNode == tail.next)
            {
                break; // to terminate the loop
            }
        }
        if (isFound)
        {
            System.out.println("Node" + data +" found at position " + CurrentPosition);
        }
        else
        {
            System.out.println("Node "+ data +" not found!!!");
        }
       
    }
}
