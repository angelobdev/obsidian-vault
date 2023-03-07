package is.strategy;

public class SortingContext {
	//Context
	
	private SortingStrategy strategy;

	/*
	 * Il particolare oggetto che incapsula la procedura di stampa scelta, viene
	 * settato tramite il metodo setSortingMethod
	 */
	public void setSortingMethod(SortingStrategy strategy) {
		this.strategy = strategy;
	}

	public SortingStrategy getStrategy() {
		return strategy;
	}

	/*
	 * La modalità di ordinamento rimane a carico di oggetti che implementano
	 * l'interfaccia SortingStrategy
	 */
	public void sortNumbers(int[] v) {
		strategy.sort(v);

	}
}
