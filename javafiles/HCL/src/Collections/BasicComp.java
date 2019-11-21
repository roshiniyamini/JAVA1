package Collections;

import java.util.Comparator;

public class BasicComp implements Comparator{
	public static void main(String[] args) {
		
	}

	@Override
	public int compare(Object o1, Object o2) {
		Student e1=(Student)o1;
		Student e2=(Student)o2;
		return e1..compareTo(e2.Name);
	}
	

}
