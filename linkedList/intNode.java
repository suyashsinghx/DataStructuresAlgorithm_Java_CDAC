package linkedList;

public class intNode {

	private int data;
	private intNode next;
	
	public intNode(){
		data = 0;
		next = null;
	}
	
	public intNode(int data) {
		this.data = data;
		next = null;		//cause we dont know the next node address
	}
	
	public int getData() {
		return data;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public intNode getNext() {
		return next;
	}
	
	public void setNext(intNode next) {
		this.next = next;
	}
	
	//no need to write destructor in java (but write in cpp)
}
