package re2022Q1;

public class Cat extends pet {
	public Cat() {
		
	}

	@Override
	public void feed() {
		// TODO Auto-generated method stub
		System.out.println("Feeding the Cat");
		this.point=point+5;

	}

	@Override
	public void clean() {
		// TODO Auto-generated method stub
		System.out.println("Cleaning the Cat");
		this.point=point+10;
	}

	@Override
	public void cuddle() {
		// TODO Auto-generated method stub
		System.out.println("Cuddleing the Cat");
		this.point=point+15;
	}

	@Override
	public void GetTotalPoint() {
		// TODO Auto-generated method stub
		System.out.println("Total point is "+this.point);
		

	}

}
