package Collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		Set s=new HashSet();
		s.add("roshini");
		s.add("yamini");
		s.add("roshini");
		s.add("yamini");
		s.add("roshini");
		s.add("sneha");
		s.add("priya");
		s.add("sai");
		s.add("vali");
		s.add("yamini");
		s.add("roshini");
		s.add("yamini");
		s.add("roshini");
		s.add("yamini");
		s.add("teja");
		s.add("yamini");
		s.add("valli");
		s.add("yamini");
		for (Object obj : s) {
			System.out.println(obj);
			
		}
		
	}

}
