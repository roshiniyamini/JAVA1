package Java;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Student1 {
	public static void main(String[] args) {
		Student student=new Student(1,"roshini","yamini",8.0);
		FileOutputStream fout;
	    try {
			fout=new FileOutputStream("c:/files/student.txt");
			ObjectOutputStream objout=new ObjectOutputStream(fout);
			objout.writeObject(student);
			objout.close();
			fout.close();
			System.out.println("Student object stored Successfully....");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
