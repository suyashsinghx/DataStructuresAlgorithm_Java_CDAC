package binaryTree_BT;

public class BinaryTree {

	private BTNode root;
	
	public BinaryTree() {
		root = null;
	}
	
	public BTNode getRoot() {
		return root;
	}
	
	public void setRoot(BTNode root) {
		this.root = root;
	}
	
	public BTNode createNode(int data) {
		return new BTNode(data);
	}
	
	public void insertNode(int data) {		//level wise insertion algorithm
		
		BTNode newNode = new BTNode(data);
		
		if(root == null) {
			root = newNode;
			return;
		}
		
		BTNode itr = root;
		
		BTQueue q = new BTQueue(40);
		
		q.insert(itr);
		
		while(!q.isEmpty()) {
			
			itr = q.delete();
			
			if(itr.getLeft() == null) {
				itr.setLeft(newNode);
				return;
			}
			else q.insert(itr.getLeft());
			
			if(itr.getRight() == null) {
				itr.setRight(newNode);return;
			}
			else q.insert(itr.getRight());
		}
			
	}
	
	public void preOrder(BTNode root) {
		
		if(root == null) {
			return;
		}
		
		System.out.print(root.getData() + " ");
		
		preOrder(root.getLeft());
		
		preOrder(root.getRight());

	}
	
	public void display() {
		
		if(root == null) {
			System.out.println("Empty Binary Tree..");
			return;
		}
		
		BTNode itr= root;
		BTQueue q = new BTQueue(40);
		
		q.insert(itr);
		
		while(!q.isEmpty()) {
			
			itr = q.delete();
			
			System.out.print(itr.getData() + " ");
			
			if(itr.getLeft() != null) {
				q.insert(itr.getLeft());
			}
			
			if(itr.getRight() != null) {
				q.insert(itr.getRight());
			}
			
		}
		
	}
	
	
	public int countLeafNodes() {
		
		if(root == null) {
			System.out.println("Empty Tree..");
			return -1;
		}
		
		BTNode itr = root;
		BTQueue q = new BTQueue();
		
		int count =0;
		
		q.insert(itr);
		
		while(!q.isEmpty()) {
			
			itr = q.delete();
			
			if(itr.getLeft() != null) {
				q.insert(itr.getLeft());
			}
			
			if(itr.getRight() != null) {
				q.insert(itr.getRight());
			}
			
			if(itr.getLeft() == null && itr.getRight() == null) {
				count++;
			}
			
		}
		
		return count;
		
	}
	
	public int sumOfLeafNodes() {
		
		if(root == null) {
			System.out.println("Empty Tree..");
			return 0;
		}
		
		int sum=0;
		
		BTNode itr = root;
		
		BTQueue q = new BTQueue();
		
		q.insert(itr);
		
		while(!q.isEmpty()) {
			
			itr = q.delete();
			
			if(itr.getLeft() != null) q.insert(itr.getLeft());
			
			if(itr.getRight() != null) q.insert(itr.getRight());
			
			if(itr.getLeft() == null && itr.getRight() == null) {
				sum += itr.getData();
			}
		}
		
		return sum;
	}
	
public int sumOfNon_LeafNodes() {
		
		if(root == null) {
			System.out.println("Empty Tree..");
			return 0;
		}
		
		int sum=0;
		
		BTNode itr = root;
		
		BTQueue q = new BTQueue();
		
		q.insert(itr);
		
		while(!q.isEmpty()) {
			
			itr = q.delete();
			
			if(itr.getLeft() != null) q.insert(itr.getLeft());
			
			if(itr.getRight() != null) q.insert(itr.getRight());
			
			if(itr.getLeft() != null || itr.getRight() != null) {
				sum += itr.getData();
//				System.out.println(itr.getData());
			}
		}
		
		return sum;
	}

	public int findMinNode() {
		
		if(root == null) {
			System.out.println("Empty Tree");
			return 0;
		}
		
		BTNode itr = root;
		int min = 99999;
		
		BTQueue q = new BTQueue();
		
		q.insert(itr);
		
		while(!q.isEmpty()) {
			
			itr = q.delete();
			
			if(itr.getLeft() != null)	q.insert(itr.getLeft());
			
			if(itr.getRight() != null)  q.insert(itr.getRight());
			
			if(itr.getData()  < min) {
				min = itr.getData();
			}
		}
		
		return min;
		
	}
	
public int findMaxNode() {
		
		if(root == null) {
			System.out.println("Empty Tree");
			return 0;
		}
		
		BTNode itr = root;
		int max = -9999;
		
		BTQueue q = new BTQueue();
		
		q.insert(itr);
		
		while(!q.isEmpty()) {
			
			itr = q.delete();
			
			if(itr.getLeft() != null)	q.insert(itr.getLeft());
			
			if(itr.getRight() != null)  q.insert(itr.getRight());
			
			if(itr.getData()  > max) {
				max = itr.getData();
			}
		}
		
		return max;
		
	}

	public void printEvenNodes() {
		
		if(root == null) {
			System.out.println("Empty Tree");
			return;
		}
		
		BTNode itr = root;
		
		BTQueue q = new BTQueue();
		
		q.insert(itr);
		
		while(!q.isEmpty()) {
			
			itr = q.delete();
			
			if(itr.getLeft() != null) {
				q.insert(itr.getLeft());
			}
			
			if(itr.getRight() != null) {
				q.insert(itr.getRight());
			}
			
			if(itr.getData() % 2 == 0) {
				System.out.print(itr.getData() + " ");
			}
			
		}
		System.out.println();
	}
		
		
		public void printOddNodes() {
			
			if(root == null) {
				System.out.println("Empty Tree");
				return;
			}
			
			BTNode itr = root;
			
			BTQueue q = new BTQueue();
			
			q.insert(itr);
			
			while(!q.isEmpty()) {
				
				itr = q.delete();
				
				if(itr.getLeft() != null) {
					q.insert(itr.getLeft());
				}
				
				if(itr.getRight() != null) {
					q.insert(itr.getRight());
				}
				
				if(itr.getData() % 2 != 0) {
					System.out.print(itr.getData() + " ");
				}
				
			}
			System.out.println();
	}
		
static boolean isIdentical(BinaryTree t1, BinaryTree t2) {
			
			if(t1.getRoot() == null || t2.getRoot() == null) {
				System.out.println("Tree is Empty..");
				return false;
			}
			
			BTNode itr1 = t1.getRoot();
			BTNode itr2 = t2.getRoot();
			
			BTQueue q1 = new BTQueue();		q1.insert(itr1);
			BTQueue q2 = new BTQueue();		q2.insert(t2.getRoot());
			
			while(!q1.isEmpty() && !q2.isEmpty()) {
				itr1 = q1.delete();
				itr2 = q2.delete();
				
				if(itr1.getData() != itr2.getData()) {
//					System.out.println("itr1 data: "+itr1.getData());
//					System.out.println("itr2 data: "+itr2.getData());
					return false;
				}
				
				if(itr1.getLeft() != null) {
					q1.insert(itr1.getLeft());
				}
				if(itr1.getRight() != null) {
					q1.insert(itr1.getRight());
				}
				
				if(itr2.getLeft() != null) {
					q2.insert(itr2.getLeft());
				}
				if(itr2.getRight() != null) {
					q2.insert(itr2.getRight());
				}
				
			}
			
			if(q1.isEmpty() && q2.isEmpty()) {
				return true;
			}
			else
				return false;
			
		}
	
}
