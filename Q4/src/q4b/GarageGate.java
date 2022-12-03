package q4b;

public class GarageGate {
	private String description;

	public GarageGate(String description) {
		super();
		this.description = description;
	}
	public void Open() {
		System.out.println(description+" Openning");
	}
	public void Close() {
		System.out.println(description+"Closing");
	}
}
