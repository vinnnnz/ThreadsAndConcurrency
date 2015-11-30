/**
 * 
 */
package com.vineet.threads;

/**
 * @author Vineet Kumar
 *
 */
public class ThreadWithThread extends Thread{

	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(3000);

			}
		} catch (InterruptedException exception) {

			exception.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Thread t1 = new ThreadWithThread();
		Thread t2 = new ThreadWithThread();
		
		t1.start();
		t2.start();
	}
}
