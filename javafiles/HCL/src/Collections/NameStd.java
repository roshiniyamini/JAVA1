package Collections;

import java.util.Comparator;

public class NameStd implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Student e1=(Student)o1;
		Student e2=(Student)o2;
		return e1.firstName.compareTo(e2.firstName);
		
		
	}
	
	
	

}
