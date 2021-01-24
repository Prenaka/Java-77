package co.edureka.util;

import java.util.PriorityQueue;

public class QueueTest {

	public static void main(String[] args) throws InterruptedException {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		for(int i=10;i>=1;i--) {
			pq.add(i);
		}
		System.out.println(pq);
		
		for(int i=1;i<=10;i++) {
			Integer n = pq.poll();
			System.out.print(n+"   ");
			Thread.sleep(1000);
		}
		System.out.println();
		System.out.println(pq);
	}
}
