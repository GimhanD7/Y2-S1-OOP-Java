package paper2019B.Q1;

public class RainFallSensor implements ISensor{

	private String name;

	public RainFallSensor(String name) {
		super();
		this.name = name;
	}

	@Override
	public void on() {
		System.out.println("RainFall sensor on");
		
	}

	@Override
	public void off() {
		System.out.println("RainFall sensor off");
		
	}

}
