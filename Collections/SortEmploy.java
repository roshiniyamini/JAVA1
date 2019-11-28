package Collections;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy {
	public static void main(String[] args) {
		Comparator c=new NameComparator();
		SortedSet employ=new TreeSet(c);
		employ.add(new Employ(1,"roshini",6879));
		employ.add(new Employ(2,"yamini",76876));
		employ.add(new Employ(3,"priya",16592));
		employ.add(new Employ(4,"teju",97675));
		employ.add(new Employ(5,"valli",62323));
		for (Object obj : employ) {
			Employ e=(Employ)obj;
			System.out.println(e);
	}

}
}
