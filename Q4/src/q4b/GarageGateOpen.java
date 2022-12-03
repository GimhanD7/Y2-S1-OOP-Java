package q4b;

public class GarageGateOpen implements Command {

	private GarageGate g;
	
	public GarageGateOpen(GarageGate g) {
		super();
		this.g = g;
	}

	@Override
	public void execute() {
		g.Open();

	}

}
