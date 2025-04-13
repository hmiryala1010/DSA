package SimpleQueueUsingLinkedList;

public class QueueUsingLinkedList {
	
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
		Queue<Integer> q=new Queue<>();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.dequeue();
		q.dequeue();
		q.enqueue(4); 
		q.dequeue();
		q.dequeue(); 
	 q.enqueue(5);
	 q.dequeue();
	 q.printQueue();

	}

}
