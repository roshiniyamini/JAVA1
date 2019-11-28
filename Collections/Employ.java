package Collections;

public class Employ {
	int empno;
	String name;
	double basic;
	
	public Employ(int empno, String namr, double basic) {
		super();
		this.empno = empno;
		this.name = namr;
		this.basic = basic;
	}
	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}
	

}
