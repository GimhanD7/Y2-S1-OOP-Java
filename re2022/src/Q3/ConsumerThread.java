package Q3;

import java.util.ArrayList;

public class ConsumerThread extends Thread {
	
	private ArrayList<Integer> queue;

	public ConsumerThread(ArrayList<Integer> queue) {
		super();
		this.queue = queue;
	}
	
	public void run() {
		synchronized (queue) {
			while (true) {
				try {
					sleep(1000);
					System.out.println("Consumer started");
					System.out.println("Consumer thread concumes "+this.queue);
					this.queue.clear();
					System.out.println("Element in queue ="+this.queue);
					queue.notify();
					queue.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	
}
