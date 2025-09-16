package Queue;

public class CircularQueueList {
    Node rear, front;
    //int size, capacity;

    public CircularQueueList(){
        this.rear = this.front = null;
    }

    public boolean isEmpty() {
        if (this.rear == null)
            return true;
        else
            return false;
    }

    public void enqueue(int data)
    {   
        Node newNode = new Node(data);
        //if queue is empty
        if(this.rear == null){
            this.front = this.rear = newNode;
            System.out.println("Enqueued : " + newNode.data);
            return;
        }

        //if there are one or more nodes
        this.rear.next = newNode;
        this.rear = newNode;
        System.out.println("Enqueued : " + newNode.data);
    }

    public int dequeue() {
        //if queue is empty
        if(isEmpty()) {
            System.out.println("Queue is Empty, cannot dequeue");
            return -1;
        }

        int data = this.front.data;
        this.front = this.front.next;
        System.out.println("Dequeud : "+ data);
        if (front == null)
            rear =  null;
        return data;
    }

    public int peek() {
        if ( isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return front.data;
    }

    public void printQueue() {
        if(isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        Node currNode = this.front;

        while(currNode != null)
        {
            System.out.print(+currNode.data + "-->");
            currNode = currNode.next;
        }
        System.out.println();
    }
}
