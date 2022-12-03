package q4;

public class toyotaCar implements car {

	carAirBag airbag;
	
	public toyotaCar(carAirBag airbag) {
		super();
		this.airbag = airbag;
	}

	@Override
	public void assembleLight() {
		// TODO Auto-generated method stub
		System.out.println("assembeling for totota");
		airbag.airBagLightIndecator();
	}

	@Override
	public void assembleMotionSensor() {
		// TODO Auto-generated method stub
		System.out.println("assembeling for totota");
		airbag.airBagMotionDetector();

	}

}
