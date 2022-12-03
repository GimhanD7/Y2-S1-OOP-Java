package new2022.Q1;

public class Cat extends Pet {

	@Override
	public void feed() {
	
		System.out.println("Feeding the Cat");
		point=point+5;

	}

	@Override
	public void clian() {
		System.out.println("cleaning the Cat");
		point=point+10;
		

	}

	@Override
	public void cuddle() {
		System.out.println("cuddleing the Cat");
		point=point+15;
	}

	@Override
	public void GerTotalPoint() {
		System.out.println("Toltal point is "+point);
		
	}

}
