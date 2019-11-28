package com.hcl.anonymous;
class Mult{
	synchronized void show(int n){
		int p;
		for(int i=1;i<=10;i++){
			p=n*i;
			System.out.println(n+"*"+i+ "=" +p);
		}
	}
}

public class MulDemo {
	public static void main(String[] args) {
		Mult obj=new Mult();
		Thread t1=new Thread(){
			public void run() {
				obj.show(4);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		
	};
	Thread t2=new Thread(){
		public void run() {
			obj.show(6);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	
};
t1.start();
t2.start();
	
	}

}
