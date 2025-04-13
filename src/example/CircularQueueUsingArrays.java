package example;

public class CircularQueueUsingArrays<T> {
     T[] circularqueue;
     int front = 0, rear = -1, size = 0, capacity;

    @SuppressWarnings("unchecked")
    public CircularQueueUsingArrays(int capacity) {
        this.capacity = capacity;
        circularqueue = (T[]) new Object[capacity];
    }

    public void enqueue(T item) {
        if (size == capacity) return;  
        rear = (rear + 1) % capacity;
        circularqueue[rear] = item;
        size++;
    }

    public T dequeue() {
        if (size == 0) return null;
        T val = circularqueue[front];
        circularqueue[front] = null;
        front = (front + 1) % capacity;
        size--;
        return val;
    }

    public void printvalues() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(circularqueue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
    	CircularQueueUsingArrays<Integer> cq=new CircularQueueUsingArrays<>(3);
    	cq.enqueue(3);
    	cq.dequeue();
    	cq.printvalues();
    	cq.enqueue(2);
    	cq.enqueue(4);
    	cq.enqueue(5);
    	cq.dequeue()
;
    	cq.enqueue(1);
    	cq.printvalues();
    }
}
