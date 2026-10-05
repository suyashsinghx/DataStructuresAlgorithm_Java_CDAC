package dataStructureAlgos;

public class intStack {

	private int top;
	private int arr[];
	
	public intStack() {
		arr = new int [10];
		top = -1;
	}
	
	public intStack(int len) {
		arr = new int [len];
		top = -1;
	}
	
//	functions of stack
	
	public boolean isFull() {
		if(top == arr.length -1)
			return true;
		else return false;
	}
	
	public boolean isEmpty() {
		if(top == -1) return true;
		else return false;
	}
	
	public void push(int no) {
//		check condition if space is there to push
		if(isFull()) {
			System.out.println("Stack Overflow.");
			return;
		}
		top ++;
		arr[top] = no;
		return;
	}
	
	public int pop() {
		int d = -999;
		if(isEmpty()) {
			System.out.println("Stack Underflow.");
			return d;
		}
//		agar empty nahi hai
		d = arr[top];
		top = top -1;
		return d;
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack is Empty.");
			return -999;
		}
		return arr[top];
	}
	
	public static void main(String[] args) {
		
		intStack st = new intStack();
		
		st.push(21);
		st.push(34);
		st.push(44);
		st.push(84);
		st.pop();
		System.out.println(st.peek());
	}
	

}


