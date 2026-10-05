package linkedList;

public class userOfLinkedList {
	
	
	
	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		
//		ll.insertFirst(12);
//		ll.insertFirst(34);
//		ll.insertLast(56);
//		ll.insertLast(89);
//		ll.insertLast(39);
//		ll.insertLast(85);
//		ll.insertLast(865);
		
//		ll.display();
		
//		ll.deleteFirst();
//		ll.deleteLast();
//		ll.deleteByPosition(2);
		
//		ll.insertBeforData(47, 56);
//		ll.insertAfterData(47, 89);
//		ll.insertAtPosition(79, 4);
		
//		ll.deleteByData(67);
		
//		ll.display();
		
//		ll.reverseLinkedList();
		
//		ll.display();
		
//		System.out.println("Swapping.............");
		
//		ll.swapLinkedList();
		
		for(int i=1; i<18; i++) {
			
			int inn = i*10;
			
			ll.insertLast(inn);
		}

		
		
		ll.display();
		
		System.out.println();
		System.out.println("Reversing the bunch of n - nodes...........\n");
		
		ll.reverseN_BunchOfNodes(3);
		
		
		ll.display();
	}

}
