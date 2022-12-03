package re2022Q1;

public abstract   class pet implements PointAllocator{
	
	protected double point;
	
	public abstract void feed() ;
	public abstract void clean() ;
	public abstract void cuddle();
	public abstract void GetTotalPoint();
	
	@Override
	public void setPoint(double point) {
		this.point=point;
		
	}
	@Override
	public double getPoint() {
		return this.point;
		
	}



}
