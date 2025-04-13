package SimpleQueueUsingLinkedList;

public class Queue<T> {
 

	Node<T> front;
	Node<T> rear;
	
	public Queue() {
		
	}
	 
	void enqueue(T val) {
		Node<T> nn=new Node<>(val);
		if(rear==null) {
			front=nn;
			rear=nn;
			return;
		}
		rear.next=nn;
		rear=nn;
	}
	
	T dequeue() {
		if(front==null) {
			rear=null;
			return null;
		}
		T val=front.val;
		if(front==rear) {
			front=null;
			rear=null;
			return val;
		}
		 
		front=front.next;
		return val;
	}
	
	void printQueue() {
		Node<T> head=front;
		while(head!=null) {
			System.out.println(head.val);
			head=head.next;
		}
	}

}
