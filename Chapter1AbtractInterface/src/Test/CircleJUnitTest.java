/**
 * 
 */
package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Shape.Cirlce;

/**
 * @author hv
 * @version 1.0
 * @date 23/8/2016
 * 
 * JUnitTest for perimeter() method and area() in Cirlce class
 * Input: not
 * Output: pass
 */
public class CircleJUnitTest {
	
	Cirlce c = new Cirlce();
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPerimeter() {
		double ex = 18.84;
		
		c.setR(3);
		
		double ac = c.perimeter();
		assertEquals(ex, ac, 0.01);
	}
	
}
