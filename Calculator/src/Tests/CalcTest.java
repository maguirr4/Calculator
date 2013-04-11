/**
 * 
 */
package Tests;

import static org.junit.Assert.*;
import ie.gcd.maths.Calc;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Ronan
 *
 */
public class CalcTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		Calc c = new Calc();
		assertEquals("Answer should == 5",5,c.add(2,3));
	}


}
