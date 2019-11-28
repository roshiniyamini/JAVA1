package HashMap;

public class Student implements Comparable<Student>{
	int sno;
	String name;
	String city;
	double cgp;
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + ", city=" + city + ", cgp=" + cgp + "]";
	}
	public Student(int sno, String name, String city, double cgp) {
		super();
		this.sno = sno;
		this.name = name;
		this.city = city;
		this.cgp = cgp;
	}
	@Override
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		return s.name.compareTo(this.name);
	}
	

}
