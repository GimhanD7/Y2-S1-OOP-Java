package paper2019B.Q1;

public class SensorLocation implements IMontionTracker{
	private String  location;
	

	public SensorLocation(String location) {
		super();
		this.location = location;
	}


	@Override
	public void displayLocation(){
		
		System.out.println("Sensor Location is = "+this.location);
		
	}
	

}
