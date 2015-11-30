/**
 * 
 */
package com.vineet.threads;

/**
 * @author vineet kumar
 *
 */
public class ThreadsInJava8 {
	
	public static void main(String[] args) {
		
		Runnable task = () -> {
			
			try {
				for (int i = 0; i < 10; i++) {
					System.out.println(Thread.currentThread().getName());
					Thread.sleep(3000);

				}
			} catch (InterruptedException exception) {

				exception.printStackTrace();
			}
		};
		
		Thread t1 = new Thread(task);
		Thread t2 = new Thread(task);
		t1.start();
		t2.start();
	}
	
	
		
}
