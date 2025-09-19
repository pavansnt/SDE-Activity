package LinkedList.DoublyLinkedList;

public class DoublyLinkedList {
    Node head;
    
    public DoublyLinkedList(){
        this.head = null;
    }

    public void insertAtBeginning(int data){
        Node newNode = new Node(data);
        if(this.head != null){
            newNode.next = this.head;
            head.prev = newNode;
        }
        this.head = newNode;
        System.out.println("Node inserted at Beginning with data = "+data);
    }

    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(this.head ==  null){
            this.head = newNode;
            return;
        }
        Node currentNode = this.head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
        newNode.prev = currentNode;
        System.out.println("New node created at end with data ="+data);
    
    }
    //using single pointer
    // public void insertAtPosition(int data, int position){
    //     if(position <= 0){
    //         System.out.println("Invalid Position");
    //         return;
    //     }

    //     Node newNode = new Node(data);
    //     if(position ==1){
    //         newNode.next = this.head;
    //         if(this.head != null){
    //             this.head.prev = newNode;
    //         }
    //         this.head = newNode;
    //         return;
    //     }

    //     Node currentNode = this.head;
    //     int currentPosition = 1;
    //     while(currentNode != null && currentPosition < position-1){
    //         currentNode = currentNode.next;
    //         currentPosition++;
    //     }
    //     if(currentNode == null){
    //         System.out.println("Invalid Position!!,out of range");
    //         return;
    //     }
    //     newNode.next = currentNode.next;
    //     newNode.prev =currentNode;
    //     if(currentNode.next != null){
    //         currentNode.next.prev =newNode;
    //     }
    //     currentNode.next = newNode;
    //     System.out.println("New Node created at position = "+position+" with data = "+data);

    // }

    //Using DoublePointer
    public void insertAtPosition(int data,int position){
        if(position <= 0){
            System.out.println("Inavlid Position!!");
            return;
        }
        Node newNode = new Node(data);
        if(position == 1){
            newNode.next = this.head;
            if(this.head != null){
                this.head.prev = newNode;
            }
            this.head = newNode;
            System.out.println("New node created at position 1");
            return;  
        }
        Node leftNode = this.head;
        int currentPosition = 1;
        while(currentPosition < position -1 && leftNode != null){
            leftNode =leftNode.next;
            currentPosition++;
        }
        if(leftNode == null){
            System.out.println("Invalid Position,out of range!!");
            return;
        }

        Node rightNode = leftNode.next; // null incase if you insert at end
        newNode.next = rightNode;
        newNode.prev = leftNode;
        leftNode.next = newNode;
        if(rightNode != null){
            rightNode.prev = newNode;
        }
    }

    public void search(int data){
        if(data <= 0){
            System.out.println("Invalid input");
            return;
        }
        Node currentNode = this.head;
        int currentPosition = 1;
        while(currentNode != null ){
            if(currentNode.data == data){
                System.out.println("Given Node "+ data +" found at Position "+ currentPosition);
                return;
            }
            currentNode = currentNode.next;
            currentPosition++;
        }
    }

    public void deleteAtBeginning() {
        if(this.head ==  null){
            System.out.println("List is Empty");
            return;
        }
        head = head.next;
        if(head != null){
            head.prev = null;
        }
        System.out.println("First Node deleted");
    }
    public void deleteAtEnd(){
        if(this.head == null){
            System.out.println("Nothing to delete List is empty");
            return;
        }
        
        if(head.next == null){
            this.head = null;
            System.out.println("Deleted last one and only node");
            return;
        }
        
        Node currentNode = this.head;
        while(currentNode.next.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = null;
        System.out.println("Deleted Node at End");
    }
    
    public void deleteAtPosition(int data, int position){
        if(this.head == null){
            System.out.println("List is empty");
            return;
        }

        if (position <= 0){
            System.out.println("Invalid Input");
            return;
        }
        if(position ==1 && head.next == null){
            head = head.next;
            return;
        }

        Node currentNode = this.head;
        int currentPosition = 1;
        while (currentPosition < position -1 && currentNode != null){
            currentNode = currentNode.next;
            currentPosition++;
        }
        if(currentNode == null || currentNode.next == null){
            System.out.println("Invalid Position, out of range");
            return;
        }
        currentNode.next = currentNode.next.next;
        if(currentNode.next != null){
            currentNode.next.prev = currentNode;
        }
        System.out.println("Node - "+ data +"deleted at given position - "+position);
    }

    public void printOperation(){
        if(this.head == null){
            System.out.println("List is Empty!!!");
            return;
        }
       Node currentNode = this.head;
       while(currentNode != null){
        System.out.print("" + currentNode.data + " <--> ");
        currentNode = currentNode.next;
       }
       System.out.println("null");
    }

    public void printReverse(){
        if(this.head == null){
            System.out.println("List is Empty");
            return;
        }

        Node currentNode = this.head;
        while (currentNode.next != null){
            currentNode =  currentNode.next;
        }

        System.out.println("---Reverse List---");
        while (currentNode != null){
            System.out.print("" + currentNode.data+" <--> ");
            currentNode =  currentNode.prev;
        }
        System.out.println("null");
    }
}
