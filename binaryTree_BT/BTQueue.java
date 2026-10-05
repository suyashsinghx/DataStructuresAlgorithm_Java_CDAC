package binaryTree_BT;

public class BTQueue {
	
	private BTNode arr[];
	private int front, rear;

	public BTQueue() {
		arr = new BTNode[20];
		front = rear = -1;
	}
	
	public BTQueue(int size) {
		arr = new BTNode[size];
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
	
	public void insert(BTNode d) {
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
	
	public BTNode delete() {
		if(isEmpty()) {
			System.out.println("no elements in queue");
			return null;
		}
		
		BTNode d = arr[front];
		
		if(front == rear) {
			front = rear = -1;
		}
		
		else if(front == arr.length -1) {
			front =0;
		}
		else front++;
		
		return d;
		
	}
	
}
