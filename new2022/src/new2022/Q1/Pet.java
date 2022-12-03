package new2022.Q1;

public abstract class Pet implements PointerAllocator {

	@Override
	public void setPoint(double point) {
		// TODO Auto-generated method stub

	}

	@Override
	public double getPoint() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	protected double point;
	
	public abstract void feed();
	public abstract void clian();
	public abstract void cuddle();
	public abstract  void GerTotalPoint();


	
	
	

}
