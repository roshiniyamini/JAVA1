package HashMap;

import java.util.Comparator;

public class DepComparable implements Comparator{

	@Override
	public int compare(Employ e1, Employ e2) {
		// TODO Auto-generated method stub
		return e1.dept.compareTo(e2.dept);
	}


}
