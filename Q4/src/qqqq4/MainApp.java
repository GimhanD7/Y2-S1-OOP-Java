package qqqq4;

public class MainApp {
	public static void main(String [] args) {
		CreditCard card1=CreditCard.getObject();
		CreditCard card2=CreditCard.getObject();
		
		System.out.println(card1.validate("1111421111121111", 3));
		
	}
}
