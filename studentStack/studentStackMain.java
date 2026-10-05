package studentStack;

public class studentStackMain {

	public static void main(String[] args) {
		Student s = new Student(12, "suyash", 9);
		Student s2 = new Student(13, "billy", 89);
		Student s3 = new Student(14, "romie", 95);
		
		StudStack st = new StudStack();
		
		st.push(s);
		st.push(s2);
		st.push(s3);
		
//		System.out.println(st.pop());
		
		System.out.println( st.peek());
		
	}
	
}
