package q4;

public class nissancar implements car{
carAirBag airbag;
	
	public nissancar(carAirBag airbag) {
		super();
		this.airbag = airbag;
	}

	@Override
	public void assembleLight() {
		// TODO Auto-generated method stub
		System.out.println("assembeling for nissancar");
		airbag.airBagLightIndecator();
	}

	@Override
	public void assembleMotionSensor() {
		// TODO Auto-generated method stub
		System.out.println("assembeling for nissancar");
		airbag.airBagMotionDetector();

	}
}
