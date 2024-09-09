package com.evergent.corejava.multithreading;
//index 15
class MyClass extends Thread{
	public void run() { // this method is used to call thread
		for(int i=1;i<=10;i++) {    //No need to call explicitly
			System.out.println(i); // t1.start() automatically this method is called
		}
//		public void run1() {
//			for(int i=1;i<=10;i++) {           // this method is considered
//			  System.out.println("Aashritha"); // as normal method call it explicitly
//			}
	}
}
public class ThreadDemo1 {

	public static void main(String[] args) {
		MyClass t1 = new MyClass();
		t1.setPriority(5);
		t1.start();
		MyClass t2 = new MyClass();
		t2.setPriority(1);
		t2.start();  // call run method like this
		//t2.run1(); (call other methods in thread class like this)
		
		
	}

}
