package linkedList;

public class LinkedList {

	private intNode head;
	
	public LinkedList() {
		head = null;
	}
	
	public LinkedList(intNode head) {
		this.head = head;
	}
	
	public intNode getHead() {
		return head;
	}
	
	public void insertLast(int value) {
		
		intNode newNode = new intNode(value);		//	first create node:- 	newNode --> |data | next |
		
		if(head == null) {
			head = newNode;
			return;
		}
		
		//if head != null then traverse till get null
		
		intNode itr  = head;
		
		while(itr.getNext() != null) {
			itr = itr.getNext();
		}
		
		//now itr is at position where next is null
		itr.setNext(newNode);
		
		return;
	}
	
	public void insertFirst(int value) {
		
		//step 1:- create node
		intNode newNode = new intNode(value);
		
		if(head == null) {
			head = newNode;
			return;
		}
		
		newNode.setNext(head);
		
		head = newNode;
		
		return;
		
	}
	
	public void display() {
		
		if(head == null) {
			System.out.println("Empty LinkedList");
			return;
		}
		
		intNode itr = head;
		
		while(itr != null) {
			System.out.print(itr.getData() + " -> ");
			itr = itr.getNext();
		}
		System.out.println("null");
	}
	
	public int deleteFirst() {
		
		if(head == null) {
			System.out.println("Empty LinkedList");
			return -1;
		}
		
		intNode toDelete = head;
		
		int d = head.getData();
		
		head = head.getNext();		//change the link
		
		//assign all the live object reference to null, so that garbage collector does its work
		toDelete.setNext(null);
		toDelete = null;
		
		return d;
	}
	
	public void insertAtPosition(int data, int position) {
		
		intNode newNode = new intNode(data);
		
		if(head == null) {
			System.out.println("Empty Linked List!!");
			return;
		}
		if(position == 1) {
			head = newNode;
			return;
		}
		intNode itr = head;
		
		for(int i=1; i<position-1 && itr.getNext() != null; i++) {
			itr = itr.getNext();
		}
		
		newNode.setNext(itr.getNext());
		itr.setNext(newNode);
		return;
	}
	

	
	public int deleteLast() {
		
		if(head == null) {
			System.out.println("Empty Linked List..");
			return -999;
		}
		
		int d;
		
		if(head.getNext() == null) {
			d = head.getData();
			head = null;
			return d;
		}
		
		intNode itr = head;
		
		while(itr.getNext().getNext() != null) {
		
			itr = itr.getNext();
		}
		
		intNode toDelete = itr.getNext();
		d = toDelete.getData();
		
		itr.setNext(null);
		
		toDelete.setNext(null);
		toDelete = null;
		
		return d;
		
	}
	
	
	public int deleteByPosition(int position) {
		
		if(head == null) {
			System.out.println("Empty LinkedList..");
			return -999;
		}
		
		int d;
		
		if(head.getNext() == null) {
			d = head.getData();
			head = null;
			return d;
		}
		
		intNode itr = head;
		
		for(int i=0; (i<position -1) && (itr.getNext() != null); i++ ) {
			itr = itr.getNext();
		}
		
		if(itr.getNext() != null) {
			
			intNode toDelete = itr.getNext();
			
			d = toDelete.getData();
			
			itr.setNext(toDelete.getNext());
			
			toDelete.setNext(null);
			toDelete = null;
			
			return d;
		}
		
		System.out.println("invalid position");
		return -999;
		
	}
	
//	[--] ->  [--] -> [-itr-] -> [-toDel-] -> [--]
	
	public void insertBeforData(int data, int targetData) {
		
		if(head == null) {
			System.out.println("Empty LinkedList");
			return;
		}
		
		intNode newNode = new intNode(data);
		
		if(head.getData() == targetData) {
			newNode.setNext(head);
			head = newNode;
			return;
		}
		
		intNode itr = head;
		
		while(itr.getNext() != null && itr.getNext().getData() != targetData) {
			itr = itr.getNext();
		}
		
		if(itr.getNext() == null) {
			System.out.println("Target Data Not Found!!");
			return;
		}
		
		newNode.setNext(itr.getNext());
		itr.setNext(newNode);
		return;
		
	}
	

	
	public void insertAfterData(int data, int targetData) {
		
		if(head == null) {
			System.out.println("Empty LinkedList");
			return;
		}
		
		intNode newNode = new intNode(data);
		
		if(head.getData() == targetData) {
			newNode.setNext(head.getNext());
			head.setNext(newNode);
			return;
		}
		
		intNode itr = head;
		
		while(itr != null && itr.getData() != targetData) {
			itr = itr.getNext();
		}
		
		if(itr == null) {
			System.out.println("Target Data Not Found!!");
			return;
		}
		
		newNode.setNext(itr.getNext());
		itr.setNext(newNode);
		return;
		
	}
	
	
	public int deleteByData(int targetData) {
		
		if(head == null) {
			System.out.println("Empty Linked List..");
			return -999;
		}
		
		int d;
		
		if(head.getData() == targetData) {
			d = head.getData();
			head = null;
		}
		
		intNode itr = head;
		
		while(itr.getNext() != null && itr.getNext().getData() != targetData) {
			itr = itr.getNext();
		}
		
		if(itr.getNext() == null) {
			System.out.println("Target Not Found..");
			return -999;
		}
		
		intNode toDelete = itr.getNext();
		d = toDelete.getData();
		
		itr.setNext(toDelete.getNext());
		
		toDelete.setNext(null);
		toDelete = null;
		
		return d;
	}
	
//	[--] ->  [--] -> [-itr-] -> [-toDel-] -> [--]
	
	public void reverseLinkedList() {
		
		if(head == null) {
			System.out.println("Empty Linked List..");
			return;
		}
		
		if(head.getNext() == null) {
			return;
		}
		
		intNode prev, curr, next;
		curr = head;
		prev = null;
		
		while(curr != null) {
			
			next = curr.getNext();
			
			curr.setNext(prev);
			prev = curr;
			curr = next;
			
		}
		
		head = prev;
		return;
	}
	
//	Mam given challenge...
	public void swapLinkedList() {
		
		if(head == null) {
			System.out.println("Empty Linked List..");
			return;
		}
		
		if(head.getNext() == null) {
			return;
		}
		
		intNode prev, curr, next, updateHead;
		
		prev = null; curr = head; next = null; updateHead = head.getNext();
		
		do {
			
			next = curr.getNext();
			curr.setNext(next.getNext().getNext());
			
			intNode updateCurr = next.getNext();
			
			next.setNext(curr);

			prev = next;
			curr = updateCurr;
			
		} while(curr.getNext().getNext() != null);
		
		if(curr.getNext().getNext() == null) {
			next = curr.getNext();
			next.setNext(curr);
			curr.setNext(null);
		}
		
		head = updateHead;
		
		return;
	}
	
	
//	mam given challenge
	
	public void reverseN_BunchOfNodes(int n) {
		
		if(head == null) {
			System.out.println("Empty Linked List..");
			return;
		}
		
		intNode backward, forward, prev, curr, next, updateHead;
		
		backward = forward = curr = head;
		prev = next = null;
		
		for(int i=0; i<n-1; i++, forward = forward.getNext());
		
		updateHead = forward;
		
		forward = forward.getNext();
		
		if(forward != null) {
			
			while(curr != null && forward.getNext() != null) {
				
				prev = backward; curr = prev.getNext(); 
				
				int k =0;
				
				backward.setNext(forward);
				
				while(k < n-1) {
					
					next = curr.getNext();
					
					curr.setNext(prev);
					
					prev = curr;	curr = next; 	k++;
					
					if(forward.getNext() != null ) forward = forward.getNext();
					
				}
				
				if(forward.getNext() != null && curr.getNext() != null) {
					
					
					backward.setNext(forward);
					
					forward = forward.getNext();
					
					backward = next;
				}
				
			}
			
			head = updateHead;
			
		}
		
		return;		
		
	}
	
}
