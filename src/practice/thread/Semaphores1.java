package practice.thread;

import java.util.concurrent.Semaphore;

public class Semaphores1 {

	static Semaphore semaphore = new Semaphore(2);
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					semaphore.acquire();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Thread.currentThread().setName("Thread-1");
				for (int i = 0; i < 3; i++) {
					System.out.println(Thread.currentThread().getName()+" COUNT :"+i);
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				semaphore.release();
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					semaphore.acquire();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Thread.currentThread().setName("Thread-2");
				for (int i = 0; i < 3; i++) {
					System.out.println(Thread.currentThread().getName()+" COUNT :"+i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				semaphore.release();
			}
		});

		Thread t3 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					semaphore.acquire();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Thread.currentThread().setName("Thread-3");
				for (int i = 0; i < 3; i++) {
					System.out.println(Thread.currentThread().getName()+" COUNT :"+i);
					try {
						Thread.sleep(4000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				semaphore.release();
			}
		});

		Thread t4 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					semaphore.acquire();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Thread.currentThread().setName("Thread-4");
				for (int i = 0; i < 3; i++) {
					System.out.println(Thread.currentThread().getName()+" COUNT :"+i);
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				semaphore.release();
			}
		});
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		
		
		
	}
}
