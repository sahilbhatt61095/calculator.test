package mavencalc;

import static org.junit.Assert.*;

import org.junit.Test;

public class Apptest {

	@Test
	public void test() {
		Apptest add = new Apptest();
		int result = add.add(10, 20);
		assertEquals(30, result);
	
	}

}
