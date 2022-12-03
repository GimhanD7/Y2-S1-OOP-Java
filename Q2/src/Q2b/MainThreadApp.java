package Q2b;

public class MainThreadApp {

	public static void main(String[] args) throws InterruptedException {
		Calculation cal =new Calculation();
		Thread t1=new Thread(new PaaralleThread(cal, 1, 10));
		Thread t2=new Thread(new PaaralleThread(cal, 11, 20));
		Thread t3=new Thread(new PaaralleThread(cal, 21, 30));
		Thread t4=new Thread(new PaaralleThread(cal, 31, 40));
		
		t1.start();
		t1.join();
		
		t2.start();
		t2.join();
		
		t3.start();
		t3.join();
		
		t4.start();
		t4.join();
		
		System.out.println("Factorial of 40 : "+cal.getAns());
	}

}
