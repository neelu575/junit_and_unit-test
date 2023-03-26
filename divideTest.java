package testing;

import static org.junit.Assert.*;

import org.junit.Test;

class divideTest {

	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		double output = test.divide(4, 2);
		assertEquals(2,output);
		double output2 = test.divide(10, 2);
		assertEquals(5,output2);
	}
	 
	@Test
	   public void testFail() {
		 JunitTesting test = new JunitTesting();
			double output = test.divide(26, 2);
	      assertNotEquals(13,output);
	   }

}

