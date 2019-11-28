package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrEmploy {
	public static void main(String[] args) {
		List employ=new ArrayList();
		employ.add(new Employ(1,"roshini",76879));
		employ.add(new Employ(2,"yamini",76876));
		employ.add(new Employ(3,"priya",76592));
		employ.add(new Employ(4,"teju",77675));
		employ.add(new Employ(5,"valli",72323));
		for (Object obj : employ) {
			Employ e=(Employ)obj;
			System.out.println(e);
			
		}
	}

}
