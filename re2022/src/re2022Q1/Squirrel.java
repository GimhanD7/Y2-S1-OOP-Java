package re2022Q1;

public class Squirrel extends pet {
	private String command;

	public Squirrel(String command) {
		
		this.command = command;
	}

	@Override
	public void feed() {
		System.out.println("Feeding the Squirrel");
		this.point=point+5;
	}

	@Override
	public void clean() {
		System.out.println("Cleaning the Squirrel");
		this.point=point+10;
	}

	@Override
	public void cuddle() {
		System.out.println("Cuddleing the Squirrel");
		this.point=point+15;
	}

	@Override
	public void GetTotalPoint() {
		if(isCaught() == true) {
			this.point = 0;
		}
		else {
			System.out.println("Did not caught");
			System.out.println("Total point is " + this.point);
		}
	}

	private boolean isCaught() {
		boolean caught = false;
		if(command.equalsIgnoreCase("Run5")) { 
			try {
				CaughtException e = new CaughtException();
				caught = true;
				throw e;
			} catch (CaughtException e) {
				System.out.println( e + " : Caught");
			} 
		}
		return caught;
	}

	
}
