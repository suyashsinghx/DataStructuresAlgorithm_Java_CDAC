package studentStack;

public class StudStack {

	Student arr[];
	int top;
	
	public StudStack() {
		arr = new Student[10];
		top = -1;
	}
	
	public StudStack(int len) {
		arr = new Student[len];
		top = -1;
	}
	
	public boolean isFull() {
		if(top == arr.length-1) {
			System.out.println("Stack Overflow");
			return true;
		}
		else return false;
	}
	
	public boolean isEmpty() {
		if(top == -1) {
			System.out.println("Stack Underflow");
			return true;
		}
		else return false;
	}
	
	public void push(Student st) {
		if(isFull()) {System.out.println("stack overflow"); return;}
		top ++;
		arr[top] = st;
		return;
	}
	
	public Student pop() {
		if(isEmpty()) {System.out.println("stack underflow"); return null;}
		Student demo = arr[top];
		top = top -1;
		return demo;
	}
	
	public Student peek() {
		if(isEmpty()) {System.out.println("No Elements in Stack"); return null;}
		return arr[top];
	}
	
}
