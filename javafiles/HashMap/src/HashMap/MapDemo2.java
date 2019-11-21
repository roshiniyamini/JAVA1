package HashMap;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class MapDemo2 {
	public static void main(String[] args) {
		Map<String,Double> m=new Hashtable<String,Double>();
		m.put("Roshini", 655454.67);
		m.put("yamini", 65777.67);
		m.put("Priya", 68886.67);
		m.put("Teja", 335454.67);
		m.put("Srivalli", 12545.67);
		String key;
		double sal;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter key");
		key=sc.nextLine();
		sal=m.getOrDefault(key, 0.0);
		System.out.println("Salarly is  "+sal);
	}

}
