package Collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortDemo {
	public static void main(String[] args) {
		SortedSet s=new TreeSet();
		s.add("teja");
		s.add("roshini");
		s.add("yamini");
		s.add("valli");
		s.add("sneha");
		s.add("priya");
		for (Object obj : s) {
			System.out.println(obj);
			
		}
	}

}
