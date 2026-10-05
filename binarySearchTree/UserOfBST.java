package binarySearchTree;

public class UserOfBST {

	public static void main(String[] args) {
		BinarySearchTree bst =new BinarySearchTree();
		bst.insertBST(23);
		bst.insertBST(35);
		bst.insertBST(42);
		bst.insertBST(21);
		bst.insertBST(62);
		bst.insertBST(63);
		bst.insertBST(38);
		bst.insertBST(22);
		
		System.out.print("\nPre Order Traversal : ");
		bst.preOrderDisplay();
		
		System.out.print("\nInn Order Traversal : ");
		bst.inOrderDisplay();
		
		System.out.println("minimum Node: " + bst.findMinNode().getData());
		
		System.out.println("minimum Node: " + bst.findMaxNode().getData());
		
		System.out.println("search node: " + bst.search(24));
		
		System.out.println("height of bst:- " + bst.checkHeight());
		
		bst.deleteNode(22);
		
		bst.inOrderDisplay();
		
	}
	
}
