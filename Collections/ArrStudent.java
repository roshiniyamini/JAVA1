package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrStudent {
	public static void main(String[] args) {
		List student=new ArrayList();
		student.add(new Student(1,"roshini","yamini",8.9));
		student.add(new Student(2,"yamini","roshini",7.9));
		student.add(new Student(3,"priya","potla",8.6));
		student.add(new Student(4,"teju","munagapati",9.7));
		student.add(new Student(5,"sri","valli",8.6));
		for (Object obj : student) {
			Student e=(Student)obj;
			System.out.println(e);
	}


}
}