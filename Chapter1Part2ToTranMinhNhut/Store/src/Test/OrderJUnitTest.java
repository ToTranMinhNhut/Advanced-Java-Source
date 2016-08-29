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

import SaleProduct.Books;
import SaleProduct.DetailOrder;
import SaleProduct.Order;

/**
 * JUnit Test for class calPriceOrder() method in Order class
 * Input: nothing
 * Output: pass
 * 
 * @author minhnhutvaio
 * @version 1.0
 * @since 29/8/2016
 */
public class OrderJUnitTest {
	
	public Order order = new Order();
	
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
	public void testCalPriceOrder() {
		double ex = 400;
		order.setInvoice(0);
		
		DetailOrder[] d = new DetailOrder[2];
		Books[] b = new Books[2];
		
		order.setListDetailOrder(d);
		order.setDetailOrderNumber(2);
		
		d[0].setQuatity(2);
		b[0].setPrice(100);
		d[0].setBooks(b[0]);
		
		d[1].setQuatity(1);
		b[1].setPrice(200);
		d[1].setBooks(b[1]);
		
		double ac = order.calPriceOrder();
		assertEquals(ex, ac, 0);
	}

}
