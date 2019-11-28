package Collections;

public class Student {
	int sno;
	String firstName;
	String lastName;
	double cgp;
	public Student(int sno, String firstNmae, String lastName, double cgp) {
		super();
		this.sno = sno;
		this.firstName = firstNmae;
		this.lastName = lastName;
		this.cgp = cgp;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", firstNmae=" + firstName + ", lastName=" + lastName + ", cgp=" + cgp + "]";
	}
	

}
