package debugging;

public class Counter {
	int i=0;
	private int result = 10; //change to 10

	public int getResult() {
		return result;
	}

	public void count() {
		for (i = 0; i < 100; i++)  //show conditional breakpoint result == 10 print i
 			result += i + 1;
	}
}
