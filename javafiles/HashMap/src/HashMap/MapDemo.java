package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapDemo {
	public static void main(String[] args) {
        Map names=new HashMap();
        names.put("1", "Roshini");
        names.put("2", "Yamini");
        names.put("3", "Priya");
        names.put("4", "Teja");
        names.put("5", "Srivalli");
        String key,value;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Key");
        key=sc.nextLine();
        value=(String)names.getOrDefault(key, "Not Found");
        System.out.println(value);
	}

}
