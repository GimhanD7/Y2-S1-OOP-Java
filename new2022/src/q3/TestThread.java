package q3;

import java.util.ArrayList;

public class TestThread {
	public static void main(String[] args) {
		ArrayList<Integer> queue = new ArrayList<>();
		Thread producer = new Thread(new ProduserThread(queue));
		Thread consumer = new Thread(new ConsumerThread(queue));
		
		producer.start();
		consumer.start();

		System.out.println("Starting");
	}
}
