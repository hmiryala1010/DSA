package example;

public class SimpleQueueUsingArrays<T> {
	T[] queue;
	int front=0;
	int rear=-1;
	int capacity;
	
	@SuppressWarnings("unchecked")
	SimpleQueueUsingArrays(int capacity){
		this.capacity=capacity;
		queue=(T[]) new Object[capacity];
	}
	
	void enqueue(T item) {
		if(rear+1==capacity) return;
		queue[++rear]=item;
	}
	
	T dequeue() {
		if(front>rear) return null;
		return queue[front++];
	}
	
	void printvalues() {
		if(front>rear) System.out.println("queue is empty");
		for(int i=front;i<=rear;i++)
			System.out.println(queue[i]);
 
	}
	

	public static void main(String[] args) {
		 SimpleQueueUsingArrays<String> sq=new SimpleQueueUsingArrays<>(3);
		 sq.enqueue("hi"); 
		 sq.enqueue("hasini");
		 System.out.println("Dequeued value  "+sq.dequeue());
		 sq.printvalues();
		 
	}

}
