package paper2019A;

public class SatelliteCenter {
	private int option;
	
	private ISatellite[] iSatellites;
	private IGeoLocation[] iLocations;

	public SatelliteCenter(int option, ISatellite[] iSatellites, IGeoLocation[] iLocations) {
		super();
		this.option = option;
		this.iSatellites = iSatellites;
		this.iLocations = iLocations;
	}
	
	void startService() {
		if(option ==0)
			iSatellites[0].activate();
		else
			iSatellites[1].deactivate();
	}
	void stopService() {
		if(option ==0)
			iSatellites[0].activate();
		else
			iSatellites[1].deactivate();
	}
	void locationService() {
		if(option ==0)
			iLocations[0].displayLocation();
		else
			iLocations[1].displayLocation();
	}
	
	
			

}
