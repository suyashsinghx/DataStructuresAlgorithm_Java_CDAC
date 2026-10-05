package polynomialExpression;

public class PolyLinkedList {

	private PolyNode head;
	
	public PolyLinkedList() {
		head = null;
	}
	
//	getter setters
	public PolyNode getHead() {
		return head;
	}

	public void setHead(PolyNode head) {
		this.head = head;
	}
	
	public void insertPoly(float coefficient, int exponent) {
		
		PolyNode newNode = new PolyNode(coefficient, exponent);
		
		if(head == null) {
			head = newNode;
			return;
		}
		
		if(head.getNext() == null && head.getExpo() < exponent) {
			newNode.setNext(head);
			head = newNode;
			return;
		}
		else if(head.getNext() == null && head.getExpo() > exponent) {
			head.setNext(newNode);
			return;
		}
		
		PolyNode itr = head;
		
		while(itr.getNext().getExpo() > exponent && itr.getNext() != null) {
			itr = itr.getNext();
		}
		
//		only for 1st iteration if pehle hi expo of itr at 1st pos < exponent user provided 
		if(itr.getExpo() < exponent) {
			newNode.setNext(itr);
			head = newNode;
			return;
		}
		
		if(itr.getExpo() >= exponent) {
			newNode.setNext(itr.getNext());
			itr.setNext(newNode);
			return;
		}

	}
	
	public float deleteNode() {
		
		
		
		return 0.0f;
	}
}
