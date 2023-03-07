package facade;

import facade.system.AirFlowController;
import facade.system.CatalyticConverter;
import facade.system.CoolingController;
import facade.system.FuelInjector;
import facade.system.Starter;

public class CarEngineFacade {
	//Fa�ade
	
	private static final Integer DEFAULT_COOLING_TEMP = 90;
	private static final Integer MAX_ALLOWED_TEMP = 50;
	
	private FuelInjector fuelInjector = new FuelInjector();
	private AirFlowController airFlowController = new AirFlowController();
	private Starter starter = new Starter();
	private CoolingController coolingController = new CoolingController();
	private CatalyticConverter catalyticConverter = new CatalyticConverter();

	public void startEngine() {
		fuelInjector.on();
		airFlowController.takeAir();
		fuelInjector.inject();
		starter.start();
		coolingController.setTemperatureUpperLimit(DEFAULT_COOLING_TEMP);
		coolingController.run();
		catalyticConverter.on();
	}

	public void stopEngine() {
		fuelInjector.off();
		catalyticConverter.off();
		coolingController.cool(MAX_ALLOWED_TEMP);
		coolingController.stop();
		airFlowController.off();
	}

}
