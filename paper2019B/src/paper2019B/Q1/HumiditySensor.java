package paper2019B.Q1;

public class HumiditySensor implements ISensor{
	
	private String name;

	public HumiditySensor(String name) {
		
		this.name = name;
	}

	@Override
	public void on() {
		System.out.println("Humidity sensor on");
		
	}

	@Override
	public void off() {
		System.out.println("Humidity sensor off");
		
	}
	

	
	



}
