package Collections;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortStudent {
	public static void main(String[] args) {
		Comparator c=new NameStd();
		SortedSet student=new TreeSet(c);
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
