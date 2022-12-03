package q4;

public class demo {
	public static void main(String[] args) {
		FrontAirBag fAirBag = new FrontAirBag();
		carAirBag sAirBag = new SideAirBag();
		
		new nissancar(fAirBag).assembleLight();
		new nissancar(fAirBag).assembleMotionSensor();
		new nissancar(sAirBag).assembleMotionSensor();
		
		new toyotaCar(fAirBag).assembleLight();
		new toyotaCar(fAirBag).assembleMotionSensor();
		new toyotaCar(sAirBag).assembleLight();
		new toyotaCar(sAirBag).assembleMotionSensor();
	}
}
