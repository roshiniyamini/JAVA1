package Java;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DateInEx1 {
	public static void main(String[] args) {
		try {
			FileInputStream fin=new FileInputStream("c:/files/d1.txt");
			DataInputStream din=new DataInputStream(fin);
			int a=din.readInt();
			int b=din.readInt();
			int c=a+b;
			System.out.println("sum is "+c);
			c=a-b;
			System.out.println("sub is "+c);
			c=a*b;
			System.out.println("mult is "+c);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
