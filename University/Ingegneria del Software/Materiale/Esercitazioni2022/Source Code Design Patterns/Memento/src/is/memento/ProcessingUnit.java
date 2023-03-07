package is.memento;

public class ProcessingUnit implements Originator {
	
	/**
	 * @directed true
	 * @link composition
	 */
	private Accumulator acc = new AccumulatorImpl(0);

	public Memento createMemento() {
		return new AccumulatorImpl(acc);
	}

	public void setMemento(Memento m) {
		acc = (Accumulator)m;		
	}
	
	public void process(Operation op, double val){
		switch (op) {
		case add:
			acc.setValue(acc.getValue()+val);
			break;		
		case sub:
			acc.setValue(acc.getValue()-val);
			break;
		case mul:
			acc.setValue(acc.getValue()*val);
			break;
		case div:
			acc.setValue(acc.getValue()/val);
			break;
		}
	}
	
	public double getCurrentComputationValue(){
		return acc.getValue();
	}
}
