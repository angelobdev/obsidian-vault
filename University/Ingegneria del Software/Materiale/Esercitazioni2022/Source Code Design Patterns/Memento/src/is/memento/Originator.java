package is.memento;

public interface Originator {
	Memento createMemento();
	void setMemento(Memento m);
}
