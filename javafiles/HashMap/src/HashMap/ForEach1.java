package HashMap;

import java.util.ArrayList;
import java.util.List;

public class ForEach1 {
	public static void main(String[] args) {
		List<String> names=new ArrayList<String>();
		names.add("roshini");
		names.add("yamini");
		names.add("priya");
		names.add("teja");
		names.forEach(n-> {
		System.out.println(n);	
			
		});
		List<Integer> num=new ArrayList<Integer>();
		num.add(new Integer(67));
		num.add(new Integer(11));
		num.add(new Integer(79));
		num.add(new Integer(55));
		num.add(new Integer(11));
		num.forEach(p-> {
			if(p>50){
				System.out.println(p);
			}
		});
	}

}
