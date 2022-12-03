package re2022Q1;

public class myMain {

	public static void main(String[] args) {
		pet squirrell = new Squirrel("Run3");
		squirrell.cuddle();
		squirrell.feed();
		squirrell.GetTotalPoint();
		
		pet squirrel2 = new Squirrel("Run5");
		squirrel2.cuddle( ) ;
		squirrel2.feed( ) ;
		squirrel2.GetTotalPoint ( ) ;
		
		pet garfield  = new Cat();
		garfield.clean();
		garfield.cuddle();
		garfield.feed();
		garfield.GetTotalPoint();
		
		pet parrotl  =new Parrot("walk");
		parrotl.feed();
		parrotl.GetTotalPoint();
	}

}
