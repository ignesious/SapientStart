package com.training.multithreading;

/*
 * https://www.programcreek.com/2011/12/monitors-java-synchronization-mechanism/ 
   http://tutorials.jenkov.com/java-concurrency/race-conditions-and-critical-sections.html
 */
class Shared {

	public synchronized void m1(String ThreadName) {

		System.out.println("Starting by " + ThreadName);
		System.out.println("Execution start m1---------");
		System.out.println("Execution end m1---------");

		System.out.println("End by " + ThreadName);
		m3(ThreadName);
	}

	public synchronized void m2(String ThreadName) {

		System.out.println("Starting by " + ThreadName);
		System.out.println("Execution start m2---------");
		System.out.println("Execution end m2---------");
		System.out.println("End by " + ThreadName);
		m1(ThreadName);
	}

	public synchronized void m3(String ThreadName) {
		System.out.println("Starting by " + ThreadName);
		System.out.println("Executed with------------" + ThreadName);
		System.out.println("End by " + ThreadName);
	}

}

class CustomProcess extends Thread {

	Shared share;

	public CustomProcess(Shared share) {
		// TODO Auto-generated constructor stub

		this.share = share;
		this.setName("ChildThread");
		this.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		share.m3(this.getName());

	}

}

public class RaceCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shared shared = new Shared();
		CustomProcess customeProcess = new CustomProcess(shared);
		/*
		 * try { Thread.sleep(5000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		shared.m2(Thread.currentThread().getName());

	}

}
