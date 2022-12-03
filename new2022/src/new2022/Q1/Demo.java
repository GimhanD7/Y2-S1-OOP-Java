package new2022.Q1;

public class Demo {
public static void main(String[] args) {
		
		Pet squirrel1  =new Squirrel("Run3");
		squirrel1.cuddle();
		squirrel1.feed();
		squirrel1.GerTotalPoint();
		
		Pet squirrel2  =new Squirrel("Run5");
		squirrel2.cuddle();
		squirrel2.feed();
		squirrel2.GerTotalPoint();
		
		Pet garfield  =new Cat();
		garfield.clian();
		garfield.cuddle();
		garfield.feed();
		garfield.GerTotalPoint();
		
		Pet parrot1  =new Parrot("walk");
		parrot1.feed();
		parrot1.GerTotalPoint();
	}

}
