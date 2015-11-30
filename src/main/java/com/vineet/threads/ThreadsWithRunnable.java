/**
 * 
 */
package com.vineet.threads;

/**
 * @author Vineet Kumar
 *
 */
public class ThreadsWithRunnable implements Runnable {

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// Threads are in running state

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

		// New State
		Thread thread1 = new Thread(new ThreadsWithRunnable());
		Thread thread2 = new Thread(new ThreadsWithRunnable());
		// Runnable state
		thread1.start();
		thread2.start();

	}

}
