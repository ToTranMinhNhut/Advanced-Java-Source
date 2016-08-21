/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ManagementCD.CD;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import ManagementCD.ListCD;

/**
 * JUnitTest for calPriceOflistCD() method in ListCD class
 *
 * @Input: not
 * @Output: pass
 * @author minhnhutvaio
 * @version 1.0
 * @date 21/8/2016
 */
public class ListCDJUnitTest {

    ListCD l = new ListCD();

    public ListCDJUnitTest() {
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
    @Test
    public void testCalPriceOfListCD1() {
        double ex = 350;
        CD[] cd = new CD[3];

        cd[0] = new CD("", "", "", 0, 100);
        cd[1] = new CD("", "", "", 0, 50);
        cd[2] = new CD("", "", "", 0, 200);

        double ac = l.calPriceOfListCD(cd, 3);

        assertEquals(ex, ac, 0);
    }

    @Test
    public void testCalPriceOfListCD2() {
        double ex = 500;
        CD[] cd = new CD[3];

        cd[0] = new CD("", "", "", 0, 250);
        cd[1] = new CD("", "", "", 0, 50);
        cd[2] = new CD("", "", "", 0, 200);

        double ac = l.calPriceOfListCD(cd, 3);

        assertEquals(ex, ac, 0);
    }

    @Test
    public void testCalPriceOfListCD3() {
        double ex = 100.1;
        CD[] cd = new CD[3];

        cd[0] = new CD("", "", "", 0, 10);
        cd[1] = new CD("", "", "", 0, 50.1);
        cd[2] = new CD("", "", "", 0, 40);

        double ac = l.calPriceOfListCD(cd, 3);

        assertEquals(ex, ac, 0);
    }

    @Test
    public void testCalPriceOfListCD4() {
        double ex = 300;
        CD[] cd = new CD[3];

        cd[0] = new CD("", "", "", 0, 50);
        cd[1] = new CD("", "", "", 0, 50);
        cd[2] = new CD("", "", "", 0, 200);

        double ac = l.calPriceOfListCD(cd, 3);

        assertEquals(ex, ac, 0);
    }

    @Test
    public void testCalPriceOfListCD5() {
        double ex = 3000;
        CD[] cd = new CD[3];

        cd[0] = new CD("", "", "", 0, 1000);
        cd[1] = new CD("", "", "", 0, 500);
        cd[2] = new CD("", "", "", 0, 1500);

        double ac = l.calPriceOfListCD(cd, 3);

        assertEquals(ex, ac, 0);
    }

    @Test
    public void testCalPriceOfListCD6() {
        double ex = 300;
        CD[] cd = new CD[3];

        cd[0] = new CD("", "", "", 0, 100);
        cd[1] = new CD("", "", "", 0, 53);
        cd[2] = new CD("", "", "", 0, 150);

        double ac = l.calPriceOfListCD(cd, 3);

        assertNotEquals(ex, ac, 0);
    }

    @Test
    public void testCalPriceOfListCD7() {
        double ex = 30;
        CD[] cd = new CD[3];

        cd[0] = new CD("", "", "", 0, 0);
        cd[1] = new CD("", "", "", 0, 50);
        cd[2] = new CD("", "", "", 0, 0);

        double ac = l.calPriceOfListCD(cd, 3);

        assertNotEquals(ex, ac, 0);
    }

    @Test
    public void testCalPriceOfListCD8() {
        double ex = 3000;
        CD[] cd = new CD[2];

        cd[0] = new CD("", "", "", 0, 1000);
        cd[1] = new CD("", "", "", 0, 500);

        double ac = l.calPriceOfListCD(cd, 2);

        assertNotEquals(ex, ac, 0);
    }

    @Test
    public void testCalPriceOfListCD9() {
        double ex = 355;
        CD[] cd = new CD[3];

        cd[0] = new CD("", "", "", 0, 100);
        cd[1] = new CD("", "", "", 0, 50);
        cd[2] = new CD("", "", "", 0, 100);

        double ac = l.calPriceOfListCD(cd, 3);

        assertNotEquals(ex, ac, 0);
    }

    @Test
    public void testCalPriceOfListCD10() {
        double ex = 333.3;
        CD[] cd = new CD[3];

        cd[0] = new CD("", "", "", 0, 10.3);
        cd[1] = new CD("", "", "", 0, 50);
        cd[2] = new CD("", "", "", 0, 150);

        double ac = l.calPriceOfListCD(cd, 3);

        assertNotEquals(ex, ac, 0);
    }
}
