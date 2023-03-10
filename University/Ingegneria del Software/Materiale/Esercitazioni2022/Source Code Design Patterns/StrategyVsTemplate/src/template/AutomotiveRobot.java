package template;

public class AutomotiveRobot extends RobotTemplate {
	/* 
	 * ConcreteClass
	 * 
	 * Concrete subclass overrides template step methods as required for its use 
	 */
		
	private String name;

	public AutomotiveRobot(String n) {
		name = n;
	}

	@Override
	public void getParts() {
		System.out.println("Getting a carburetor....");
	}

	@Override
	public void assemble() {
		System.out.println("Installing the carburetor....");
	}

	@Override
	public void test() {
		System.out.println("Revving the engine....");
	}

	public String getName() {
		return name;
	}
}
