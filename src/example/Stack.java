 package example;

public class Stack<T> {
	T[] stack;
	int top=-1;
	int capacity;

	@SuppressWarnings("unchecked")
	public Stack(int capacity) {
		// TODO Auto-generated constructor stub
		this.capacity=capacity;
		stack=(T[]) new Object[capacity];
	}

	void push(T item) {
		if(top==capacity-1)return;
		stack[++top]=item;
	}
	T pop() {
		if(top==-1)return null;
		T val=stack[top];
		top--;
		return val;
	}
	
	void printvalues() {
		if(top==-1) 
			System.out.println("empty");
		for(int i=0;i<=top;i++)
			System.out.println(stack[i]);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st=new Stack<>(5);
		st.push(1);
		st.push(2);
		st.printvalues();
		st.pop();
		st.printvalues();

	}

}
