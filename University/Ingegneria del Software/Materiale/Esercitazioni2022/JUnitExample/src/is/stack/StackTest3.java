package is.stack;

import junit.framework.*;
import org.junit.Test;

public class StackTest3 extends TestCase {
	Stack<Integer> s = new BoundedStack<Integer>(5);

	/*
	 * Il metodo setUp è eseguito prima dell'esecuzione di ogni test. Utile per
	 * settare precondizioni comuni a più casi di test
	 */
	public void setUp() { // fixture o ambiente per l'esecuzione dei test
		s = new BoundedStack<Integer>(6);
		System.out.println("Before test");
		// s = new ArrayStack<Integer>(2);
	}// setUp

	/*
	 * Il metodo tearDown è eseguito dopo ogni caso di test. Utile per resettare le
	 * postcondizioni
	 */
	public void tearDown() {
		System.out.println("After test");
	}

	/*
	 * Da notare che il test viene eseguito solo se la precondizione è verificata,
	 * mentre l’After è eseguito in ogni caso.
	 */

	public StackTest3(String nome) {
		super(nome);
	}

	public void testConstructor() {// esempio di test negativo
		try {
			Stack s = new BoundedStack(-1);
			fail("How did you constructed a stack with negative size ?");
		} catch (Throwable e) {
			if (!(e instanceof NegativeCapacityException))
				fail(e + " exception unexpected!");
		}
	}// testConstructor

	public void testEmpty() {
		// if(true) throw new RuntimeException();
		assertTrue(s.empty());
	}// testEmpty

	public void testPopNegativo() {
		try {
			s.pop();
			fail("How did you popped from an empty stack ?");
		} catch (Throwable e) {
			if (!(e instanceof EmptyStackException))
				fail(e + " exception unexpected!");
		}
	}// testPopNegativo

	public void testPopPositivo() {
		s.push(10);
		assertEquals(s.pop(), Integer.valueOf(10));
		assertTrue(s.empty());
	}// testPopPositivo

	public void testFullPositivo() {
		s.push(10);
		s.push(20);
		assertTrue(s.full());
	}// testFullPositivo

	public void testFullNegativo() {
		s.push(10);
		s.push(20);
		try {
			s.push(30);
			fail("How did you pushed on a full stack ?");
		} catch (Throwable e) {
			if (!(e instanceof FullStackException))
				fail(e + " exception unexpected!");
		}
	}// testFullNegativo

}
