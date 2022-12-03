package q4b;

public class MainApp {

	public static void main(String[] args) {
		MobileUI mobile =new MobileUI();
		
		Oven mainOven =new Oven("mainOven");
		GarageGate garageGate=new GarageGate("garageGate");
		
		Command c1 =new OvenOn(mainOven);
		Command c2 =new OvenOff(mainOven);
		Command c3 =new GarageGateOpen(garageGate);
		Command c4 =new GarageGateClose(garageGate);
		
		
		mobile.setCommand(1, c1);
		mobile.setCommand(2, c2);
		mobile.setCommand(3, c3);
		mobile.setCommand(4, c4);
		
		mobile.commandPress(1);
		mobile.commandPress(2);
		mobile.commandPress(3);
		mobile.commandPress(4);
		

	}

}
