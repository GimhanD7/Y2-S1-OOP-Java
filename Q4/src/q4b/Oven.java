package q4b;

public class Oven {
	
	private String name;

	public Oven(String name) {
		super();
		this.name = name;
	}
	
	public void On() {
		System.out.println(name+"Switch On");
	}
	public void Off() {
		System.out.println(name+"Switch Off");
	}
	
}
