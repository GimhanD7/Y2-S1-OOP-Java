package Q3;

import java.util.ArrayList;

public class ProducerThread extends Thread {
	private ArrayList<Integer> queue;

	public ProducerThread(ArrayList<Integer> queue) {
		super();
		this.queue = queue;
	}
	@Override
	public void run() {
		synchronized (queue) {
			int value =0;
			while (true) {
				try {
					sleep(1000);
					System.out.println("producer started" );
					this.queue.add(value+=10);
					System.out.println("producer adding value = "+this.queue+" to Queue");
					queue.wait();
					queue.notify();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
}
