package Queue;

public class Queue_application {
    
    public static void main(String[] args) {
        testCircularQueueArray();
        testCircularQueueList();
        
    }

    public static void testCircularQueueArray() {
        CircularQueueArray cq = new CircularQueueArray(5);

        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);
        cq.enqueue(50);

        cq.printQueue();  // Queue: 10 20 30 40 50

        cq.dequeue();     // removes 10
        cq.dequeue();     // removes 20

        cq.printQueue();  // Queue: 30 40 50

        cq.enqueue(60);
        cq.enqueue(70);

        cq.printQueue();  // Queue: 30 40 50 60 70 (wrapped around)

        System.out.println("Peek: " + cq.peek()); // should be 30

        cq.dequeue(); // removes 30
        cq.dequeue(); // removes 40
        cq.dequeue(); // removes 50
        cq.dequeue(); // removes 60
        cq.dequeue(); // removes 70
        cq.dequeue(); // Queue is empty
    }

    public static void testCircularQueueList()
    {
        CircularQueueList cl = new CircularQueueList();

        cl.enqueue(10);
        cl.enqueue(20);
        cl.enqueue(30);
        cl.enqueue(40);
        cl.enqueue(50);

        cl.printQueue();  // Queue: 10 20 30 40 50

        cl.dequeue();     // removes 10
        cl.dequeue();     // removes 20

        cl.printQueue();  // Queue: 30 40 50

        cl.enqueue(60);
        cl.enqueue(70);

        cl.printQueue();  // Queue: 30 40 50 60 70 (wrapped around)

        System.out.println("Peek: " + cl.peek()); // should be 30

        cl.dequeue(); // removes 30
        cl.dequeue(); // removes 40
        cl.dequeue(); // removes 50
        cl.dequeue(); // removes 60
        cl.dequeue(); // removes 70
        cl.dequeue(); // Queue is empty
    }
}
