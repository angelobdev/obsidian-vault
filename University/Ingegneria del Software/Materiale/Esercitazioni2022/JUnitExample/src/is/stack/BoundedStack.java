package is.stack;

public class BoundedStack<E> implements Stack<E> {

	protected Object[] stack = new Object[10]; // default
	protected int cima = 0;

	public BoundedStack(int size) {
		if (size < 0)
			throw new NegativeCapacityException();
		stack = new Object[size];
	}

	public BoundedStack() {
		this(10);
	}

	public boolean empty() {
		return cima == 0;
	}

	@Override
	public void push(E x) {
		if (cima == stack.length)
			throw new FullStackException();
		stack[cima] = x;
		cima++;
	}// push

	@SuppressWarnings("unchecked")
	@Override
	public E top() {
		if (empty())
			throw new EmptyStackException();
		return (E) stack[cima - 1];
	}// top

	@Override
	@SuppressWarnings("unchecked")
	public E pop() {
		if (empty())
			throw new EmptyStackException();
		E x = (E) stack[cima - 1];
		cima--;
		return x;
	}

	@Override
	public boolean full() {
		return cima == stack.length;
	}
}// ArrayStack

