package Generics;

import java.util.ArrayList;
import java.util.List;

import Collections.Employ;

public class GenEmploy {
	public static void main(String[] args) {
		List<Employ> employ=new ArrayList<Employ>();
		employ.add(new Employ(1,"roshini",76879));
		employ.add(new Employ(2,"yamini",76876));
		employ.add(new Employ(3,"priya",76592));
		employ.add(new Employ(4,"teju",77675));
		employ.add(new Employ(5,"valli",72323));
		for (Employ em : employ) {
			
			System.out.println(em);
	}

	}
}
