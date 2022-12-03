package new2022.Q1;

public class Squirrel extends Pet {
	private String command;
	

	public Squirrel(String command) {
		super();
		this.command = command;
	}

	@Override
	public void feed() {
		System.out.println("Feeding the Squirrel");
		point=point+5;

	}

	@Override
	public void clian() {
		System.out.println("cleaning the Squirrel");
		point=point+10;
	}

	@Override
	public void cuddle() {
		System.out.println("cuddleing the Squirrel");
		point=point+15;
	}

	@Override
	public void GerTotalPoint() {
		if(isCaught() == true) {
			this.point=0;
		}else {
			System.out.println("did not caught ");

			System.out.println("Total point "+point);

		}

	}
	
	public boolean isCaught() {
		boolean caught =false;
		if(command.equalsIgnoreCase("Run5")) {
			try {
				CaughtException e=new CaughtException(command);
				caught=true;
				throw e;
			}catch(CaughtException e) {
				System.out.println(e+" : Caught");
			}
		}
		return caught;
	}

}
