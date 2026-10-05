package binarySearchTree;

public class BinarySearchTree {
	
	private BTNode root;
	
	public BinarySearchTree() {
		root = null;
	}
	
	
	
	public BTNode getRoot() {
		return root;
	}



	public void setRoot(BTNode root) {
		this.root = root;
	}



	public BTNode insertBSTbyRecc(BTNode root, int data) {
		
		if(root == null) {
			return new BTNode(data);
		}
		
		if(root.getData() > data) {
//			left
			root.setLeft(insertBSTbyRecc(root.getLeft(), data)); 	//recurssion
		}
		
		else if(root.getData() < data) {
//			right
			root.setRight(insertBSTbyRecc(root.getRight(), data));	//recurssion
		}
		
		else {
			System.out.println("Duplicate value..");
		}
		
		return root;
		
	}
	
	
	public void insertBST(int data) {
		
		root = insertBSTbyRecc(root, data);
		
	}
	
	public void preOrderDisplay() {
		preOderTraversal(root);
	}
	
	private void preOderTraversal(BTNode root) {			// N -> L -> R 

		if(root == null) return;
		
		System.out.print(root.getData() + " ");
		
		preOderTraversal(root.getLeft());
		
		preOderTraversal(root.getRight());
		
	}
	
	public void inOrderDisplay() {
		inOrderTraversal(root);
	}
	
	public void inOrderTraversal(BTNode root) {		//L -> N -> R
		
		if(root == null) return;
		
		inOrderTraversal(root.getLeft());
		
		System.out.print(root.getData() + " ");
		
		inOrderTraversal(root.getRight());
		
	}
	
	public BTNode findMinNode() {
		
		return minNode(root);
	}
	
	public BTNode findMaxNode() {
		
		return maxNode(root);
	}
	
	private BTNode minNode(BTNode root) {
		
		if(root == null) return null;
		
//		if(root.getData() > data) {
//			//left
//			return minNode(root.getLeft(), data);
//		}
//		
//		else if(root.getData() < data) {
//			//right
//			return minNode(root.getRight(), data);
//		}
		
		if(root.getLeft() == null) {
			return root;
		}
		
		return minNode(root.getLeft());
		
	}
	
	private BTNode maxNode(BTNode root) {
		
		if(root == null) return null;
		
		if(root.getRight() == null) {
			return root;
		}
		
		return maxNode(root.getRight());
		
	}
	
	public BTNode search(int data) {
		return bstSearch_recc(root, data);
	}
	
	private BTNode bstSearch_recc(BTNode root, int data) {
		
		if(root == null ) return null;
		
		if(root.getData() > data) {
			//left 
			return bstSearch_recc(root.getLeft(), data);
		}
		
		else if(root.getData() < data) {
			//right
			return bstSearch_recc(root.getRight(), data);
		}
		else
			return root;
		
	}
	
	public int checkHeight() {
		return height_BSTrecc(root);
	}
	
	private int height_BSTrecc(BTNode root) {
		
		int left, right;
		
		if(root == null) {
			return 0;
		}
		
		left = height_BSTrecc(root.getLeft());
		
		right = height_BSTrecc(root.getRight());
		
		if(left > right) {
			return 1 + left;
		}
		else {
			return 1 + right;
		}
	}
	
//	---------------------delete--node---in----bst-----imp-------------------
	
	public BTNode deleteNode(int targetData) {
		return delete_recc(root, targetData);
	}
	
	private BTNode delete_recc(BTNode root, int data) {
		
		//check for the data - reach to the node to delete
		if(root == null) {
			System.out.println("Empty Tree..");
			return null;
		}
		
		if(root.getData() > data) {
			//left
			root.setLeft(delete_recc(root.getLeft(), data));
			
			//yahan return mahi aayega kyuki return caller ko result deta hai but hume toh value set karni hai root ki.. right,left
			//setLeft :- Current node ke left pointer ko update karna:
		}
		
		else if(root.getData() < data) {
			//right
			root.setRight(delete_recc(root.getRight(), data));
		}
		
		else {
			//found the node (equals wala case)..
			BTNode succ;		//declare successor(right node of the delete node)
			
			//case 1: if node has both the child
			if(root.getLeft() != null && root.getRight() != null) {
				
				succ = root.getRight();
				
				//reach to the left-most node
				while(succ.getLeft() != null) {
					succ = succ.getLeft();
				}
				
				//now succ is at the left-most node
				root.setData(succ.getData());
				
				//set the succ to the node (to delete node) that we just overwrite with the leftmost node
				//and delete the leftmost node in the succ wala sub-tree ka branch
				root.setRight(delete_recc(root.getRight(), succ.getData()));
			}
			
			//case 2: if have one child
			//--> has left child
			else if(root.getLeft() != null) {
				root = root.getLeft();
			}
			
			//--> has right child
			else if(root.getRight() != null) {
				root = root.getRight();
			}
			
			//case 3: if  has no child node
			else {
				root = null;
			}
			
		}
		
		return root;
		
	}
	
}
