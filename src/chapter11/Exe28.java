package chapter11;

import java.util.PriorityQueue;
import java.util.Random;

public class Exe28 {
	public static void main(String[] args) {
		PriorityQueue<Double> priorityQueue = new PriorityQueue<Double>();
		Random random = new Random(100);
		for(int i=0;i<10;i++) {
			priorityQueue.offer(random.nextDouble());
		}
		while(priorityQueue.peek() != null) {
			System.out.println(priorityQueue.poll());
		}
	}
}
