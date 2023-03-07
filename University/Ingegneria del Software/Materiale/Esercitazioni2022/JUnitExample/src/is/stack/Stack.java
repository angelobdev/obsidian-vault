package is.stack;

public interface Stack<E> {

	boolean empty();

	boolean full();

	void push(E x);

	E top();

	E pop();
}// Stack

