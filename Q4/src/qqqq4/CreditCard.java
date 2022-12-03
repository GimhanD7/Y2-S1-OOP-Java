package qqqq4;

public class CreditCard {
	public static CreditCard card=null;

	public CreditCard() {
		super();
		
	}
	
	public static CreditCard getObject() {
		
		if(card==null) {
			card=new CreditCard();
			System.out.println("new Object");
		}
		else {
			System.out.println("Returning");
		}
		return card;
		
	}
	public boolean validate(String cardNo,int code) {
		int reminder=code%3;
		
//		if(cardNo.length()==16 && reminder==0) {
//			return true;
//		}
//		else {
//			return false;
//		}
		return (cardNo.length()==16 && reminder==0);
	}
	
	
	
}
