package strategy;

public class Client {
	/**
	 * The Client class encapsulates the strategy object, by encapsulating the
	 * strategy interface the algorithm becomes interchangable within the family.
	 */

	private final Logging logging;

	public Client(Logging logging) {
		this.logging = logging;
	}

	public void doWork(final int count) {
		if (count % 2 == 0) {
			logging.write("Even number: " + count);
		}
	}
}