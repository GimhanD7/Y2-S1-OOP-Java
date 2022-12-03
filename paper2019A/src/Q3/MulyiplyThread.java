package Q3;

public class MulyiplyThread implements Runnable {

	private Object lock;
	private int start; 
	private int range;
	
	
	
	public MulyiplyThread(Object lock, int start, int range) {
		super();
		this.lock = lock;
		this.start = start;
		this.range = range;
	}

	public void multiplyNumber(Object lock, int start, int range) {
		synchronized (lock) {
			for (int i = start; i < range; i++) {
				try {
					
					
					lock.wait();
					lock.notify();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"  => "+i+"*"+i+"="+(i*i));
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

	@Override
	public void run() {
		multiplyNumber(lock, start, range);

	}

}
