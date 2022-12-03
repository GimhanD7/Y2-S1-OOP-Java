package Q3;

public class PlusThread implements Runnable {
	
	private Object lock;
	private int start; 
	private int range;
	
	

	public PlusThread(Object lock, int start, int range) {
		super();
		this.lock = lock;
		this.start = start;
		this.range = range;
	}

	public void addNumber(Object lock, int start, int range)  {
		synchronized (lock) {
			for (int i = start; i < range; i++) {
				try {
					lock.notify();
					
					lock.wait();
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println( Thread.currentThread().getName()+" => "+i+"+"+i+"="+(i+i));
			}
		}
	}


	
	public void run() {
		addNumber(lock, start, range);

	}

}
