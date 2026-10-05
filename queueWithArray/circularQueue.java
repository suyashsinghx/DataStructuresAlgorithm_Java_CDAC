package queueWithArray;

public class circularQueue {

	private int arr[];
	private int front, rear;
	
	public circularQueue() {
		arr = new int[10];
		front = rear = -1;
	}
	
	public circularQueue(int s) {
		arr = new int[s];
		front = rear = -1;
	}
	
	public boolean isFull() {
		if((front == 0 && rear == arr.length -1) || front == rear +1) {
			return true;
		}
		else return false;
	}
	
	public boolean isEmpty() {
		if(front == -1) return true;
		return false;
	}
	
	public void insert(int d) {
		if(isFull()) {
			System.out.println("queue overflow");
			return;
		}
		
		if(front == -1) {
			front =0;
		}
		
		if(rear == arr.length -1) {
		rear = 0;
		}
		
		else rear = rear +1;
	
		arr[rear] = d;
		
	}
	
	public int delete() {
		if(isEmpty()) {
			System.out.println("no elements in queue");
			return -999;
		}
		
		int d = arr[front];
		
		if(front == rear) {
			front = rear = -1;
		}
		
		else if(front == arr.length -1) {
			front =0;
		}
		else front++;
		
		return d;
		
	}
	
	public void display() {
		
		if(isEmpty()) return;
		
		
		int i = front;
		
		while(true)
		{
			
			System.out.print(arr[i] + " -> ");
			
			if(i == rear) break;
			
			i = (i+1) % arr.length;
		}
		
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		
		circularQueue cq = new circularQueue();
		
		cq.insert(12);
		
		cq.insert(34);
		
		cq.insert(54);
		
		cq.insert(83);
		
		cq.display();
		
		cq.delete();
		
		cq.display();
		
	}
	
	
	
}
