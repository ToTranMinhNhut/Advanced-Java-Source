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
	public void testPerimeter1() {
		double ex = 18.84;
		
		c.setR(3);
		
		double ac = c.perimeter();
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testPerimeter2() {
		double ex = 12.56;
		
		c.setR(2);
		
		double ac = c.perimeter();
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testPerimeter3() {
		double ex = 19;
		
		c.setR(3);
		
		double ac = c.perimeter();
		assertNotEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testPerimeter4() {
		double ex = 12;
		
		c.setR(2);
		
		double ac = c.perimeter();
		assertNotEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testArea1() {
		double ex = 12.566;
		
		c.setR(2);
		
		double ac = c.area();
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testArea2() {
		double ex = 28.274;
		
		c.setR(3);
		
		double ac = c.area();
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testArea3() {
		double ex = 13;
		
		c.setR(2);
		
		double ac = c.area();
		assertNotEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testArea4() {
		double ex = 28;
		
		c.setR(3);
		
		double ac = c.area();
		assertNotEquals(ex, ac, 0.01);
	}
}
