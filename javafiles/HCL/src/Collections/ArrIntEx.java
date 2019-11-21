package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrIntEx {
	public static void main(String[] args) {
		List num=new ArrayList();
		num.add(new Integer(56));
		num.add(new Integer(70));
		num.add(new Integer(89));
		num.add(new Integer(78));
		int sum=0;
		for (Object obj : num) {
			sum=sum+(Integer)obj;
			
		}
		System.out.println("sum is "+sum);
		
		
		
	}
	

}
