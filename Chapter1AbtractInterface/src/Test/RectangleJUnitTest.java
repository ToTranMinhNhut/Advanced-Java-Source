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

import Shape.Rectangle;

/**
 * @author hv
 * @version 1.0
 * @date 23/8/2016
 * 
 * JUnitTest for perimeter() method in Rectangle class
 * Input: not
 * Output: pass
 */
public class RectangleJUnitTest {
	
	Rectangle rec = new Rectangle();
	
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
		double ex = 10;
		
		rec.setHeight(3);
		rec.setWeight(2);
		
		double ac = rec.perimeter();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testPerimeter2() {
		double ex = 12;
		
		rec.setHeight(3);
		rec.setWeight(3);
		
		double ac = rec.perimeter();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testPerimeter3() {
		double ex = 14;
		
		rec.setHeight(4.5);
		rec.setWeight(3);
		
		double ac = rec.perimeter();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void testPerimeter4() {
		double ex = 14;
		
		rec.setHeight(-4);
		rec.setWeight(-3);
		
		double ac = rec.perimeter();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void testArea1() {
		double ex = 12;
		
		rec.setHeight(4);
		rec.setWeight(3);
		
		double ac = rec.area();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testArea2() {
		double ex = 20;
		
		rec.setHeight(4);
		rec.setWeight(5);
		
		double ac = rec.area();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testArea3() {
		double ex = 12;
		
		rec.setHeight(-4);
		rec.setWeight(-3);
		
		double ac = rec.area();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void testArea4() {
		double ex = 13;
		
		rec.setHeight(4.75);
		rec.setWeight(3);
		
		double ac = rec.area();
		assertNotEquals(ex, ac, 0);
	}
}
