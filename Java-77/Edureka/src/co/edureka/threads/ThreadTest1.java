package co.edureka.threads;
class MyTask1 implements Runnable{
 public void run() {
	 Thread t = Thread.currentThread();
     System.out.println(t);// [Thread-0,5,main]
 }
}

public class ThreadTest1{
  public static void main(String[] args) {
	  System.out.println("No of Active Threads = "+ Thread.activeCount());
	  Thread t = Thread.currentThread();
	  System.out.println(t);// [main,5,main]
	  
	  MyTask1 obj = new MyTask1();
	  Thread ct = new Thread(obj);
	  ct.start();
	  
	  System.out.println("No of Active Threads = "+ Thread.activeCount());
  }
}
