package q2;

import java.util.ArrayList;

public class TCalculation <T extends Number>{
	
	private ArrayList<T> numList =new ArrayList<>();
	public void append(T value ) {
		numList.add(value);
	}
	
	private double avg;

	
	public double Avarage() {
		double tot=0;
		for (T t : numList) {
			tot=tot+t.doubleValue();
		}
		double size=(double) numList.size();
		avg=tot/size;
		return avg;
		
	}
}
