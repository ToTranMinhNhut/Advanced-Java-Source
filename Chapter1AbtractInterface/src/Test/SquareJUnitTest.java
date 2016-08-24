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

import Shape.Square;

/**
 * @author hv
 * @version 1.0
 * @date 23/8/2016
 * 
 * JUnitTest for perimeter() method and area() method in Square class
 * Input: not
 * Output: pass
 */
public class SquareJUnitTest {
	
	Square sq = new Square();
	
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
		double ex = 12;
		
		sq.setSide(3);
		
		double ac = sq.perimeter();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testPerimeter2() {
		double ex = 14;
		
		sq.setSide(3.5);
	
		
		double ac = sq.perimeter();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testPerimeter3() {
		double ex = 13.5;
		
		sq.setSide(3.5);
		
		double ac = sq.perimeter();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void testPerimeter4() {
		double ex = 12;
		
		sq.setSide(-3);
		
		double ac = sq.perimeter();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void testArea1() {
		double ex = 16;
		
		sq.setSide(4);
		
		double ac = sq.area();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testArea2() {
		double ex = 36;
		
		sq.setSide(6);
		
		double ac = sq.area();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testArea3() {
		double ex = 16;
		
		sq.setSide(-4);
		
		double ac = sq.area();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void testArea4() {
		double ex = 17;
		
		sq.setSide(4.75);
		
		double ac = sq.area();
		assertNotEquals(ex, ac, 0);
	}
}
	
