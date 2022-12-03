package q4b;

public class GarageGateClose implements Command {

	private GarageGate g;
	
	public GarageGateClose(GarageGate g) {
		super();
		this.g = g;
	}
	@Override
	public void execute() {
		g.Close();

	}

}
