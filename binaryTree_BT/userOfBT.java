package binaryTree_BT;

public class userOfBT {
	
	public static void main(String[] args) {
		
		BinaryTree bt = new BinaryTree();
			
		bt.insertNode(12);
		bt.insertNode(22);
		bt.insertNode(24);
		bt.insertNode(53);
		bt.insertNode(98);
		bt.insertNode(21);
		bt.insertNode(16);
		bt.insertNode(9);
		bt.insertNode(67);
		
		bt.display();
		
		System.out.println();
		
		bt.preOrder(bt.getRoot());
		
		System.out.println();
		
		System.out.println(bt.sumOfLeafNodes());
		
		System.out.println("sum of non leaf:- " + bt.sumOfNon_LeafNodes());
		
		System.out.println("min  leaf node :- " + bt.findMinNode());
		
		System.out.println("max  leaf node :- " + bt.findMaxNode());
		
		bt.printEvenNodes();
		
		BinaryTree t1 = new BinaryTree();
		BinaryTree t2 = new BinaryTree();
		
		for(int i=0; i< 10; i++) {
			t1.insertNode(i*10);
		}
		t1.insertNode(33);
		t1.insertNode(23);
		
		for(int i=0; i< 10; i++) {
			t2.insertNode(i*10);
		}
		t2.insertNode(33);
		t2.insertNode(42);
		t2.insertNode(55);
		
		
		System.out.println("is t1 and t2 identical:- "+ BinaryTree.isIdentical(t1, t2));
		
		
	}

}
