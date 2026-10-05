package circularLinkedList;

public class CircularLL {

	private intNode last;
	
	public CircularLL() {
		last = null;
	}
	
//	[..] -> [..] -> [..] -> [..] -> [..] -> [..] -> [..] <--last
//	  |______________________________________________|
	
	public void insertFirst(int data) {
		
		intNode newNode = new intNode(data);
		
		if(last == null) {
			last = newNode;
			last.setNext(newNode); 			//circular
			return;
		}
		
		newNode.setNext(last.getNext());
		last.setNext(newNode);
		return;
	}
	
	public void insertLast(int data) {
		
		intNode newNode = new intNode(data);
		
		if(last == null) {
			last = newNode;
			last.setNext(newNode);
			return;
		}
		
		newNode.setNext(last.getNext());
		last.setNext(newNode);
		last = newNode;
		return;
	}
	
//	[..] -> [..] -> [..] -> [..] -> [..] -> [..] -> [..] <--last
//	  |______________________________________________|
	
	public void insertAtPosition(int data, int position) {
		
		intNode newNode = new intNode(data);
		
		if(last == null) {
			if(position != 0 || position != 1) {				
				System.out.println("Empty LinkedList, Inserting at 1st position..");
			}
			last = newNode;
			newNode.setNext(last);
			return;
		}
		
		if(position ==1) {
			insertFirst(data);
			return;
		}
		
		intNode itr = last.getNext();
		
		for(int i=1; (i < position -1) && itr != last.getNext(); i++, itr = itr.getNext());
		
		if(itr != last.getNext()) {
			
			newNode.setNext(itr.getNext());
			itr.setNext(newNode);
			
			return;
		}
	}
	
	
	public void display() {
		
		if(last == null) {
			System.out.println("Empty Circular Linked List..");
			return;
		}
		
		intNode itr = last.getNext();
		
		do {
			System.out.print(itr.getData() + " -> ");
			itr = itr.getNext();
		} while(itr != last.getNext());
		
		return;
	}
	
//	[..] -> [..] -> [..] -> [..] -> [..] -> [..] -> [..] <--last
//	  |______________________________________________|

	public int deleteLast() {
		
		if(last == null) {
			System.out.println("Empty Circular Linked List");
			return -999;
		}
		
		int d;
		
		if(last == last.getNext()) {
			d = last.getData();
			last.setNext(null);
			last = null;
			return d;
		}
		
		intNode itr = last.getNext();
		
		while(itr.getNext() != last) {
			itr = itr.getNext();
		}
		
		intNode toDelete = last;
		
		itr.setNext(last.getNext());
		last = itr;
		
		d = toDelete.getData();
		
		toDelete.setNext(null);
		toDelete = null;
		
		return d;
	}
	
	public int deleteByData() {
		
		
		
		return 0;
	}
	
	
}
