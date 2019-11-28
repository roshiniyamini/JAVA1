package HashMap;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortStudent {
	public static void main(String[] args) {
		SortedSet<Student>students=new TreeSet<Student>();
		students.add(new Student(1,"roshini","ongole",8.0));
		students.add(new Student(2,"yamini","nellore",8.5));
		students.add(new Student(3,"priya","chennai",8.6));
		students.add(new Student(4,"teja","hyderbad",9.0));
		students.add(new Student(5,"sneha","delhi",8.9));
		for (Student student : students) {
			System.out.println(student);
			
		}
		
	}

}
