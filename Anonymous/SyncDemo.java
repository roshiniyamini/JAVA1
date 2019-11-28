package com.hcl.anonymous;
class Demo{
synchronized void dispMsg(String name){
		System.out.println("Hello "+name);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("How are u...");
	}
}

public class SyncDemo {
	public static void main(String[] args) {
		Demo obj=new Demo();
		Thread t1=new Thread(){
			public void run() {
				obj.dispMsg("roshini");
				
			}
		
			};
			Thread t2=new Thread(){
				public void run() {
					obj.dispMsg("yamini");
				}
			};
			t1.start();
			t2.start();
		}
	}

