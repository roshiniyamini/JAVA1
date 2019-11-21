package HashMap;

import java.util.ArrayList;
import java.util.List;

public class LambdalPrd {
	public static void main(String[] args) {
		List<Product> list=new ArrayList<Product>();
		list.add(new Product(1,"Samsung A5",17000));
		list.add(new Product(2,"IPhone 6S",65000));
		list.add(new Product(3,"Sony Xperia",25000));
		list.add(new Product(4,"Nokia Lumina",15000));
		list.add(new Product(5,"Lenevo",28000));
		list.stream().filter(p-> p.name.startsWith("S")).forEach(x->{
			System.out.println(x);
		});
		System.out.println("Max Price Mobile\n-----------");
		Product maxProduct=list.stream().max((p1,p2)->p1.price>=p2.price?1:-1).get();
		System.out.println(maxProduct);
		System.out.println("Min Price Mobile\n-----------");
		Product minProduct=list.stream().min((p1,p2)->p1.price>=p2.price?1:-1).get();
		System.out.println(minProduct);
				
	}
}
