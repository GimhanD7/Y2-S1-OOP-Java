package q2;

public class Demo {

	public static void main(String[] args) {
		TCalculation<Integer> t1=new TCalculation<>();
		TCalculation<Double> t2=new TCalculation<>();
		
		t1.append(45);
		t1.append(45);
		t1.append(45);
		t1.append(45);
		System.out.println(t1.Avarage());
		

		t2.append(45.654);
		t2.append(45.987);
		t2.append(45.325);
		t2.append(45.321);
		System.out.println(t1.Avarage());
	}

}
