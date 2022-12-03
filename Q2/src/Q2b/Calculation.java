package Q2b;

public class Calculation {
	private double ans=1;

	public double getAns() {
		return ans;
	}
	
	public void Factorial(int start,int end) {
		System.out.println("Comp Start : "+start+"to end : "+end);
		
		for (int i = start; i <= end; i++) {
			ans=ans*(double)i;
		}
	}
	
}
