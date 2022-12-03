package Q2;

import java.util.ArrayList;

public class GenaricPerson {

	public GenaricPerson() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public <T extends IPerson> void displayElement(ArrayList<T> array) {
		for (T t : array) {
			t.displayDetails();
			
		}
		System.out.println();
	}
	
}
