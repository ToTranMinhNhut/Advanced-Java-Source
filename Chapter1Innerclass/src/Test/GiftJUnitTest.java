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

import Gift.GiftBox;
import Gift.GiftBox.Gift;


/**
 * @author hv
 * @version 1.0
 * @date 24/8/2016
 */
public class GiftJUnitTest {

    GiftBox.Gift gift = new GiftBox().new Gift();
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
    public void testCalFee1() {
        double ex = 12400;

        gift.setWeight(12);

        double ac = gift.calFee();

        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testCalFee2() {
        double ex = 10400;

        gift.setWeight(2);

        double ac = gift.calFee();

        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testCalFee3() {
        double ex = 10800;

        gift.setWeight(4);

        double ac = gift.calFee();

        assertEquals(ex, ac, 0);
    }
}
