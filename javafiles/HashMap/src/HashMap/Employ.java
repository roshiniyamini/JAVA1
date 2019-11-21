package HashMap;

public class Employ  implements  Comparable<Employ>{
	int empno;
	String name;
	String dept;
	String desig;
	double salarly;
	public Employ(int empno, String name, String dept, String desig, double salarly) {
		super();
		this.empno = empno;
		this.name = name;
		this.dept = dept;
		this.desig = desig;
		this.salarly = salarly;
	}
	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", dept=" + dept + ", desig=" + desig + ", salarly="
				+ salarly + "]";
	}
	@Override
	public int compareTo(Employ s) {
		// TODO Auto-generated method stub
		return s.name.compareTo(this.name);
	}
	
	

}
