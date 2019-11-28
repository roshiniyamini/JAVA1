package HashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployProduct {
	public static void main(String[] args) {
		List<Employ> list=new ArrayList<Employ>();
		list.add(new Employ(1,"Roshini","a","se",60000));
		list.add(new Employ(2,"yamini","b","se",23045));
		list.add(new Employ(3,"Priya","java","st",25000));
		list.add(new Employ(4,"Teja","d","if",15000));
		list.add(new Employ(5,"Srivalli","java","se",28000));
		list.add(new Employ(6,"Sneha","f","pm",30000));
		Collections.sort(list,(p1,p2)->{
			return p1.name.compareTo(p2.name);
		});
		
		list.forEach(p->{
			System.out.println(p);
		});
		list.stream().filter(p-> p.dept.startsWith("java")).forEach(x->{
			System.out.println(x);
		});
		System.out.println("Maxn basic salarly\n-----------");
		Employ maxEmploy=list.stream().max((p1,p2)->p1.salarly>=p2.salarly?1:-1).get();
		System.out.println(maxEmploy);
		System.out.println("Minn basic salarly\n-----------");
		Employ minEmploy=list.stream().min((p1,p2)->p1.salarly>=p2.salarly?1:-1).get();
		System.out.println(minEmploy);
		list.stream().filter(p-> p.salarly>50000).forEach(x->{
			System.out.println(x);
		});
		
		
	
		
	}

}
