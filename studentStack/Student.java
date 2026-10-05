package studentStack;

public class Student {

	int rollNo;
	String name;
	int standard;
	
	public Student() {
		rollNo = -999;
		name = "noName";
		standard = -999;
	}
	
	public Student(int rollNo, String name, int standard) {
		this.rollNo = rollNo;
		this.name = name;
		this.standard = standard;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", standard=" + standard + "]";
	}
	
}




