package HashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductSort {
	public static void main(String[] args) {
		List<Product> list=new ArrayList<Product>();
		list.add(new Product(1,"Samsung A5",17000));
		list.add(new Product(2,"IPhone 6S",65000));
		list.add(new Product(3,"Sony Xperia",25000));
		list.add(new Product(4,"Nokia Lumina",15000));
		list.add(new Product(5,"Lenevo",28000));
		Collections.sort(list,(p1,p2)->{
			return p1.name.compareTo(p2.name);	
		});
		list.forEach(p->{
			System.out.println(p);
		});
	}
}
