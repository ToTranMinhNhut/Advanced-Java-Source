/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import chapter1part1totranminhnhut.Operator.Operator;

/**
 *
 * @author hv
 * @date: 19/8/2016
 * @version: 1.0
 */
public class OperatorJUnitTest {

    Operator Opt = new Operator();

    public OperatorJUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    /*
     * JUnittest for plus() method in Operator class; 
     * @author hv
     * @date: 19/8/2016
     * @version: 1.0
     * Input: not
     * Output: test passed;
     */
    @Test
    public void testPlus1() {
        double ex = 5;
        Opt.setFirstNumber(2);
        Opt.setSecondNumber(3);
        double ac = Opt.plus();
        assertEquals(ex, ac, 0);
    }
    
    /*
     * JUnittest for plus() method in Operator class; 
     * @author hv
     * @date: 19/8/2016
     * @version: 1.0
     * Input: not
     * Output: test faile;
     */
    @Test
    public void testPlus2() {
        double ex = 4;
        Opt.setFirstNumber(2);
        Opt.setSecondNumber(3);
        double ac = Opt.plus();
        assertEquals(ex, ac, 0);
    }
    
    /*
     * JUnittest for minus() method in Operator class; 
     * @author hv
     * @date: 19/8/2016
     * @version: 1.0
     * Input: not
     * Output: test pass;
     */
    @Test
    public void testMinus1() {
        double ex = -1;
        Opt.setFirstNumber(2);
        Opt.setSecondNumber(3);
        double ac = Opt.minus();
        assertEquals(ex, ac, 0);
    }
    
    /*
     * JUnittest for minus() method in Operator class; 
     * @author hv
     * @date: 19/8/2016
     * @version: 1.0
     * Input: not
     * Output: test faile;
     */
    @Test
    public void testMinus2() {
        double ex = 4;
        Opt.setFirstNumber(2);
        Opt.setSecondNumber(3);
        double ac = Opt.minus();
        assertEquals(ex, ac, 0);
    }
    
    /*
     * JUnittest for product() method in Operator class; 
     * @author hv
     * @date: 19/8/2016
     * @version: 1.0
     * Input: not
     * Output: test pass;
     */
    @Test
    public void testProduct1() {
        double ex = 6;
        Opt.setFirstNumber(2);
        Opt.setSecondNumber(3);
        double ac = Opt.product();
        assertEquals(ex, ac, 0);
    }
    
     /*
     * JUnittest for product() method in Operator class; 
     * @author hv
     * @date: 19/8/2016
     * @version: 1.0
     * Input: not
     * Output: test faile;
     */
    @Test
    public void testProduct2() {
        double ex = 7;
        Opt.setFirstNumber(2);
        Opt.setSecondNumber(3);
        double ac = Opt.product();
        assertEquals(ex, ac, 0);
    }
    
     /*
     * JUnittest for devide() method in Operator class; 
     * @author hv
     * @date: 19/8/2016
     * @version: 1.0
     * Input: not
     * Output: test pass;
     */
    @Test
    public void testDived1() {
        double ex = 1.5;
        Opt.setFirstNumber(3);
        Opt.setSecondNumber(2);
        double ac = Opt.devide();
        assertEquals(ex, ac, 0);
    }
    
     /*
     * JUnittest for devied() method in Operator class; 
     * @author hv
     * @date: 19/8/2016
     * @version: 1.0
     * Input: not
     * Output: test faile;
     */
    @Test
    public void testDevide2() {
        double ex = 1;
        Opt.setFirstNumber(3);
        Opt.setSecondNumber(2);
        double ac = Opt.product();
        assertEquals(ex, ac, 0);
    }
}
