package re2022Q1;

public class Parrot extends pet {
	private String command;
	
	
	public Parrot(String command) {
		super();
		this.command = command;
	}

	@Override
	public void feed() {
		// TODO Auto-generated method stub
		System.out.println("Feeding the Parrot");
		this.point=point+5;
		

	}

	@Override
	public void clean() {
		// TODO Auto-generated method stub
		System.out.println("Cleaning the Parrot");
		this.point=point+10;
	}

	@Override
	public void cuddle() {
		// TODO Auto-generated method stub
		System.out.println("Cuddleing the Parrot");
		this.point=point+15;
	}

	@Override
	public void GetTotalPoint() {
		// TODO Auto-generated method stub
		if(isCaught()==true) {
			this.point=0;
			
		}
		else {
			System.out.println("Did not caught");
			System.out.println("Total point is "+this.point);
		}

	}
	public boolean isCaught() {
		boolean caught = false;
		if(command.equalsIgnoreCase("walk")) { 
			try {
				CaughtException e = new CaughtException();
				caught = true;
				throw e;
			} catch (CaughtException e) {
				System.out.println( e + ": Caught");
			} 
		}
		return caught;
	}

}
