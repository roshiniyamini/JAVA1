package HashMap;

public class EmployEm {
	int empno;
	String name;
	String dept;
	String desig;
	double basic;
	public EmployEm(int empno, String name, String dept, String desig, double basic) {
		super();
		this.empno = empno;
		this.name = name;
		this.dept = dept;
		this.desig = desig;
		this.basic = basic;
	}
	@Override
	public String toString() {
		return "EmployEm [empno=" + empno + ", name=" + name + ", dept=" + dept + ", desig=" + desig + ", basic="
				+ basic + "]";
	}
	

}
