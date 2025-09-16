package Queue;
public class CircularQueueArray {
    private int[] queue;
    private int front, rear, size, capacity;

    // Constructor
    public CircularQueueArray(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = -1;
        this.rear = -1;
        this.size = 0;
    }

    // Check if queue is full
    public boolean isFull() {
        return (size == capacity);
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return (size == 0);
    }

    // Enqueue operation
    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is Full! Cannot insert " + data);
            return;
        }

        // First element insertion
        if (front == -1) {
            front = 0;
        }

        // Move rear in circular manner
        rear = (rear + 1) % capacity;
        queue[rear] = data;
        size++;

        System.out.println("Enqueued: " + data);
    }

    // Dequeue operation
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty! Cannot dequeue.");
            return -1;
        }

        int value = queue[front];

        // If only one element was present
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % capacity;
        }

        size--;
        System.out.println("Dequeued: " + value);
        return value;
    }

    // Peek front element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return -1;
        }
        return queue[front];
    }

    // Print queue
    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return;
        }

        System.out.print("Queue: ");
        int count = size;
        int i = front;
        while (count > 0) {
            System.out.print(queue[i] + " ");
            i = (i + 1) % capacity;
            count--;
        }
        System.out.println();
    }
}
