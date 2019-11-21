package Java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Fil1 {
	public static void main(String[] args) {
		try {
			FileInputStream fin=new
				FileInputStream("C:/javaday4/demo/src/Divex/Custom.java");
			int ch;
			while((ch=fin.read())!=-1){
				System.out.print((char)ch);
				
			}
			fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
