package com.hcl.multi;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Vector;

class Thr1 implements Runnable{

	@Override
	public void run() {
		List<String> names=new ArrayList<String>();
		names.add("roshini");
		names.add("yamini");
		names.add("priya");
		names.add("teja");
		names.add("srivalli");
		for (String s : names) {
			System.out.println(s);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
}
class Thr2 implements Runnable{

	@Override
	public void run() {
		SortedSet<String> names=new TreeSet<String>();
		names.add("yamini");
		names.add("roshini");
		names.add("teja");
		names.add("sneha");
		names.add("srivalli");
		for (String s : names) {
			System.out.println(s);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
}
}
class Thr3 implements Runnable{

	@Override
	public void run() {
		Vector<String> names=new Vector<>(3,2);
		names.add("yamini");
		names.add("roshini");
		names.add("teja");
		names.add("sneha");
		names.add("srivalli");
		for (String s : names) {
			System.out.println("Vector "+s);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
public class ThEx {
	public static void main(String[] args) {
		Thr1 th1=new Thr1();
		Thr2 th2=new Thr2();
		Thr3 th3=new Thr3();
		Thread t1=new Thread(th1);
		Thread t2=new Thread(th2);
		Thread t3=new Thread(th3);
		t1.start();
		t2.start();
		t3.start();
		
		
	}
		
		
	}


