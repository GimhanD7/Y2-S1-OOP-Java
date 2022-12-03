package q4b;

public class OvenOn implements Command {

	private Oven o;
	
	
	public OvenOn(Oven o) {
		super();
		this.o = o;
	}


	@Override
	public void execute() {
		o.On();

	}

}
