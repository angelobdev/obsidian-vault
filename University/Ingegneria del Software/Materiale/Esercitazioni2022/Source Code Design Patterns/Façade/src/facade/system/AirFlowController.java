package facade.system;

public class AirFlowController {
	//Subsystem
	
	private AirFlowMeter airFlowMeter = new AirFlowMeter();

	public void takeAir() {
		airFlowMeter.getMeasurements();
		System.out.println("Air provided!");
	}

	public void off() {
		System.out.println("Air controller switched off.");
	}

}
