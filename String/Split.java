package String;



public class Split {
	void show(){
	String names="hcl training is boring";
	String[] list=names.split("i");
	for (String string : list) {
		System.out.println(string);
		
	}
	}
	public static void main(String[] args) {
		Split s=new Split();
		s.show();
	
	
	
	

	}

}
