package is.stack;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StackTest4 {
	private Stack<Integer> s;

	@BeforeClass
	public static void runOnceBeforeAllTests() {
		
		System.out.println("@BeforeClass");
	}// runOnceBeforeAllTests

	@AfterClass
	public static void runOnceAfterAllTests() {
		
		System.out.println("@AfterClass");
	}// runOnceAfterAllTests

	@Before
	public void runBeforeEachTest() {
		System.out.println("@Before");
		s = new BoundedStack<Integer>(2);
	}// runBeforeEachTest

	@After
	public void runAfterEachTest() {
		System.out.println("@After");
		s = null;
	}// runAfterEachTest

	@Test(expected = NegativeCapacityException.class)
	public void constructor() {// esempio di test negativo
		new ArrayStack<Integer>(-1);
	}// constructor

	@Test
	public void empty() {
		assertThat(s.empty(), is(true));
	}// empty

	@Test(expected = EmptyStackException.class)
	public void popNegativo() {
		s.pop();
	}// popNegativo

	@Test
	public void popPositivo() {
		s.push(10);
		assertThat(s.pop(), is(10));
		assertThat(s.empty(), is(not(false)));
	}// testPopPositivo

	@Test
	public void fullPositivo() {
		s.push(10);
		s.push(20);
		assertThat(s.full(), is(true));
	}// fullPositivo

	@Test(expected = FullStackException.class)
	public void fullNegativo() {
		s.push(10);
		s.push(20);
		s.push(30);
	}// fullNegativo

}
