package co.edureka.threads;

class MyTask2 extends Thread {
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println(t);
	}
}

public class ThreadTest2 {
	public static void main(String[] args) {
		System.out.println("No of Active Threads = " + Thread.activeCount());
		Thread t = Thread.currentThread();
		System.out.println(t);

		Thread ct = new MyTask2();
		ct.start(); // calls run()

		System.out.println("No of Active Threads = " + Thread.activeCount());
	}
}
