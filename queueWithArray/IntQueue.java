package queueWithArray;

public class IntQueue {

	private int arr[];
	private int front, rear;
	
	public IntQueue() {
		arr = new int[10];
		front = rear = -1;
	}
	
	public IntQueue(int s) {
		arr = new int[s];
		front = rear = -1;
	}
	
	public boolean isFull() {
		if(rear == arr.length -1) {
			return true;
		}
		return false;
	}
	
	public boolean isEmpty() {
		if((front == -1) || (front == rear +1)) {
			return true;
		}
		return false;
	}
	
	public void insert(int d) {
		if(isFull()) {
			System.out.println("queue overflow");
			return;
		}
		if(front == -1) {
			front = front +1;
		}
		rear = rear +1;
		arr[rear] = d;
		return;
	}
	
	public int delete() {
		if(isEmpty()) {
			System.out.println("queue underflow.");
			return -999;
		}
		int d = arr[front];
		front++;
		return d;
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("queue is empty");
			return -999;
		}
		return arr[front];
	}
	
	
	public static void main(String[] args) {
		
		IntQueue q = new IntQueue();
		
		System.out.println(q.isEmpty());
		
		q.insert(20);
		q.insert(30);
		q.insert(45);
		q.insert(65);
		
		System.out.println(q.delete());
		System.out.println(q.peek());
		
	}
}

	

