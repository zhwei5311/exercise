package chapter11;

import java.util.PriorityQueue;

public class Exe29 {
	public static void main(String[] args) {
		PriorityQueue<Simple> priorityQueue = new PriorityQueue<>();
		priorityQueue.offer(new Simple());
		priorityQueue.offer(new Simple());
		while(null != priorityQueue.peek()) {
			System.out.println(priorityQueue.poll());
		}
	}
}
