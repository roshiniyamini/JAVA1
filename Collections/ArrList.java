package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrList {
	public static void main(String[] args) {
		List names= new ArrayList();
		names.add("roshini");
		names.add("yamini");
		names.add("priya");
		names.add("teja");
		names.add("sneha");
		for (Object str : names) {
			System.out.println(str);
			
		}
		names.add(2,"PRIYANKA");
		System.out.println("names after adding item");
		 for (Object str : names) {
			 System.out.println(str);
			
		}
		 names.set(3, "jana priya");
		 System.out.println("names after editing");
		 for (Object str : names) {
			 System.out.println(str);
			
		}
		 names.remove("PRIYANKA");
		 System.out.println("list after remove ");
		 for (Object str : names) {
			 System.out.println(str);
			
		}
			
		}
			
		}
	


