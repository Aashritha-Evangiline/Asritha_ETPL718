package com.evergent.corejava.multithreading;
//index 16
class MyClass2 implements Runnable{

	@Override
	public void run() {
		for(int i=1; i<=10;i++) {
			System.out.println(i*10);
		}	
	}
	
}

public class ThreadDemo2 {

	public static void main(String[] args) {
		MyClass2 obj = new MyClass2();
		Thread thread1 = new Thread(obj);
		thread1.start();
	}

}
