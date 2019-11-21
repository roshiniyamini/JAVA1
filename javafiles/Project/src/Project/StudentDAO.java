package Project;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import com.hcl.project.Customer;

public class StudentDAO {
	static List<Student> lstStudent=null;
	static ResourceBundle rb=null;
	static{
		lstStudent=new ArrayList<Student>();
			rb=ResourceBundle.getBundle("student");
		}
		
	
	public void readStudentFileDao() {
		try {
			FileInputStream fin=new FileInputStream("c:/files/student.txt");
			ObjectInputStream objin=new ObjectInputStream(fin);
			lstStudent =(List<Student>)objin.readObject();
			objin.close();
			fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void writeStudentFileDao() {
		try {
			FileOutputStream fout=new FileOutputStream("c:/files/student.txt");
			ObjectOutputStream objout=new ObjectOutputStream(fout);
			objout.writeObject(lstStudent);
			objout.close();
			fout.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String addStudentDao(Student student){
		lstStudent.add(student);
		return rb.getString("add");
	}
	public List<Student> showStudentDao(){
		return lstStudent;
	}
	public Student searchStudentDao(int sno){
		Student objStudent=null;
		for (Student student : lstStudent) {
			if(student.getSno()==sno){
				objStudent=student;
			}
			
		}
		return objStudent;
	}
	public String deleteStudentDao(int sno){
		String result="";
		Student student=searchStudentDao(sno);
		if(student!=null){
			lstStudent.remove(student);
			result=rb.getString("delete");
			return result;
			
		}else{
			result=rb.getString("notfound");
		}
		return result;
	}
	public String updateStudentDao(Student objStudent){
		Student student=searchStudentDao(objStudent.getSno());
		String result="";
		if(student!=null){
			for (Student s : lstStudent) {
				if(s.getSno()==objStudent.getSno()){
					s.setName(objStudent.getName());
					s.setCity(objStudent.getCity());
					s.setCgp(objStudent.getCgp());
					
					}
			}
		
		result=rb.getString("update");
	} else
	{
		result=rb.getString("not");
	}
		return result;
	

}
}
