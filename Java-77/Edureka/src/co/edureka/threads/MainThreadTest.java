package co.edureka.threads;

public class MainThreadTest {

	public static void main(String[] args) {
		System.out.println("No of Active Threads = "+ Thread.activeCount());
		
		Thread t = Thread.currentThread();
		System.out.println(t);
		
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		ThreadGroup tgp = t.getThreadGroup();
		System.out.println(tgp);
		
		t.setName("edureka");
		t.setPriority(9);
		System.out.println(t);
	}
}
