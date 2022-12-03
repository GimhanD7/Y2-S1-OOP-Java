package q3;


import java.util.ArrayList;

public class ProduserThread extends Thread {

	private ArrayList<Integer> queue;

	public ProduserThread(ArrayList<Integer> queue) {
		super();
		this.queue = queue;
	}
	
	public void run() {
		synchronized (queue) {
			int value = 0;
			while(true) {
				try {
					sleep(1000);
					System.out.println("Producer started");
					this.queue.add(value+=10);
					System.out.println("Producer adding value = "+ this.queue + " to Queue");
					queue.wait();
					queue.notify();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}}
		}
	}
	
}
