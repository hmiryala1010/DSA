package CircularQueueUsingLinkedList;

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
			rear.next=front;
			return;
		}
		rear.next=nn;
		rear=nn;
		rear.next=front;
	}
	// O(1)
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
		rear.next=front;
		return val;
	}//O(1)
	
	void printQueue() {
		Node<T> head=front;
		if(head==null)return;
		if(head==rear ) {
			System.out.print(head.val);
			return;
	}
		while(head!=null) {
			if(head.next==front) {
				System.out.println(head.val);
				return;
			}
			System.out.println(head.val);
			head=head.next;
		}
	}//O(N)
//	
//	void printQueue() {
//	    if (front == null) {
//	        System.out.println("Queue is empty.");
//	        return;
//	    }
//	    Node<T> head = front;
//	    // Since it's circular, use a do-while loop to ensure we print all nodes
//	    do {
//	        System.out.println(head.val);
//	        head = head.next;
//	    } while (head != front);
//	}


}
