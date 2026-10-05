package dataStructureAlgos;

public class doubleEndedStack {

		private int topA;
		private int topB;
		private int arr[];
		
		public doubleEndedStack() {
			arr = new int [10];
			topA = -1;
			topB = arr.length - 1;
		}
		
		public doubleEndedStack(int len) {
			arr = new int [len];
			topA = -1;
			topB = arr.length - 1;
		}
		
//		functions of stack
		
		public boolean isFull() {
			if(topB - topA == 1) {
				return true;
			}
			else return false;
		}
		
		public boolean isEmptyA() {
			if(topA == -1) {
				return true;
			}
			else return false;
		}
		
		public boolean isEmptyB() {
			if(topB == arr.length ) {
				return true;
			}
			else return false;
		}
		
		public void pushA(int no) {
			if(isFull()) {
				System.out.println("Stack Overflow.");
				return;
			}
			topA++;
			arr[topA] = no;
			return;
		}
		
		public void pushB(int no) {
			if(isFull()) {
				System.out.println("Stack Overflow.");
				return;
			}
			topB--;
			arr[topB] = no;
			return;
		}
		
		public int popA() {
			int d = -999;
			if(isEmptyA()) {
				System.out.println("Stack Underflow;");
				return d;
			}
			d = arr[topA];
			topA--;
			return d;
		}
		
		public int popB() {
			int d = -999;
			if(isEmptyB()) {
				System.out.println("Stack Underflow;");
				return d;
			}
			d = arr[topB];
			topB--;
			return d;
		}
			
		public int peekA() {
			int d = -999;
			if(isEmptyA()) {
				System.out.println("Stack Underflow;");
				return d;
			}
			return arr[topA];
		}
		
		public int peekB() {
			int d = -999;
			if(isEmptyB()) {
				System.out.println("Stack Underflow;");
				return d;
			}
			return arr[topB];
		}
		
		
		public static void main(String[] args) {
			
			doubleEndedStack st = new doubleEndedStack();
			
			st.pushA(21);
			st.pushA(34);
			st.pushB(44);
			st.pushB(84);
			st.popA();
			System.out.println(st.peekA());
			System.out.println(st.peekB());
		}


}
