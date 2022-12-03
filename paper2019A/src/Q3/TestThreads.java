package Q3;

public class TestThreads {
	

		public static void main(String[] args) throws InterruptedException {

			Object lock = new Object();
			
			Thread threadPlus = new Thread(new PlusThread(lock, 2, 10));
			Thread threadMultiply = new  Thread(new MulyiplyThread(lock, 2, 10));
			
			threadPlus.start();
	
			threadMultiply.start();
			
		}

	
}
