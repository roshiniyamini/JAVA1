package HashMap;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy {
	public static void main(String[] args) {
		SortedSet<Employ>employs=new TreeSet<Employ>();
		employs.add(new Employ(1,"roshini","a","se",20.3));
		employs.add(new Employ(2,"yamini","b","se",10.3));
		employs.add(new Employ(3,"teja","c","sw",22.3));
		employs.add(new Employ(4,"priya","d","se",23.3));
		employs.add(new Employ(5,"sneha","e","ta",30.3));
		for (Employ employ : employs) {
			System.out.println(employs);
			
		}
	}

}
