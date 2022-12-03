package Q2b;

public class PaaralleThread implements Runnable {
	private Calculation myCal;
	private int start;
	private int end;
	
	

	public PaaralleThread(Calculation myCal, int start, int end) {
		super();
		this.myCal = myCal;
		this.start = start;
		this.end = end;
	}



	@Override
	public void run() {
		synchronized (this) {
			myCal.Factorial(start, end);
		}
		

	}

}
