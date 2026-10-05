package dataStructureAlgos;

public class charStack {

	private int top;
	private char arr[];
	
	public charStack() {
		arr = new char [10];
		top = -1;
	}
	
	public charStack(int len) {
		arr = new char [len];
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
	
	public void push(char ch) {
//		check condition if space is there to push
		if(isFull()) {
			System.out.println("Stack Overflow.");
			return;
		}
		top ++;
		arr[top] = ch;
		return;
	}
	
	public char pop() {
		char d = '\0';
		if(isEmpty()) {
			System.out.println("Stack Underflow.");
			return d;
		}
//		agar empty nahi hai
		d = arr[top];
		top = top -1;
		return d;
	}
	
	public char peek() {
		if(isEmpty()) {
			System.out.println("Stack is Empty.");
			return '\n';
		}
		return arr[top];
	}
	
	public static void main(String[] args) {
		
		charStack st = new charStack();
		
		st.push('a');
		st.push('b');
		st.push('c');
		st.push('w');
		st.push('t');
		
		st.pop();
		
		System.out.println(st.peek());
		
	}
}
