package paper2019B.Q1;

public class RemoteController {
	private int Switch;
	
	private ISensor[] iSensor;
	private IMontionTracker[] iMontionTracker;

	public RemoteController(int switch1, ISensor[] iSensor, IMontionTracker[] iMontionTracker) {
		super();
		Switch = switch1;
		this.iSensor = iSensor;
		this.iMontionTracker = iMontionTracker;
	}

	void startService() {
		if(this.Switch==0)
			iSensor[0].on();
		else
			iSensor[1].on();
	}
	
	void stopService() {
		if(this.Switch==0)
			iSensor[0].off();
		else
			iSensor[1].off();
	}
	void locationService() {
		if(this.Switch==0)
			iMontionTracker[0].displayLocation();
		else
			iMontionTracker[1].displayLocation();
	}
	
	
	
	
}
