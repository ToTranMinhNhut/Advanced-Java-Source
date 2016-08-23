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
import ManagementTransaction.GoldTransaction;

/**
 *
 * @author hv
 * @version 1.0
 * @date 23/8/2016
 * JUnit Test for CalPriceGold() method in GoldTransaction class  
 */
public class GoldTransactionJUnitTest {

    GoldTransaction gt = new GoldTransaction();
    
    public GoldTransactionJUnitTest() {
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

    //TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    
    @Test
    public void testCalPriceGold1() {
        double ex = 13889000;
        gt.setType(10);
        gt.setNumber(1);
        double ac = gt.calPriceGold();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testCalPriceGold12() {
        double ex = 19915000;
        gt.setType(14);
        gt.setNumber(1);
        double ac = gt.calPriceGold();
        assertEquals(ex, ac, 0);
    }
    
    @Test
    public void testCalPriceGold3() {
        double ex = 35141000;
        gt.setType(24);
        gt.setNumber(1);
        double ac = gt.calPriceGold();
        assertEquals(ex, ac, 0);
    }
}
