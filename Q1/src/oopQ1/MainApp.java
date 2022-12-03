package oopQ1;

import java.util.ArrayList;
import java.util.List;

public class MainApp {

	public static void main(String[] args) {
		ArrayList<Item> arrList =new ArrayList<>();
		Book b1= new Book(1,"book",100.0,"abc","story",120);
		Book b2=new Book(2, "book2", 2000.0, "def", "education", 500);
		
		Car c1 = new Car(3, "car1", 2000000.0, "toyeta","a");
		Car c2 = new Car(4, "car2", 2045004.0, "nizan", "b");
		
		arrList.add(b1);
		arrList.add(b2);
		arrList.add(c1);
		arrList.add(c2);
		
		
		for (Item item : arrList) {
			item.Display();
			System.out.println(     "");
		}
		

	}

}
